<%@include file= "../cabecalho.jsp"%>
<div>
        <h1>Nova regi�o</h1>
        <div>
            <form action="add-ok.jsp" method="post">

            <label>Nome:</label>
            <input type="text" name="txtname" placeholder="Digite o novo nome">



            <label>Descri��o:</label>
            <input type="text" name="txtdes" placeholder="Digita a nova descri��o">

   <input type="reset" value="Limpar">
        <input type="submit" value="Enviar">
                
            </form>
        </div>
</div>
    </body>
</html>
