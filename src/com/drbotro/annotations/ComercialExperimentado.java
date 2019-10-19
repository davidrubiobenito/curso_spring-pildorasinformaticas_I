package com.drbotro.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados{

    // inyeccion dependencias en campo de clase
    @Autowired
    @Qualifier("informeFinancieroTrim4")
    private CreacionInfromeFinanciero creacionInfromeFinanciero;

    // inyecccion dependencia en constructor
    /*@Autowired
    public ComercialExperimentado(CreacionInfromeFinanciero creacionInfromeFinanciero){
        super();
        this.creacionInfromeFinanciero = creacionInfromeFinanciero;
    }*/

    @Override
    public String getTareas(){
        return "Vender, vender y vender más.";
    }

    @Override
    public String getInforme(){
        return creacionInfromeFinanciero.getInformeFinanciero();
    }

    // inyección de dependencia setter
    /*@Autowired
    public void setCreacionInfromeFinanciero(CreacionInfromeFinanciero creacionInfromeFinanciero){
        this.creacionInfromeFinanciero = creacionInfromeFinanciero;
    }*/
    
    // inyección de dependencia metodo cualquiera
    /*@Autowired
    public void metodoCualquiera(CreacionInfromeFinanciero creacionInfromeFinanciero){
        this.creacionInfromeFinanciero = creacionInfromeFinanciero;
    }*/

    // Ejección de código después de creación de Bean
    @PostConstruct
    public void ejecutaDespuesCreacion(){
        System.out.println("--> Ejecutado tras la creación del Bean");
    }

    // Ejección de código después de apagado de contenedor Spring
    @PreDestroy
    public void ejecutaAntesDestruccion(){
        System.out.println("--> Ejecutado antes de la destrucción");
    }

}
