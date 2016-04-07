<%@include file= "../cabecalho.jsp"%>
<div>
        <h1>Nova região</h1>
        <div>
            <form action="add-ok.jsp" method="post">

            <label>Nome:</label>
            <input type="text" name="txtnome" placeholder="Digite o novo nome">



            <label>Descrição:</label>
            <input type="text" name="txtdes" placeholder="Digita a nova descrição">

   <input type="reset" value="Limpar">
        <input type="submit" value="Enviar">
                
            </form>
        </div>
</div>
    </body>
</html>
