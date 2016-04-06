package org.apache.jsp.editora;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/editora/../cabecalho.jsp/");
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link  rel='stylesheet' href=\"detalhes/cabe.css\"/>\n");
      out.write("        <link  rel='stylesheet' href=\"../tab.css\"/>\n");
      out.write("        <title>Sistema Heróis</title>\n");
      out.write("    </head>\n");
      out.write("    <div class=\"co\">\n");
      out.write("        <h1 class=\"lin\"><p>Super herois</p></h1>\n");
      out.write("    <nav class=\"lin\">\n");
      out.write("        <a href=\"categoria/\">Categoria</a> -\n");
      out.write("        <a href=\"regiao/\">Região</a> - \n");
      out.write("        <a href=\"equipe/\">Equipe</a> - \n");
      out.write("        <a href=\"editora/\">Editora</a> -\n");
      out.write("        <a href=\"jogador/\">Jogador</a>\n");
      out.write("    </nav>\n");
      out.write("    </div>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h1>Editora</h1>\n");
      out.write("<div>\n");
      out.write("    <a href=\"add.jsp\">Novo Cadastro</a>\n");
      out.write("    <form>\n");
      out.write("        <input type=\"text\" placeholder=\"digite o texto da pesquisa\" />\n");
      out.write("        <input type=\"submit\" value=\"Pesquisar\"/><br />\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("            <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>Código -</th>\n");
      out.write("            <th>Nome -</th>\n");
      out.write("            <th>Data de fundação -</th>\n");
      out.write("            <th>Ações</th>\n");
      out.write("    \n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <th>1</th>\n");
      out.write("            <th>xxxxx</th><br/>\n");
      out.write("            <th>xx/xx/xx</th>\n");
      out.write("            <td><a href=\"upd.jsp\">Editar</a></td>\n");
      out.write("            <th><a href=\"del.jsp\">Excluir</a></th>\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <th>2</th>\n");
      out.write("            <th>xxxxx</th>\n");
      out.write("            <th>xx/xx/xx</th>\n");
      out.write("            <th>Editar</th>\n");
      out.write("            <th>Excluir</th>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <th>3</th>\n");
      out.write("            <th>xxxxx</th>\n");
      out.write("            <th>xx/xx/xx</th>\n");
      out.write("            <th>Editar</th>\n");
      out.write("            <th>Excluir</th>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
