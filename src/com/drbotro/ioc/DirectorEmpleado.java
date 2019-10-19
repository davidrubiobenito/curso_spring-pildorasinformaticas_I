package com.drbotro.ioc;

public class DirectorEmpleado implements Empleados{

    private static final String TAREA_DIRECTOR_EMPLEADO = "Gestiono la plantilla de la empresa";

    // 2. Creación de campo tipo CreacionInformes (interface)
    private CreacionInformes creacionInforme;

    // 2. Creación del contructor que inyecta la dependencia
    public DirectorEmpleado(CreacionInformes creacionInforme){
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

    // método init. Ejecutar tareas antes de que el bean esté disponible.
    public void metodoInicial(){
        System.out.println("Dentro del metodo init. Aquí irian las tareas a ejecutar antes de que el bean este listo.");
    }

    // método destroy. Ejecutar tareas después de que el bean haya sido utilizado.
    public void metodoFinal(){
        System.out.println("Dentro del metodo destroy. Aquí irian las tareas a ejecutar después de utilizar el bean.");
    }

}
