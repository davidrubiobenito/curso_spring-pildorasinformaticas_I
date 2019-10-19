package com.drbotro.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2{

    public static void main(String[] args){

        // 1. Cargar el archivo XML
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext(
                "applicationContextAnnotations.xml");

        // 2. Pedir el bean al contenedor de beans
        Empleados antonio = contexto.getBean("comercialExperimentado", Empleados.class);
        Empleados lucia = contexto.getBean("comercialExperimentado", Empleados.class);

        // 3. Utilizar el bean
        if(antonio == lucia){
            System.out.println("Apuntan a la mismo lugar memoria");
            System.out.println(antonio);
            System.out.println(lucia);
        }else{
            System.out.println("NO apuntan a la mismo lugar memoria");
            System.out.println(antonio);
            System.out.println(lucia);
        }

        // 4. Cerrar el archivo XML
        contexto.close();

    }

}
