package com.drbotro.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype{

    private static final String MI_SECRETARIO_EMPLEADO = "miSecretarioEmpleado";

    public static void main(String[] args){

        // 1. Cargar el archivo XML
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

        // 2. petición de bean al contenedor
        SecretarioEmpleado maria = contexto.getBean(MI_SECRETARIO_EMPLEADO, SecretarioEmpleado.class);
        SecretarioEmpleado pedro = contexto.getBean(MI_SECRETARIO_EMPLEADO, SecretarioEmpleado.class);
        SecretarioEmpleado david = contexto.getBean(MI_SECRETARIO_EMPLEADO, SecretarioEmpleado.class);
        SecretarioEmpleado ana = contexto.getBean(MI_SECRETARIO_EMPLEADO, SecretarioEmpleado.class);
        SecretarioEmpleado manolo = contexto.getBean(MI_SECRETARIO_EMPLEADO, SecretarioEmpleado.class);

        System.out.println(maria);
        System.out.println(pedro);
        System.out.println(david);
        System.out.println(ana);
        System.out.println(manolo);

        if(maria == pedro){
            System.out.println("Maria y Pedro son los mismos objetos");
        }else{
            System.out.println("No son los mismos objetos");
        }

        // 4. cerrar XML
        contexto.close();

    }

}
