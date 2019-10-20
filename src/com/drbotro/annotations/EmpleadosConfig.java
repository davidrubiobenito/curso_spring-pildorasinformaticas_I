package com.drbotro.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.drbotro.annotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig{

    // 1. Definir el bean para InformeFinancieroDtoCompras
    // 2. El m�todo retorna la interfaz que implementa ese Bean
    @Bean
    public CreacionInformeFinanciero informeFinancieroDtoCompras(){ // ser� el id del bean inyectado
        return new InformeFinancieroDtoCompras();
    }

    // 1. Definir el bean para el DirectoFinanciero e inyectar dependencias
    // 2. El m�todo retorna la interfaz que implementa ese Bean
    @Bean
    public Empleados directorFinanciero(){
        return new DirectorFinanciero(informeFinancieroDtoCompras());
    }

    @Bean
    public CreacionInformeFinanciero informeFinancieroAsientosContables(){
        return new InformeFinancieroAsientosContables();
    }

    @Bean
    public Empleados tecnicoFinanciero(){
        return new TecnicoFinanciero(informeFinancieroAsientosContables());
    }

}
