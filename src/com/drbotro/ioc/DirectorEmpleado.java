package com.drbotro.ioc;

public class DirectorEmpleado implements Empleados{

    private static final String TAREA_DIRECTOR_EMPLEADO = "Gestiono la plantilla de la empresa";

    // 2. Creación de campo tipo CreacionInformes (interface)
    private CreacionInformes creacionInforme;

    // 2. Creación del contructor que inyecta la dependencia
    public DirectorEmpleado(CreacionInformes creacionInforme){
        super();
        this.creacionInforme = creacionInforme;
    }

    @Override
    public String getTareas(){
        return TAREA_DIRECTOR_EMPLEADO;
    }

    @Override
    public String getInforme(){
        return "Informe creado por le Director. " + creacionInforme.getInforme();
    }

}
