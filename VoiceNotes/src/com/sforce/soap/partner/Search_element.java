package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class Search_element implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public Search_element() {
  }
    
  
  /**
   * element  : searchString of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo searchString__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","searchString","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean searchString__is_set = false;

  private java.lang.String searchString;

  public java.lang.String getSearchString() {
    return searchString;
  }

  

  public void setSearchString(java.lang.String searchString) {
    this.searchString = searchString;
    searchString__is_set = true;
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
   
    __typeMapper.writeString(__out, searchString__typeInfo, searchString, searchString__is_set);
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
    if (__typeMapper.verifyElement(__in, searchString__typeInfo)) {
      setSearchString((java.lang.String)__typeMapper.readString(__in, searchString__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Search_element ");
    
    sb.append(" searchString=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(searchString)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}