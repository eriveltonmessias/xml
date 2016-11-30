/**
 * SMSStatusResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2 May 03, 2005 (02:20:24 EDT) WSDL2Java emitter.
 */

package smsbahia.com.br.ServicosSMSBahia;

public class SMSStatusResult  implements java.io.Serializable {
    private java.lang.String idMensagem;
    private java.lang.String celular;
    private java.lang.String mensagem;
    private java.lang.String status;
    private java.lang.String dataRecebimento;
    private java.lang.String dataEnvio;
    private java.lang.String dataStatus;
    private java.lang.String operadora;

    public SMSStatusResult() {
    }

    public SMSStatusResult(
           java.lang.String idMensagem,
           java.lang.String celular,
           java.lang.String mensagem,
           java.lang.String status,
           java.lang.String dataRecebimento,
           java.lang.String dataEnvio,
           java.lang.String dataStatus,
           java.lang.String operadora) {
           this.idMensagem = idMensagem;
           this.celular = celular;
           this.mensagem = mensagem;
           this.status = status;
           this.dataRecebimento = dataRecebimento;
           this.dataEnvio = dataEnvio;
           this.dataStatus = dataStatus;
           this.operadora = operadora;
    }


    /**
     * Gets the idMensagem value for this SMSStatusResult.
     * 
     * @return idMensagem
     */
    public java.lang.String getIdMensagem() {
        return idMensagem;
    }


    /**
     * Sets the idMensagem value for this SMSStatusResult.
     * 
     * @param idMensagem
     */
    public void setIdMensagem(java.lang.String idMensagem) {
        this.idMensagem = idMensagem;
    }


    /**
     * Gets the celular value for this SMSStatusResult.
     * 
     * @return celular
     */
    public java.lang.String getCelular() {
        return celular;
    }


    /**
     * Sets the celular value for this SMSStatusResult.
     * 
     * @param celular
     */
    public void setCelular(java.lang.String celular) {
        this.celular = celular;
    }


    /**
     * Gets the mensagem value for this SMSStatusResult.
     * 
     * @return mensagem
     */
    public java.lang.String getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this SMSStatusResult.
     * 
     * @param mensagem
     */
    public void setMensagem(java.lang.String mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the status value for this SMSStatusResult.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SMSStatusResult.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the dataRecebimento value for this SMSStatusResult.
     * 
     * @return dataRecebimento
     */
    public java.lang.String getDataRecebimento() {
        return dataRecebimento;
    }


    /**
     * Sets the dataRecebimento value for this SMSStatusResult.
     * 
     * @param dataRecebimento
     */
    public void setDataRecebimento(java.lang.String dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }


    /**
     * Gets the dataEnvio value for this SMSStatusResult.
     * 
     * @return dataEnvio
     */
    public java.lang.String getDataEnvio() {
        return dataEnvio;
    }


    /**
     * Sets the dataEnvio value for this SMSStatusResult.
     * 
     * @param dataEnvio
     */
    public void setDataEnvio(java.lang.String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }


    /**
     * Gets the dataStatus value for this SMSStatusResult.
     * 
     * @return dataStatus
     */
    public java.lang.String getDataStatus() {
        return dataStatus;
    }


    /**
     * Sets the dataStatus value for this SMSStatusResult.
     * 
     * @param dataStatus
     */
    public void setDataStatus(java.lang.String dataStatus) {
        this.dataStatus = dataStatus;
    }


    /**
     * Gets the operadora value for this SMSStatusResult.
     * 
     * @return operadora
     */
    public java.lang.String getOperadora() {
        return operadora;
    }


    /**
     * Sets the operadora value for this SMSStatusResult.
     * 
     * @param operadora
     */
    public void setOperadora(java.lang.String operadora) {
        this.operadora = operadora;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SMSStatusResult)) return false;
        SMSStatusResult other = (SMSStatusResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idMensagem==null && other.getIdMensagem()==null) || 
             (this.idMensagem!=null &&
              this.idMensagem.equals(other.getIdMensagem()))) &&
            ((this.celular==null && other.getCelular()==null) || 
             (this.celular!=null &&
              this.celular.equals(other.getCelular()))) &&
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.dataRecebimento==null && other.getDataRecebimento()==null) || 
             (this.dataRecebimento!=null &&
              this.dataRecebimento.equals(other.getDataRecebimento()))) &&
            ((this.dataEnvio==null && other.getDataEnvio()==null) || 
             (this.dataEnvio!=null &&
              this.dataEnvio.equals(other.getDataEnvio()))) &&
            ((this.dataStatus==null && other.getDataStatus()==null) || 
             (this.dataStatus!=null &&
              this.dataStatus.equals(other.getDataStatus()))) &&
            ((this.operadora==null && other.getOperadora()==null) || 
             (this.operadora!=null &&
              this.operadora.equals(other.getOperadora())));
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
        if (getIdMensagem() != null) {
            _hashCode += getIdMensagem().hashCode();
        }
        if (getCelular() != null) {
            _hashCode += getCelular().hashCode();
        }
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDataRecebimento() != null) {
            _hashCode += getDataRecebimento().hashCode();
        }
        if (getDataEnvio() != null) {
            _hashCode += getDataEnvio().hashCode();
        }
        if (getDataStatus() != null) {
            _hashCode += getDataStatus().hashCode();
        }
        if (getOperadora() != null) {
            _hashCode += getOperadora().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SMSStatusResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:server.ServicosSMSBahia", "SMSStatusResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idMensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idMensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("celular");
        elemField.setXmlName(new javax.xml.namespace.QName("", "celular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataRecebimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataRecebimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataEnvio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataEnvio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operadora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operadora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
