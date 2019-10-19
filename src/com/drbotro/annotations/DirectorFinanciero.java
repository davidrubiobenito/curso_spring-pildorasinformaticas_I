package com.drbotro.annotations;

public class DirectorFinanciero implements Empleados{

    private CreacionInformeFinanciero creacionInformeFinanciero;

    public DirectorFinanciero(CreacionInformeFinanciero creacionInformeFinanciero){
        this.creacionInformeFinanciero = creacionInformeFinanciero;
    }

    @Override
    public String getTareas(){
        return "Se encarga de la gesti�n y direcci�n de las operaciones financieras.";
    }

    @Override
    public String getInforme(){
        return creacionInformeFinanciero.getInformeFinanciero();
    }

}
