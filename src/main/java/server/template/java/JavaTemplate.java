package server.template.java;

import org.stringtemplate.v4.*;

import server.template.Template;

public class JavaTemplate extends Template {

	@Override
	public ST getAttributeTemplate() {
		STGroup group = new STGroupDir("src/main/resources/attributejavatemplate");
		ST st = group.getInstanceOf("attributejavatemplate");// TODO Auto-generated method stub
		return st;
	}
	
	@Override
	public ST getMethodTemplate() {
		STGroup group = new STGroupDir("src/main/resources/methodjavatemplate");
		ST st = group.getInstanceOf("methodjavatemplate");// TODO Auto-generated method stub
		return st;
	}

	
	@Override
	public ST getClassTemplate() {
		STGroup group = new STGroupDir("src/main/resources/classjavatemplate");
		ST st = group.getInstanceOf("classjavatemplate");// TODO Auto-generated method stub
		return st;
	}
	
	@Override
	public ST getInterfaceTemplate() {
		STGroup group = new STGroupDir("src/main/resources/interfacejavatemplate");
		ST st = group.getInstanceOf("interfacejavatemplate");// TODO Auto-generated method stub
		return st;
	}
	
	@Override
	public ST getIfTemplate() {
		STGroup group = new STGroupDir("src/main/resources/ifjavatemplate");
		ST st = group.getInstanceOf("ifjavatemplate");// TODO Auto-generated method stub
		return st;
	}	
}
