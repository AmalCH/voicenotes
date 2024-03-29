package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class ResetPassword_element implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public ResetPassword_element() {
  }
    
  
  /**
   * element  : userId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo userId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","userId","urn:partner.soap.sforce.com","ID",1,1,true);

  private boolean userId__is_set = false;

  private java.lang.String userId;

  public java.lang.String getUserId() {
    return userId;
  }

  

  public void setUserId(java.lang.String userId) {
    this.userId = userId;
    userId__is_set = true;
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
   
    __typeMapper.writeString(__out, userId__typeInfo, userId, userId__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, userId__typeInfo)) {
      setUserId((java.lang.String)__typeMapper.readString(__in, userId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ResetPassword_element ");
    
    sb.append(" userId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(userId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}