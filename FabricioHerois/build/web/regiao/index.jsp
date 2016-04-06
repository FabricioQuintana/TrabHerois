<%@include file="../cabecalho.jsp"%>
<h1>Região</h1>
<div>
    <a href="add.jsp">Novo Cadastro</a>
    <form>
        <input type="text" placeholder="digite o texto da pesquisa" />
        <input type="submit" value="Pesquisar"/><br />
    </form>
            <table>
        <tr>
            <th>Código - </th>
            <th>  Nome - </th>
            <th>  Descrição - </th>
            <th>    Ações </th>
        </tr>
        
        <tr>
            <th>1</th>
            <th>xxxxx</th><br/>
            <th>xxxxxxxxx </th>
            <td><a href="upd.jsp">Editar</a></td>
            <th><a href="del.jsp">Excluir</a></th>
        </tr>
        
        <tr>
            <th>2</th>
            <th>xxxxx</th>
            <th>xxxxxxxxx</th>
            <th>Editar</th>
            <th>Excluir</th>
        </tr>
        
        <tr>
            <th>3</th>
            <th>xxxxx</th>
            <th>xxxxxxxxx</th>
            <th>Editar</th>
            <th>Excluir</th>
        </tr>
            </table>
</div>
</body>
</html>
