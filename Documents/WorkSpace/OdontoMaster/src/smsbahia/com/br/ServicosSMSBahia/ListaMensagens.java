/**
 * ListaMensagens.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2 May 03, 2005 (02:20:24 EDT) WSDL2Java emitter.
 */

package smsbahia.com.br.ServicosSMSBahia;

public class ListaMensagens  implements java.io.Serializable {
    private java.lang.String idMensagem;
    private java.lang.String destinatario;
    private java.lang.String mensagem;
    private java.lang.String dataHorarioAgendamento;

    public ListaMensagens() {
    }

    public ListaMensagens(
           java.lang.String idMensagem,
           java.lang.String destinatario,
           java.lang.String mensagem,
           java.lang.String dataHorarioAgendamento) {
           this.idMensagem = idMensagem;
           this.destinatario = destinatario;
           this.mensagem = mensagem;
           this.dataHorarioAgendamento = dataHorarioAgendamento;
    }


    /**
     * Gets the idMensagem value for this ListaMensagens.
     * 
     * @return idMensagem
     */
    public java.lang.String getIdMensagem() {
        return idMensagem;
    }


    /**
     * Sets the idMensagem value for this ListaMensagens.
     * 
     * @param idMensagem
     */
    public void setIdMensagem(java.lang.String idMensagem) {
        this.idMensagem = idMensagem;
    }


    /**
     * Gets the destinatario value for this ListaMensagens.
     * 
     * @return destinatario
     */
    public java.lang.String getDestinatario() {
        return destinatario;
    }


    /**
     * Sets the destinatario value for this ListaMensagens.
     * 
     * @param destinatario
     */
    public void setDestinatario(java.lang.String destinatario) {
        this.destinatario = destinatario;
    }


    /**
     * Gets the mensagem value for this ListaMensagens.
     * 
     * @return mensagem
     */
    public java.lang.String getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this ListaMensagens.
     * 
     * @param mensagem
     */
    public void setMensagem(java.lang.String mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the dataHorarioAgendamento value for this ListaMensagens.
     * 
     * @return dataHorarioAgendamento
     */
    public java.lang.String getDataHorarioAgendamento() {
        return dataHorarioAgendamento;
    }


    /**
     * Sets the dataHorarioAgendamento value for this ListaMensagens.
     * 
     * @param dataHorarioAgendamento
     */
    public void setDataHorarioAgendamento(java.lang.String dataHorarioAgendamento) {
        this.dataHorarioAgendamento = dataHorarioAgendamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaMensagens)) return false;
        ListaMensagens other = (ListaMensagens) obj;
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
            ((this.destinatario==null && other.getDestinatario()==null) || 
             (this.destinatario!=null &&
              this.destinatario.equals(other.getDestinatario()))) &&
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem()))) &&
            ((this.dataHorarioAgendamento==null && other.getDataHorarioAgendamento()==null) || 
             (this.dataHorarioAgendamento!=null &&
              this.dataHorarioAgendamento.equals(other.getDataHorarioAgendamento())));
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
        if (getDestinatario() != null) {
            _hashCode += getDestinatario().hashCode();
        }
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        if (getDataHorarioAgendamento() != null) {
            _hashCode += getDataHorarioAgendamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaMensagens.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:server.ServicosSMSBahia", "ListaMensagens"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idMensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idMensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinatario"));
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
        elemField.setFieldName("dataHorarioAgendamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataHorarioAgendamento"));
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
