package com.drbotro.ioc;

public class SecretarioEmpleado implements Empleados{

    private static final String TAREA_SECRETARIO_EMPLEADO = "Gestiono la agenda de los jefes";

    private String email;
    private String nombreEmpresa;

    // 2. Creación de campo tipo CreacionInformes (interface)
    private CreacionInformes creacionInforme;

    // 2. Creación de campo tipo CreacionInformes (interface), nombre de este metodo es importante para la configuracion del XML
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
