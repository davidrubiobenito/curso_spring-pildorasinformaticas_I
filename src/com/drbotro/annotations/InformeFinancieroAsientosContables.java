package com.drbotro.annotations;

public class InformeFinancieroAsientosContables implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero(){
        return "Informe financiero asientos contables a�o 2018.";
    }

}
