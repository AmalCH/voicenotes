package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class RecordTypeInfo implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public RecordTypeInfo() {
  }
    
  
  /**
   * element  : available of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo available__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","available","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean available__is_set = false;

  private boolean available;

  public boolean getAvailable() {
    return available;
  }

  

  public boolean isAvailable() {
    return available;
  }

  

  public void setAvailable(boolean available) {
    this.available = available;
    available__is_set = true;
  }
  
  /**
   * element  : defaultRecordTypeMapping of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo defaultRecordTypeMapping__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","defaultRecordTypeMapping","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean defaultRecordTypeMapping__is_set = false;

  private boolean defaultRecordTypeMapping;

  public boolean getDefaultRecordTypeMapping() {
    return defaultRecordTypeMapping;
  }

  

  public boolean isDefaultRecordTypeMapping() {
    return defaultRecordTypeMapping;
  }

  

  public void setDefaultRecordTypeMapping(boolean defaultRecordTypeMapping) {
    this.defaultRecordTypeMapping = defaultRecordTypeMapping;
    defaultRecordTypeMapping__is_set = true;
  }
  
  /**
   * element  : name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean name__is_set = false;

  private java.lang.String name;

  public java.lang.String getName() {
    return name;
  }

  

  public void setName(java.lang.String name) {
    this.name = name;
    name__is_set = true;
  }
  
  /**
   * element  : recordTypeId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo recordTypeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","recordTypeId","urn:partner.soap.sforce.com","ID",1,1,true);

  private boolean recordTypeId__is_set = false;

  private java.lang.String recordTypeId;

  public java.lang.String getRecordTypeId() {
    return recordTypeId;
  }

  

  public void setRecordTypeId(java.lang.String recordTypeId) {
    this.recordTypeId = recordTypeId;
    recordTypeId__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, available__typeInfo, available, available__is_set);
    __typeMapper.writeBoolean(__out, defaultRecordTypeMapping__typeInfo, defaultRecordTypeMapping, defaultRecordTypeMapping__is_set);
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
    __typeMapper.writeString(__out, recordTypeId__typeInfo, recordTypeId, recordTypeId__is_set);
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
    if (__typeMapper.verifyElement(__in, available__typeInfo)) {
      setAvailable((boolean)__typeMapper.readBoolean(__in, available__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, defaultRecordTypeMapping__typeInfo)) {
      setDefaultRecordTypeMapping((boolean)__typeMapper.readBoolean(__in, defaultRecordTypeMapping__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, recordTypeId__typeInfo)) {
      setRecordTypeId((java.lang.String)__typeMapper.readString(__in, recordTypeId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[RecordTypeInfo ");
    
    sb.append(" available=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(available)+"'\n");
    sb.append(" defaultRecordTypeMapping=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(defaultRecordTypeMapping)+"'\n");
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append(" recordTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(recordTypeId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}