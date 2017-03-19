package org.calculadoracompany.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="calculadora/calculadorawebservice")
public class CalculadoraEndPoint implements CalculadoraWebService{

	@Override
	@WebMethod
	public double somar(double valor1, double valor2) {
		// TODO Auto-generated method stub
		return valor1+valor2;
	}

}
