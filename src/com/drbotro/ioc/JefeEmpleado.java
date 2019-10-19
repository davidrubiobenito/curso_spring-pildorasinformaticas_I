package com.drbotro.ioc;

public class JefeEmpleado implements Empleados{

    private static final String TAREA_JEFE_EMPLEADO = "Gestiono las cuestiones relativas a mis empleados de sección";

    public String getTareas(){
        return TAREA_JEFE_EMPLEADO;
    }

}
