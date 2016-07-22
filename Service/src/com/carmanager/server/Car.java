/**
 * Car.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.carmanager.server;

public class Car implements java.io.Serializable {
	private int ano;

	private int anoMod;

	private java.lang.String chassi;

	private java.lang.String cor;

	private java.lang.String modelo;

	private int oleokm;

	private java.lang.String placa;

	public Car() {
	}

	public Car(int ano, int anoMod, java.lang.String chassi, java.lang.String cor, java.lang.String modelo, int oleokm,
			java.lang.String placa) {
		this.ano = ano;
		this.anoMod = anoMod;
		this.chassi = chassi;
		this.cor = cor;
		this.modelo = modelo;
		this.oleokm = oleokm;
		this.placa = placa;
	}

	/**
	 * Gets the ano value for this Car.
	 * 
	 * @return ano
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Sets the ano value for this Car.
	 * 
	 * @param ano
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * Gets the anoMod value for this Car.
	 * 
	 * @return anoMod
	 */
	public int getAnoMod() {
		return anoMod;
	}

	/**
	 * Sets the anoMod value for this Car.
	 * 
	 * @param anoMod
	 */
	public void setAnoMod(int anoMod) {
		this.anoMod = anoMod;
	}

	/**
	 * Gets the chassi value for this Car.
	 * 
	 * @return chassi
	 */
	public java.lang.String getChassi() {
		return chassi;
	}

	/**
	 * Sets the chassi value for this Car.
	 * 
	 * @param chassi
	 */
	public void setChassi(java.lang.String chassi) {
		this.chassi = chassi;
	}

	/**
	 * Gets the cor value for this Car.
	 * 
	 * @return cor
	 */
	public java.lang.String getCor() {
		return cor;
	}

	/**
	 * Sets the cor value for this Car.
	 * 
	 * @param cor
	 */
	public void setCor(java.lang.String cor) {
		this.cor = cor;
	}

	/**
	 * Gets the modelo value for this Car.
	 * 
	 * @return modelo
	 */
	public java.lang.String getModelo() {
		return modelo;
	}

	/**
	 * Sets the modelo value for this Car.
	 * 
	 * @param modelo
	 */
	public void setModelo(java.lang.String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Gets the oleokm value for this Car.
	 * 
	 * @return oleokm
	 */
	public int getOleokm() {
		return oleokm;
	}

	/**
	 * Sets the oleokm value for this Car.
	 * 
	 * @param oleokm
	 */
	public void setOleokm(int oleokm) {
		this.oleokm = oleokm;
	}

	/**
	 * Gets the placa value for this Car.
	 * 
	 * @return placa
	 */
	public java.lang.String getPlaca() {
		return placa;
	}

	/**
	 * Sets the placa value for this Car.
	 * 
	 * @param placa
	 */
	public void setPlaca(java.lang.String placa) {
		this.placa = placa;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Car))
			return false;
		Car other = (Car) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && this.ano == other.getAno() && this.anoMod == other.getAnoMod()
				&& ((this.chassi == null && other.getChassi() == null)
						|| (this.chassi != null && this.chassi.equals(other.getChassi())))
				&& ((this.cor == null && other.getCor() == null)
						|| (this.cor != null && this.cor.equals(other.getCor())))
				&& ((this.modelo == null && other.getModelo() == null)
						|| (this.modelo != null && this.modelo.equals(other.getModelo())))
				&& this.oleokm == other.getOleokm() && ((this.placa == null && other.getPlaca() == null)
						|| (this.placa != null && this.placa.equals(other.getPlaca())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		_hashCode += getAno();
		_hashCode += getAnoMod();
		if (getChassi() != null) {
			_hashCode += getChassi().hashCode();
		}
		if (getCor() != null) {
			_hashCode += getCor().hashCode();
		}
		if (getModelo() != null) {
			_hashCode += getModelo().hashCode();
		}
		_hashCode += getOleokm();
		if (getPlaca() != null) {
			_hashCode += getPlaca().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(Car.class,
			true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.carmanager.com/", "car"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ano");
		elemField.setXmlName(new javax.xml.namespace.QName("", "ano"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("anoMod");
		elemField.setXmlName(new javax.xml.namespace.QName("", "anoMod"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("chassi");
		elemField.setXmlName(new javax.xml.namespace.QName("", "chassi"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cor");
		elemField.setXmlName(new javax.xml.namespace.QName("", "cor"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("modelo");
		elemField.setXmlName(new javax.xml.namespace.QName("", "modelo"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("oleokm");
		elemField.setXmlName(new javax.xml.namespace.QName("", "oleokm"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("placa");
		elemField.setXmlName(new javax.xml.namespace.QName("", "placa"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

}
