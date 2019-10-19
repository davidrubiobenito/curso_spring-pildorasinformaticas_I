package com.drbotro.annotations;

import org.springframework.stereotype.Component;

@Component("comercialExperimentado")
public class ComercialExperimentado implements Empleados{


    @Override
    public String getTareas(){
        return "Vender, vender y vender más.";
    }

    @Override
    public String getInforme(){
        return "Este es un informe generado por el comercial.";
    }

}
