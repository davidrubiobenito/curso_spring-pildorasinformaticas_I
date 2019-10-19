package com.drbotro.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations{

    public static void main(String[] args){

        // 1. Cargar el archivo XML
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext(
                "applicationContextAnnotations.xml");

        // 2. Pedir el bean al contenedor de beans
        Empleados antonio = contexto.getBean("comercialExperimentado", Empleados.class);

        // 3. Utilizar el bean
        System.out.println(antonio.getInforme());
        System.out.println(antonio.getTareas());

        // 4. Cerrar el archivo XML
        contexto.close();

    }

}
