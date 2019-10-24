package org.calculadoracompany.client;

import java.rmi.RemoteException;

import org.calculadoracompany.webservice.CalculadoraWebService;
import org.calculadoracompany.webservice.CalculadoraWebServiceProxy;

//Codigozao da porra
public class Main {
	public static void main(String[] args) {
		CalculadoraWebService calculadora= new CalculadoraWebServiceProxy();
		double resultado;
		try {
			resultado = calculadora.somar(1.0, 2.0);
			System.out.println("O resultado é: "+ resultado);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			// Generate function add, sub
		}
		
	}
}
