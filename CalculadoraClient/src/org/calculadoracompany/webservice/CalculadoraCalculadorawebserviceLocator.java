/**
 * CalculadoraCalculadorawebserviceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.calculadoracompany.webservice;

public class CalculadoraCalculadorawebserviceLocator extends org.apache.axis.client.Service implements org.calculadoracompany.webservice.CalculadoraCalculadorawebservice {

    public CalculadoraCalculadorawebserviceLocator() {
    }


    public CalculadoraCalculadorawebserviceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculadoraCalculadorawebserviceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalculadoraEndPointPort
    private java.lang.String CalculadoraEndPointPort_address = "http://localhost:8080/CalculadoraWebService/calculadora/calculadorawebservice";

    public java.lang.String getCalculadoraEndPointPortAddress() {
        return CalculadoraEndPointPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculadoraEndPointPortWSDDServiceName = "CalculadoraEndPointPort";

    public java.lang.String getCalculadoraEndPointPortWSDDServiceName() {
        return CalculadoraEndPointPortWSDDServiceName;
    }

    public void setCalculadoraEndPointPortWSDDServiceName(java.lang.String name) {
        CalculadoraEndPointPortWSDDServiceName = name;
    }

    public org.calculadoracompany.webservice.CalculadoraWebService getCalculadoraEndPointPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalculadoraEndPointPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculadoraEndPointPort(endpoint);
    }

    public org.calculadoracompany.webservice.CalculadoraWebService getCalculadoraEndPointPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.calculadoracompany.webservice.CalculadoraCalculadorawebserviceSoapBindingStub _stub = new org.calculadoracompany.webservice.CalculadoraCalculadorawebserviceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalculadoraEndPointPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculadoraEndPointPortEndpointAddress(java.lang.String address) {
        CalculadoraEndPointPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.calculadoracompany.webservice.CalculadoraWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.calculadoracompany.webservice.CalculadoraCalculadorawebserviceSoapBindingStub _stub = new org.calculadoracompany.webservice.CalculadoraCalculadorawebserviceSoapBindingStub(new java.net.URL(CalculadoraEndPointPort_address), this);
                _stub.setPortName(getCalculadoraEndPointPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CalculadoraEndPointPort".equals(inputPortName)) {
            return getCalculadoraEndPointPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.calculadoracompany.org/", "calculadora/calculadorawebservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.calculadoracompany.org/", "CalculadoraEndPointPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalculadoraEndPointPort".equals(portName)) {
            setCalculadoraEndPointPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
