package com.drbotro.ioc;

public class DirectorEmpleado implements Empleados{

    private static final String TAREA_DIRECTOR_EMPLEADO = "Gestiono la plantilla de la empresa";

    @Override
    public String getTareas(){

        return TAREA_DIRECTOR_EMPLEADO;

    }

}
