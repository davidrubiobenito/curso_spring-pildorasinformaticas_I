package com.drbotro.annotations;

public class TecnicoFinanciero implements Empleados{

    private CreacionInformeFinanciero creacionInformeFinanciero;

    public TecnicoFinanciero(CreacionInformeFinanciero creacionInformeFinanciero){
        this.creacionInformeFinanciero = creacionInformeFinanciero;
    }

    @Override
    public String getTareas(){
        return "Se encarga de los asientos contables en las operaciones financieras.";
    }

    @Override
    public String getInforme(){
        return creacionInformeFinanciero.getInformeFinanciero();
    }

}
