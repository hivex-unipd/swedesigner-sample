package server;

import server.project.ParsedAttribute;
import server.project.ParsedMethod;
import server.template.Template;
import server.template.java.JavaTemplate;

public class ProvaMain {
	public static void main(String[] args){
		Template t = new JavaTemplate();
		
		/*ParsedAttribute[] arrayAttr;
		arrayAttr = new ParsedAttribute[3];
		arrayAttr[0] = new ParsedAttribute("public", "int", "x", "1");
		arrayAttr[1] = new ParsedAttribute("private", "int", "y", null);
		arrayAttr[2] = new ParsedAttribute(null, "int", "z", "2");
		
		for(int i = 0; i<arrayAttr.length; i++)
			System.out.println(arrayAttr[i].renderTemplate(t, "java"));*/
		
		ParsedAttribute[] arrayAttr;
		arrayAttr = new ParsedAttribute[2];
		arrayAttr[0] = new ParsedAttribute("public", "int", "x", null);
		arrayAttr[1] = new ParsedAttribute("private", "int", "y", null);
		
		
		ParsedMethod x = new ParsedMethod("public", "pippo", arrayAttr);
			System.out.println(x.renderTemplate(t, "java"));
	}

}
