package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class LoginScopeHeader_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public LoginScopeHeader_element() {
  }
    
  
  /**
   * element  : organizationId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo organizationId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","organizationId","urn:partner.soap.sforce.com","ID",1,1,true);

  private boolean organizationId__is_set = false;

  private java.lang.String organizationId;

  public java.lang.String getOrganizationId() {
    return organizationId;
  }

  

  public void setOrganizationId(java.lang.String organizationId) {
    this.organizationId = organizationId;
    organizationId__is_set = true;
  }
  
  /**
   * element  : portalId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo portalId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","portalId","urn:partner.soap.sforce.com","ID",0,1,true);

  private boolean portalId__is_set = false;

  private java.lang.String portalId;

  public java.lang.String getPortalId() {
    return portalId;
  }

  

  public void setPortalId(java.lang.String portalId) {
    this.portalId = portalId;
    portalId__is_set = true;
  }
  

  /**
   */
  public void write(com.mavens.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, organizationId__typeInfo, organizationId, organizationId__is_set);
    __typeMapper.writeString(__out, portalId__typeInfo, portalId, portalId__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, organizationId__typeInfo)) {
      setOrganizationId((java.lang.String)__typeMapper.readString(__in, organizationId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, portalId__typeInfo)) {
      setPortalId((java.lang.String)__typeMapper.readString(__in, portalId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[LoginScopeHeader_element ");
    sb.append(super.toString());
    sb.append(" organizationId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(organizationId)+"'\n");
    sb.append(" portalId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(portalId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}