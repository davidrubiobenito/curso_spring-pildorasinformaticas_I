package com.drbotro.ioc;

public class JefeEmpleado implements Empleados{

    private static final String TAREA_JEFE_EMPLEADO = "Gestiono las cuestiones relativas a mis empleados de secci�n";

    private String email;
    private String nombreEmpresa;

    // 2. Creación de campo tipo CreacionInformes (interface)
    private CreacionInformes creacionInforme;

    // 2. Creación del contructor que inyecta la dependencia
    public JefeEmpleado(CreacionInformes creacionInforme){
        this.creacionInforme = creacionInforme;
    }

    public String getTareas(){
        return TAREA_JEFE_EMPLEADO;
    }

    @Override
    public String getInforme(){
        return "Informe creado por le Jefe con rectificaciones. " + creacionInforme.getInforme();
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getNombreEmpresa(){
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa){
        this.nombreEmpresa = nombreEmpresa;
    }

}
