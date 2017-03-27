package server.render.java;

import org.stringtemplate.v4.ST;

import server.project.ParsedAttribute;
import server.project.ParsedElement;
import server.render.Render;

public class JavaRender implements Render {

	@Override
	public String FillAttributeTemplate(ST st, ParsedAttribute p) {
		// TODO Auto-generated method stub
		st.add("visibility", p.getVisibility());
		st.add("type", p.getType());
		st.add("name", p.getName());
		st.add("value", p.getValue());
		return st.render();
	}

}
