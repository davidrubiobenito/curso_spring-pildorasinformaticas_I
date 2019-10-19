package com.drbotro.ioc;

public class DirectorEmpleado implements Empleados{

    private static final String TAREA_DIRECTOR_EMPLEADO = "Gestiono la plantilla de la empresa";

    // 2. Creaci�n de campo tipo CreacionInformes (interface)
    private CreacionInformes creacionInforme;

    // 2. Creaci�n del contructor que inyecta la dependencia
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

    // m�todo init. Ejecutar tareas antes de que el bean est� disponible.
    public void metodoInicial(){
        System.out.println("Dentro del metodo init. Aqu� irian las tareas a ejecutar antes de que el bean este listo.");
    }

    // m�todo destroy. Ejecutar tareas despu�s de que el bean haya sido utilizado.
    public void metodoFinal(){
        System.out.println("Dentro del metodo destroy. Aqu� irian las tareas a ejecutar despu�s de utilizar el bean.");
    }

}
