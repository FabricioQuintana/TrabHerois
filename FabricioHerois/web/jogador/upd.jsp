<%@include file= "../cabecalho.jsp"%>
<div>
        <h1>Editar jogador</h1>
        <div>
            <form action="upd-ok.jsp" method="post">
          
            <label>email:</label>
            <input type="text" name="txtemail" placeholder="Editar email">


            <label>senha:</label>
            <input type="text"  name="txtsen" placeholder="Editar senha">



            <label>login:</label>
            <input type="text" name="txtlog" placeholder="Editar login">

            <input type="reset" value="Limpar">
            <input type="submit" value="Enviar">
                
            </form>
        </div>
</div>
    </body>
</html>
