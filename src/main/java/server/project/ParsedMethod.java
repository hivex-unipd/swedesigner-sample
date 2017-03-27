package server.project;

import server.render.Render;
import server.render.java.JavaRender;
import server.template.Template;
import org.stringtemplate.v4.ST;

public class ParsedMethod implements ParsedElement {
	private String visibility;
	private String name;
	private ParsedAttribute[] parameters;
	
	public ParsedMethod(String vis, String n, ParsedAttribute[] par){ visibility = vis; name = n; parameters = par;}
	
    public String getVisibility(){ return visibility;}
    public String getName(){return name;}
    public ParsedAttribute[] getParameters(){return parameters;}
	
	public String renderTemplate(Template t, String lang){
		ST methodtemplate = t.getMethodTemplate();
		Render r = new JavaRender();
		String listaparametri = "";
		for(int i=0; i<parameters.length;i++){
			ST attrtemplate = t.getAttributeTemplate();
			listaparametri += (r.FillAttributeTemplate(attrtemplate, parameters[i]));
			int g = listaparametri.length();
			if(i==parameters.length-1) 
				listaparametri = listaparametri.substring(0, g - 1);
			else{
					listaparametri += ",";
					g = listaparametri.length();
					listaparametri = listaparametri.substring(0, g - 2) + listaparametri.substring(g - 1) + " ";
			}
		}
		return (r.FillMethodTemplate(methodtemplate, this))+("("+listaparametri+")");
	};
}
