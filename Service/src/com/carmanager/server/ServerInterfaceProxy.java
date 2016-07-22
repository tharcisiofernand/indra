package com.carmanager.server;

public class ServerInterfaceProxy implements com.carmanager.server.ServerInterface {
  private String _endpoint = null;
  private com.carmanager.server.ServerInterface serverInterface = null;
  
  public ServerInterfaceProxy() {
    _initServerInterfaceProxy();
  }
  
  public ServerInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initServerInterfaceProxy();
  }
  
  private void _initServerInterfaceProxy() {
    try {
      serverInterface = (new com.carmanager.server.ServerServiceLocator()).getServerPort();
      if (serverInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serverInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serverInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serverInterface != null)
      ((javax.xml.rpc.Stub)serverInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.carmanager.server.ServerInterface getServerInterface() {
    if (serverInterface == null)
      _initServerInterfaceProxy();
    return serverInterface;
  }
  
  public com.carmanager.server.Car[] getAllCars() throws java.rmi.RemoteException{
    if (serverInterface == null)
      _initServerInterfaceProxy();
    return serverInterface.getAllCars();
  }
  
  public com.carmanager.server.Car getOneCar(java.lang.String arg0) throws java.rmi.RemoteException{
    if (serverInterface == null)
      _initServerInterfaceProxy();
    return serverInterface.getOneCar(arg0);
  }
  
  
}