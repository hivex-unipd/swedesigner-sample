package server.template.java;

import org.stringtemplate.v4.*;

import server.template.Template;

public class JavaTemplate implements Template {

	@Override
	public ST getAttributeTemplate() {
		STGroup group = new STGroupFile("attributejavatemplate.stg");
		ST st = group.getInstanceOf("decl");// TODO Auto-generated method stub
		return st;
	}

}
