package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class DisableFeedTrackingHeader_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DisableFeedTrackingHeader_element() {
  }
    
  
  /**
   * element  : disableFeedTracking of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo disableFeedTracking__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","disableFeedTracking","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean disableFeedTracking__is_set = false;

  private boolean disableFeedTracking;

  public boolean getDisableFeedTracking() {
    return disableFeedTracking;
  }

  

  public boolean isDisableFeedTracking() {
    return disableFeedTracking;
  }

  

  public void setDisableFeedTracking(boolean disableFeedTracking) {
    this.disableFeedTracking = disableFeedTracking;
    disableFeedTracking__is_set = true;
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
    __typeMapper.writeBoolean(__out, disableFeedTracking__typeInfo, disableFeedTracking, disableFeedTracking__is_set);
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
    if (__typeMapper.verifyElement(__in, disableFeedTracking__typeInfo)) {
      setDisableFeedTracking((boolean)__typeMapper.readBoolean(__in, disableFeedTracking__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DisableFeedTrackingHeader_element ");
    sb.append(super.toString());
    sb.append(" disableFeedTracking=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(disableFeedTracking)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}