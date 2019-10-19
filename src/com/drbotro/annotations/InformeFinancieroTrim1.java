package com.drbotro.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInfromeFinanciero{

    @Override
    public String getInformeFinanciero(){
        return "Presentación de informe financiero del trimestre 1";
    }

}
