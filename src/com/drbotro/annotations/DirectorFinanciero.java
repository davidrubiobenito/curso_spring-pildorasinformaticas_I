package com.drbotro.annotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados{

    @Value("${email}")
    private String email;
    @Value("${nombreEmpresa}")
    private String nombreEmpresa;

    private CreacionInformeFinanciero creacionInformeFinanciero;

    public DirectorFinanciero(CreacionInformeFinanciero creacionInformeFinanciero){
        this.creacionInformeFinanciero = creacionInformeFinanciero;
    }

    @Override
    public String getTareas(){
        return "Se encarga de la gestión y dirección de las operaciones financieras.";
    }

    @Override
    public String getInforme(){
        return creacionInformeFinanciero.getInformeFinanciero();
    }

    public String getEmail(){
        return email;
    }

    public String getNombreEmpresa(){
        return nombreEmpresa;
    }

}
