package com.drbotro;

public class UsoEmpleados{

    public static void main(String[] args){

        // Creacion de objetos tipo Empleado
        Empleados empleadoUno = new JefeEmpleado();
        Empleados empleadoDos = new SecretarioEmpleado();
        Empleados empleadoTres = new DirectorEmpleado();

        // Uso de los objetos creados
        System.out.println(empleadoUno.getTareas());
        System.out.println(empleadoDos.getTareas());
        System.out.println(empleadoTres.getTareas());

    }

}
