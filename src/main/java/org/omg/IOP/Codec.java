package org.omg.IOP;


/**
* org/omg/IOP/Codec.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-x64-cygwin/jdk8u371/3355/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Friday, March 17, 2023 4:05:04 AM UTC
*/


/**
   * The formats of IOR components and service context data used by ORB 
   * services are often defined as CDR encapsulations encoding instances 
   * of IDL defined data types. The <code>Codec</code> provides a mechanism 
   * to transfer these components between their IDL data types and their CDR 
   * encapsulation representations. 
   * <p>
   * A <code>Codec</code> is obtained from the <code>CodecFactory</code>. 
   * The <code>CodecFactory</code> is obtained through a call to 
   * <code>ORB.resolve_initial_references( "CodecFactory" )</code>.
   */
public interface Codec extends CodecOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface Codec
