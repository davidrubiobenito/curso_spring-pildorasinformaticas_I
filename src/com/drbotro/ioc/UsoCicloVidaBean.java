package com.drbotro.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {

        //1. Cargar el archivo XML
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
        // 2. petición de bean al contenedor
        Empleados manolo = contexto.getBean("miEmpleado", Empleados.class);
		
        // 3. Utilizar el bean
        System.out.println(manolo.getInforme());
		
        // 4. cerrar XML
		contexto.close();
	}

}
