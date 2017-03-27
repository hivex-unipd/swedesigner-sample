package server.project;

import server.render.Render;
import server.render.java.JavaRender;
import server.template.Template;
import org.stringtemplate.v4.ST;

public class ParsedMethod implements ParsedElement {
	private String visibility;
	private String name;
	private String[] parameters;
	
	public ParsedMethod(String vis, String n, String[] par){ visibility = vis; name = n; parameters = par;}
	
    public String getVisibility(){ return visibility;}
    public String getName(){return name;}
    public String[] getParameters(){return parameters;}
	
	public String renderTemplate(Template t, String lang){
		ST methodtemplate = t.getMethodTemplate();
		Render r = new JavaRender();
		return r.FillMethodTemplate(methodtemplate, this);
	};
}
