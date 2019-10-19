package com.drbotro.ioc;

public class SecretarioEmpleado implements Empleados{

    private static final String TAREA_SECRETARIO_EMPLEADO = "Gestiono la agenda de los jefes";

    @Override
    public String getTareas(){

        return TAREA_SECRETARIO_EMPLEADO;

    }

    @Override
    public String getInforme(){
        // TODO Auto-generated method stub
        return null;
    }

}
