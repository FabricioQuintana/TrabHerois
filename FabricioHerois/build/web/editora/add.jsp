<%@include file="../cabecalho.jsp"%>

<div>
    <h1>Nova editora</h1>
    <div>
        <form action="add-ok.jsp" method="post">
       

            <label>Nome:</label>
            <input type="text" name="txtnome" placeholder="Digite o novo nome">



            <label>Data de fundação:</label>
            <input type="text" name="txtdata" placeholder="Digite a nova data">

   <input type="reset" value="Limpar">
        <input type="submit" value="Enviar">
        </form>
     
    </div>
</div>
</body>
</html>
