package com.drbotro.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotations2{

    public static void main(String[] args){

        // 1. Leer la clase de configuración
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

        // 2. Pedir el bean al contenedor de beans
        Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
        Empleados tecnicoEmpleado = contexto.getBean("tecnicoFinanciero", Empleados.class);

        // 3. Utilizar el bean
        System.out.println(empleado.getTareas());
        System.out.println(empleado.getInforme());

        System.out.println(tecnicoEmpleado.getTareas());
        System.out.println(tecnicoEmpleado.getInforme());

        // 4. Cerrar el archivo XML
        contexto.close();

    }

}
