package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class SearchResult implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public SearchResult() {
  }
    
  
  /**
   * element  : searchRecords of type {urn:partner.soap.sforce.com}SearchRecord
   * java type: com.sforce.soap.partner.SearchRecord[]
   */
  private static final com.sforce.ws.bind.TypeInfo searchRecords__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","searchRecords","urn:partner.soap.sforce.com","SearchRecord",0,-1,true);

  private boolean searchRecords__is_set = false;

  private com.sforce.soap.partner.SearchRecord[] searchRecords = new com.sforce.soap.partner.SearchRecord[0];

  public com.sforce.soap.partner.SearchRecord[] getSearchRecords() {
    return searchRecords;
  }

  

  public void setSearchRecords(com.sforce.soap.partner.SearchRecord[] searchRecords) {
    this.searchRecords = searchRecords;
    searchRecords__is_set = true;
  }
  
  /**
   * element  : sforceReserved of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo sforceReserved__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sforceReserved","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean sforceReserved__is_set = false;

  private java.lang.String sforceReserved;

  public java.lang.String getSforceReserved() {
    return sforceReserved;
  }

  

  public void setSforceReserved(java.lang.String sforceReserved) {
    this.sforceReserved = sforceReserved;
    sforceReserved__is_set = true;
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
   
    __typeMapper.writeObject(__out, searchRecords__typeInfo, searchRecords, searchRecords__is_set);
    __typeMapper.writeString(__out, sforceReserved__typeInfo, sforceReserved, sforceReserved__is_set);
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
    if (__typeMapper.isElement(__in, searchRecords__typeInfo)) {
      setSearchRecords((com.sforce.soap.partner.SearchRecord[])__typeMapper.readObject(__in, searchRecords__typeInfo, com.sforce.soap.partner.SearchRecord[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, sforceReserved__typeInfo)) {
      setSforceReserved((java.lang.String)__typeMapper.readString(__in, sforceReserved__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SearchResult ");
    
    sb.append(" searchRecords=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(searchRecords)+"'\n");
    sb.append(" sforceReserved=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sforceReserved)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}