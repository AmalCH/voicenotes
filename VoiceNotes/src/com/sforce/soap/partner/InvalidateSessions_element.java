package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class InvalidateSessions_element implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public InvalidateSessions_element() {
  }
    
  
  /**
   * element  : sessionIds of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo sessionIds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sessionIds","http://www.w3.org/2001/XMLSchema","string",0,-1,true);

  private boolean sessionIds__is_set = false;

  private java.lang.String[] sessionIds = new java.lang.String[0];

  public java.lang.String[] getSessionIds() {
    return sessionIds;
  }

  

  public void setSessionIds(java.lang.String[] sessionIds) {
    this.sessionIds = sessionIds;
    sessionIds__is_set = true;
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
   
    __typeMapper.writeObject(__out, sessionIds__typeInfo, sessionIds, sessionIds__is_set);
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
    if (__typeMapper.isElement(__in, sessionIds__typeInfo)) {
      setSessionIds((java.lang.String[])__typeMapper.readObject(__in, sessionIds__typeInfo, java.lang.String[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[InvalidateSessions_element ");
    
    sb.append(" sessionIds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sessionIds)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}