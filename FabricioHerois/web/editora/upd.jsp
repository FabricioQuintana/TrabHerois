<%@include file= "../cabecalho.jsp"%>
<div>
        <h1>Editar editora</h1>
        <div>
            <form action="upd-ok.jsp" method="post">
     

                    <label>Código:</label>
            <input type="text" name="txtcod" value="1" readonly  placeholder="Editar codigo">
            
            <label>Nome:</label>
            <input type="text" name="txtnome" placeholder="Editar nome">



            <label>Data de fundação:</label>
            <input type="text" name="txtdata" placeholder="Editar data">

   <input type="reset" value="Limpar">
        <input type="submit" value="Enviar">
            </form>
        </div>
</div>
    </body>
</html>
