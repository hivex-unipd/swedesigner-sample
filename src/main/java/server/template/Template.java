package server.template;

import org.stringtemplate.v4.ST;

public interface Template {
	public ST getAttributeTemplate();
	
	public ST getMethodTemplate();
	
	public ST getClassTemplate();
	
	public ST getInterfaceTemplate();
	
	public ST getIfTemplate();
	
	public ST getCustomTemplate();
	
	public ST getReturnTemplate();
	
	public ST getAssignmentTemplate();
	
	public ST getInitializationTemplate();
	
	public ST getForTemplate();
	
	public ST getWhileTemplate();
}
