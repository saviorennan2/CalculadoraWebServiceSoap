package org.calculadoracompany.webservice;

public class CalculadoraWebServiceProxy implements org.calculadoracompany.webservice.CalculadoraWebService {
  private String _endpoint = null;
  private org.calculadoracompany.webservice.CalculadoraWebService calculadoraWebService = null;
  
  public CalculadoraWebServiceProxy() {
    _initCalculadoraWebServiceProxy();
  }
  
  public CalculadoraWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculadoraWebServiceProxy();
  }
  
  private void _initCalculadoraWebServiceProxy() {
    try {
      calculadoraWebService = (new org.calculadoracompany.webservice.CalculadoraCalculadorawebserviceLocator()).getCalculadoraEndPointPort();
      if (calculadoraWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculadoraWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculadoraWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculadoraWebService != null)
      ((javax.xml.rpc.Stub)calculadoraWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.calculadoracompany.webservice.CalculadoraWebService getCalculadoraWebService() {
    if (calculadoraWebService == null)
      _initCalculadoraWebServiceProxy();
    return calculadoraWebService;
  }
  
  public double somar(double valor1, double valor2) throws java.rmi.RemoteException{
    if (calculadoraWebService == null)
      _initCalculadoraWebServiceProxy();
    return calculadoraWebService.somar(valor1, valor2);
  }
  
  
}