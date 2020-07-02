package org.springframework.beans.factory.groovy;

import java.lang.*;
import java.util.*;
import java.io.*;
import java.net.*;
import groovy.lang.*;
import groovy.util.*;

@groovy.transform.PackageScope() public class GroovyDynamicElementReader
  extends groovy.lang.GroovyObjectSupport {
;
protected final boolean decorating = new java.lang.Boolean((boolean)false);
public GroovyDynamicElementReader
(java.lang.String namespace, java.util.Map<java.lang.String, java.lang.String> namespaceMap, org.springframework.beans.factory.xml.BeanDefinitionParserDelegate delegate, GroovyBeanDefinitionWrapper beanDefinition, boolean decorating) {
super ();
}
@java.lang.Override() public  java.lang.Object invokeMethod(java.lang.String name, java.lang.Object args) { return null;}
protected  void afterInvocation() { }
}
