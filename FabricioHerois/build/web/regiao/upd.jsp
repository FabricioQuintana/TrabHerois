<%@include file= "../cabecalho.jsp"%>
<div>
        <h1>Editar Regi�o</h1>
        <div>
            <form action="upd-ok.jsp" method="post">S
  
                   <label>C�digo:</label>
            <input type="text" name="txtcod" value="1" readonly  placeholder="Editar codigo">


                
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
