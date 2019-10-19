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

        System.out.println("--------------------------------");

        // 2. Pedir el bean al contenedor de beans
        /**
         * Cambiamos el tipo de Objeto que debe devolver el contenedor de Spring, 
         * para poder acceder a los metodos no solo de la interfaz sino a los getter and setter de la propia clase
         */
        SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
        SecretarioEmpleado pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

        // 3. Utilizar el bean
        System.out.println(maria.getTareas());
        System.out.println(maria.getInforme());
        System.out.println("Email: " + maria.getEmail());
        System.out.println(maria.getNombreEmpresa());
        System.out.println("Email Pablo: " + pablo.getEmail());

        System.out.println("--------------------------------");

        // 2. Pedir el bean al contenedor de beans
        /**
         * Cambiamos el tipo de Objeto que debe devolver el contenedor de Spring, 
         * para poder acceder a los metodos no solo de la interfaz sino a los getter and setter de la propia clase
         */
        JefeEmpleado david = contexto.getBean("miEmpleado", JefeEmpleado.class);

        // 3. Utilizar el bean
        System.out.println(david.getTareas());
        System.out.println(david.getInforme());
        System.out.println("Email: " + david.getEmail());
        System.out.println(david.getNombreEmpresa());

        // 4. Cerrar el archivo XML
        contexto.close();

    }

}
