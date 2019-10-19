package com.drbotro.ioc;

public class SecretarioEmpleado implements Empleados{

    private static final String TAREA_SECRETARIO_EMPLEADO = "Gestiono la agenda de los jefes";

    // 2. Creación de campo tipo CreacionInformes (interface)
    private CreacionInformes creacionInforme;

    // 2. Creación de campo tipo CreacionInformes (interface)
    public void setCreacionInforme(CreacionInformes creacionInforme){
        this.creacionInforme = creacionInforme;
    }

    @Override
    public String getTareas(){
        return TAREA_SECRETARIO_EMPLEADO;
    }

    @Override
    public String getInforme(){
        return "Informe creado por le Secretario. " + creacionInforme.getInforme();
    }

}
