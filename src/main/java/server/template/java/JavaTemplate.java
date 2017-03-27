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
	
	@Override
	public ST getCustomTemplate() {
		STGroup group = new STGroupDir("src/main/resources/customjavatemplate");
		ST st = group.getInstanceOf("customjavatemplate");// TODO Auto-generated method stub
		return st;
	}
	
	@Override
	public ST getReturnTemplate() {
		STGroup group = new STGroupDir("src/main/resources/returnjavatemplate");
		ST st = group.getInstanceOf("returnjavatemplate");// TODO Auto-generated method stub
		return st;
	}
	
	@Override
	public ST getAssignmentTemplate() {
		STGroup group = new STGroupDir("src/main/resources/assignmentjavatemplate");
		ST st = group.getInstanceOf("assignmentjavatemplate");// TODO Auto-generated method stub
		return st;
	}
	
	@Override
	public ST getInitializationTemplate() {
		STGroup group = new STGroupDir("src/main/resources/initializationjavatemplate");
		ST st = group.getInstanceOf("initializationjavatemplate");// TODO Auto-generated method stub
		return st;
	}
	
	@Override
	public ST getForTemplate() {
		STGroup group = new STGroupDir("src/main/resources/forjavatemplate");
		ST st = group.getInstanceOf("forjavatemplate");// TODO Auto-generated method stub
		return st;
	}
	
	@Override
	public ST getWhileTemplate() {
		STGroup group = new STGroupDir("src/main/resources/whilejavatemplate");
		ST st = group.getInstanceOf("whilejavatemplate");// TODO Auto-generated method stub
		return st;
	}
}
