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

    // Ejecci�n de c�digo despu�s de creaci�n de Bean
    @PostConstruct
    public void ejecutaDespuesCreacion(){
        System.out.println("--> Ejecutado tras la creaci�n del Bean");
    }

    // Ejecci�n de c�digo despu�s de apagado de contenedor Spring
    @PreDestroy
    public void ejecutaAntesDestruccion(){
        System.out.println("--> Ejecutado antes de la destrucci�n");
    }

}
