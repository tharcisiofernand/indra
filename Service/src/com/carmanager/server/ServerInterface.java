/**
 * ServerInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.carmanager.server;

public interface ServerInterface extends java.rmi.Remote {
    public com.carmanager.server.Car[] getAllCars() throws java.rmi.RemoteException;
    public com.carmanager.server.Car getOneCar(java.lang.String arg0) throws java.rmi.RemoteException;
}
