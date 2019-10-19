package com.drbotro.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim2 implements CreacionInfromeFinanciero{

    @Override
    public String getInformeFinanciero(){
        return "Presentacion de informe catastrófico trimestre 2.";
    }

}
