
<%
if(request.getParameter("txemail")==null){
    response.sendRedirect("index.jsp");
}
if(request.getParameter("txtemail").isEmpty()){
    response.sendRedirect("index.jsp");
}
%>
<%@include file="../cabecalho.jsp"%>
<h1>Novo cadastro</h1>
<div>
    Cadastrado com sucesso.<br />

    <a href="index.jsp">Voltar para Listagem</a>
</div>
</body>
</html>