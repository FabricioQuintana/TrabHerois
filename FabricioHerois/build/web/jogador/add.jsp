<%@include file="../cabecalho.jsp"%>

<div>
<h1>Novo jogador</h1>
<div>
    <form action="add-ok.jsp" method="post">

            <label>Email:</label>
            <input type="text" name="txtemail" placeholder="Digite o novo email">


            <label>Senha:</label>
            <input type="text" name="txtsen" placeholder="Digite  nova senha">



            <label>Login:</label>
            <input type="text" name="txtlog" placeholder="Digite o novo login">

            <input type="reset" value="Limpar">
            <input type="submit" value="Enviar">
    </form>
</div>
</div>
</body>
</html>
