package server.render;

import org.stringtemplate.v4.ST;

import server.project.ParsedAttribute;
import server.project.ParsedMethod;

public interface Render {
	public String FillAttributeTemplate(ST st, ParsedAttribute p);
	public String FillMethodTemplate(ST st, ParsedMethod p);
}
