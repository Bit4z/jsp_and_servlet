package ziya.com.jsp;

import java.io.IOException;
import java.util.jar.JarException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TagContext extends TagSupport{


	public int doStartTag()throws JspException{
		JspWriter out=pageContext.getOut();
		try {
			out.print("<hr>");
			out.print("this is the custum tag");
			out.print("<hr>");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return SKIP_BODY;
		
	}

}
