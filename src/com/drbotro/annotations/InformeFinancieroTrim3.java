package com.drbotro.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim3 implements CreacionInfromeFinanciero{

    @Override
    public String getInformeFinanciero(){
        return "Presentacion de informe favorable trimestre 3.";
    }

}
