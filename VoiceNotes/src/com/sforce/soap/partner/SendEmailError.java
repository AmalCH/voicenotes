package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class SendEmailError implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public SendEmailError() {
  }
    
  
  /**
   * element  : fields of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo fields__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","fields","http://www.w3.org/2001/XMLSchema","string",0,-1,true);

  private boolean fields__is_set = false;

  private java.lang.String[] fields = new java.lang.String[0];

  public java.lang.String[] getFields() {
    return fields;
  }

  

  public void setFields(java.lang.String[] fields) {
    this.fields = fields;
    fields__is_set = true;
  }
  
  /**
   * element  : message of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo message__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","message","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean message__is_set = false;

  private java.lang.String message;

  public java.lang.String getMessage() {
    return message;
  }

  

  public void setMessage(java.lang.String message) {
    this.message = message;
    message__is_set = true;
  }
  
  /**
   * element  : statusCode of type {urn:partner.soap.sforce.com}StatusCode
   * java type: com.sforce.soap.partner.StatusCode
   */
  private static final com.sforce.ws.bind.TypeInfo statusCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","statusCode","urn:partner.soap.sforce.com","StatusCode",1,1,true);

  private boolean statusCode__is_set = false;

  private com.sforce.soap.partner.StatusCode statusCode;

  public com.sforce.soap.partner.StatusCode getStatusCode() {
    return statusCode;
  }

  

  public void setStatusCode(com.sforce.soap.partner.StatusCode statusCode) {
    this.statusCode = statusCode;
    statusCode__is_set = true;
  }
  
  /**
   * element  : targetObjectId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo targetObjectId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","targetObjectId","urn:partner.soap.sforce.com","ID",1,1,true);

  private boolean targetObjectId__is_set = false;

  private java.lang.String targetObjectId;

  public java.lang.String getTargetObjectId() {
    return targetObjectId;
  }

  

  public void setTargetObjectId(java.lang.String targetObjectId) {
    this.targetObjectId = targetObjectId;
    targetObjectId__is_set = true;
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
   
    __typeMapper.writeObject(__out, fields__typeInfo, fields, fields__is_set);
    __typeMapper.writeString(__out, message__typeInfo, message, message__is_set);
    __typeMapper.writeObject(__out, statusCode__typeInfo, statusCode, statusCode__is_set);
    __typeMapper.writeString(__out, targetObjectId__typeInfo, targetObjectId, targetObjectId__is_set);
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
    if (__typeMapper.isElement(__in, fields__typeInfo)) {
      setFields((java.lang.String[])__typeMapper.readObject(__in, fields__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, message__typeInfo)) {
      setMessage((java.lang.String)__typeMapper.readString(__in, message__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, statusCode__typeInfo)) {
      setStatusCode((com.sforce.soap.partner.StatusCode)__typeMapper.readObject(__in, statusCode__typeInfo, com.sforce.soap.partner.StatusCode.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, targetObjectId__typeInfo)) {
      setTargetObjectId((java.lang.String)__typeMapper.readString(__in, targetObjectId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SendEmailError ");
    
    sb.append(" fields=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(fields)+"'\n");
    sb.append(" message=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(message)+"'\n");
    sb.append(" statusCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(statusCode)+"'\n");
    sb.append(" targetObjectId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(targetObjectId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}