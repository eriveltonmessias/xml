/**
 * RespostaBuscaMO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2 May 03, 2005 (02:20:24 EDT) WSDL2Java emitter.
 */

package smsbahia.com.br.ServicosSMSBahia;

public class RespostaBuscaMO  implements java.io.Serializable {
    private java.lang.String resultado;
    private smsbahia.com.br.ServicosSMSBahia.MOResult[] mos;

    public RespostaBuscaMO() {
    }

    public RespostaBuscaMO(
           java.lang.String resultado,
           smsbahia.com.br.ServicosSMSBahia.MOResult[] mos) {
           this.resultado = resultado;
           this.mos = mos;
    }


    /**
     * Gets the resultado value for this RespostaBuscaMO.
     * 
     * @return resultado
     */
    public java.lang.String getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this RespostaBuscaMO.
     * 
     * @param resultado
     */
    public void setResultado(java.lang.String resultado) {
        this.resultado = resultado;
    }


    /**
     * Gets the mos value for this RespostaBuscaMO.
     * 
     * @return mos
     */
    public smsbahia.com.br.ServicosSMSBahia.MOResult[] getMos() {
        return mos;
    }


    /**
     * Sets the mos value for this RespostaBuscaMO.
     * 
     * @param mos
     */
    public void setMos(smsbahia.com.br.ServicosSMSBahia.MOResult[] mos) {
        this.mos = mos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespostaBuscaMO)) return false;
        RespostaBuscaMO other = (RespostaBuscaMO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              this.resultado.equals(other.getResultado()))) &&
            ((this.mos==null && other.getMos()==null) || 
             (this.mos!=null &&
              java.util.Arrays.equals(this.mos, other.getMos())));
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
        if (getResultado() != null) {
            _hashCode += getResultado().hashCode();
        }
        if (getMos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespostaBuscaMO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:server.ServicosSMSBahia", "RespostaBuscaMO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mos"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:server.ServicosSMSBahia", "MOResult"));
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
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
