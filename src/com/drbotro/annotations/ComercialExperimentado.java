package com.drbotro.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados{

    // inyeccion dependencias en campo de clase
    @Autowired
    private CreacionInfromeFinanciero creacionInfromeFinanciero;

    // inyecccion dependencia en constructor
    /*@Autowired
    public ComercialExperimentado(CreacionInfromeFinanciero creacionInfromeFinanciero){
        super();
        this.creacionInfromeFinanciero = creacionInfromeFinanciero;
    }*/

    @Override
    public String getTareas(){
        return "Vender, vender y vender m�s.";
    }

    @Override
    public String getInforme(){
        return creacionInfromeFinanciero.getInformeFinanciero();
    }

    // inyecci�n de dependencia setter
    /*@Autowired
    public void setCreacionInfromeFinanciero(CreacionInfromeFinanciero creacionInfromeFinanciero){
        this.creacionInfromeFinanciero = creacionInfromeFinanciero;
    }*/
    
    // inyecci�n de dependencia metodo cualquiera
    /*@Autowired
    public void metodoCualquiera(CreacionInfromeFinanciero creacionInfromeFinanciero){
        this.creacionInfromeFinanciero = creacionInfromeFinanciero;
    }*/

}
