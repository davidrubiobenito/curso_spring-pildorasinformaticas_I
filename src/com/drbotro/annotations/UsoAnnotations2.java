package com.drbotro.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotations2{

    public static void main(String[] args){

        // 1. Leer la clase de configuración
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

        // 2. Pedir el bean al contenedor de beans
        DirectorFinanciero empleado = contexto.getBean("directorFinanciero", DirectorFinanciero.class);

        // 3. Utilizar el bean
        System.out.println(empleado.getTareas());
        System.out.println(empleado.getInforme());
        System.out.println("Email: " + empleado.getEmail());
        System.out.println("Nombre Empresa: " + empleado.getNombreEmpresa());

        // 4. Cerrar el archivo XML
        contexto.close();

    }

}
