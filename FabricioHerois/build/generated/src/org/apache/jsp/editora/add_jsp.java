package org.apache.jsp.editora;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/editora/../cabecalho.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>  \n");
      out.write("        <title>Sistema Heróis</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link  rel='stylesheet' href=\"detalhes/cabe.css\"/>\n");
      out.write("        <link  rel='stylesheet' href=\"../tab.css\"/>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"co\">\n");
      out.write("        <h1 class=\"lin\"><p>Super herois</p></h1>\n");
      out.write("    <nav class=\"lin\">\n");
      out.write("        <a href=\"../home\">Home</a> -\n");
      out.write("        <a href=\"../regiao\">Região</a> - \n");
      out.write("        <a href=\"../equipe\">Equipe</a> - \n");
      out.write("        <a href=\"../editora\">Editora</a> -\n");
      out.write("        <a href=\"../jogador\">Jogador</a> -\n");
      out.write("        <a href=\"../categoria\">Categoria</a>\n");
      out.write("    </nav>\n");
      out.write("    </div>");
      out.write("\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <h1>Nova editora</h1>\n");
      out.write("    <div>\n");
      out.write("        <form action=\"add-ok.jsp\" method=\"post\">\n");
      out.write("       \n");
      out.write("\n");
      out.write("            <label>Nome:</label>\n");
      out.write("            <input type=\"text\" name=\"txtnome\" placeholder=\"Digite o novo nome\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <label>Data de fundação:</label>\n");
      out.write("            <input type=\"text\" name=\"txtdata\" placeholder=\"Digite a nova data\">\n");
      out.write("\n");
      out.write("   <input type=\"reset\" value=\"Limpar\">\n");
      out.write("        <input type=\"submit\" value=\"Enviar\">\n");
      out.write("        </form>\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
