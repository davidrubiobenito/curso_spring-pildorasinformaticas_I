package com.drbotro.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados{

    private CreacionInfromeFinanciero creacionInfromeFinanciero;

    public ComercialExperimentado(){
    }

    @Autowired
    public ComercialExperimentado(CreacionInfromeFinanciero creacionInfromeFinanciero){
        this.creacionInfromeFinanciero = creacionInfromeFinanciero;
    }

    @Override
    public String getTareas(){
        return "Vender, vender y vender más.";
    }

    @Override
    public String getInforme(){
        return creacionInfromeFinanciero.getInformeFinanciero();
    }

}
