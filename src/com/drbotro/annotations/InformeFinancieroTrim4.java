package com.drbotro.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim4 implements CreacionInfromeFinanciero{

    @Override
    public String getInformeFinanciero(){
        return "Presentaci�n de informe de cierre de a�o.";
    }

}
