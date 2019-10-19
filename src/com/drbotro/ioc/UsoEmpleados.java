package com.drbotro.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados{

    public static void main(String[] args){

        // 1. Cargar el archivo XML
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Pedir el bean al contenedor de beans
        Empleados juan = contexto.getBean("miEmpleado", Empleados.class);

        // 3. Utilizar el bean
        System.out.println(juan.getTareas());
        System.out.println(juan.getInforme());

        // 4. Cerrar el archivo XML
        contexto.close();

    }

}
