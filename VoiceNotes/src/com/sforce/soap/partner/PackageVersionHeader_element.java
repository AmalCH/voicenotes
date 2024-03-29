package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class PackageVersionHeader_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public PackageVersionHeader_element() {
  }
    
  
  /**
   * element  : packageVersions of type {urn:partner.soap.sforce.com}PackageVersion
   * java type: com.sforce.soap.partner.PackageVersion[]
   */
  private static final com.sforce.ws.bind.TypeInfo packageVersions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","packageVersions","urn:partner.soap.sforce.com","PackageVersion",0,-1,true);

  private boolean packageVersions__is_set = false;

  private com.sforce.soap.partner.PackageVersion[] packageVersions = new com.sforce.soap.partner.PackageVersion[0];

  public com.sforce.soap.partner.PackageVersion[] getPackageVersions() {
    return packageVersions;
  }

  

  public void setPackageVersions(com.sforce.soap.partner.PackageVersion[] packageVersions) {
    this.packageVersions = packageVersions;
    packageVersions__is_set = true;
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
    __typeMapper.writeObject(__out, packageVersions__typeInfo, packageVersions, packageVersions__is_set);
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
    if (__typeMapper.isElement(__in, packageVersions__typeInfo)) {
      setPackageVersions((com.sforce.soap.partner.PackageVersion[])__typeMapper.readObject(__in, packageVersions__typeInfo, com.sforce.soap.partner.PackageVersion[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[PackageVersionHeader_element ");
    sb.append(super.toString());
    sb.append(" packageVersions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(packageVersions)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}