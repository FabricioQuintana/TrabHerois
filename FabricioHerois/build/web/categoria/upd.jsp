<%@include file= "../cabecalho.jsp"%>
<div>
        <h1>Editar Categoria</h1>
        <div>
            <form action="upd-ok.jsp" method="post">
                          
           <label>C�digo:</label>
            <input type="text" name="txtcod" value="1"readonly  placeholder="Editar codigo">


            <label>Nome:</label>
            <input type="text" name="txtnome" placeholder="Editar nome">



            <label>Descri��o:</label>
            <input type="text" name="txtdes" placeholder="Editar descri��o">

   <input type="reset" value="Limpar">
        <input type="submit" value="Enviar">
                
            </form>
        </div>
</div>
    </body>
</html>
