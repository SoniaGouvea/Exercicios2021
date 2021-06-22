public class TiposPrimitivos {
    public static void main(String[] args) {

        /*Declaramos 8 variaveis.Exatamente o mesmo dos tipos primitivos do Java.Cada variável eh de um dos tipos*/
        boolean bo;
        char c;
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
		/* atribuimos o valor 65 a variavel c, que eh do tipo char.
		 Obs importante: o tipo char também é um inteiro!
		 No entanto é um inteiro que faz referencia a tabela Unicode, que contem 65535 simbolos
		 */
        c = 65;
        System.out.println("==============================");
        System.out.println("Char");

        /* note a diferença entre a impressao das duas linhas abaixo:
         */
        System.out.println("=============================");
        System.out.println("O valor de c como char = " + c);
        System.out.printf("O valor de c como numero = %d \n", (int)c );
        System.out.println("-----------------------------");

		 /* como fica a impressao do código acima:
		  ==============================
          Char
          =============================
          O valor de c como char = A
          O valor de c como numero = 65
          -----------------------------
		  */
		 /* interessante notar que alem do println, podemos usar também o printf que aprendemos lá no C.
		  Vale aqui tudo o que aprendemos no Modulo 1 em relaçao a função Printf */

		 /*Agora vamos trabalhar com os outros tipos inteiros:byte, short e int

		  Veja que estamos trabalhando com o valor e que atribuimos esse valor a variavel b, que é do tipo byte. como esse valor
		  "cabe" em um short e em um int não ha problema nenhum quando atribuimos o valor de b à variavel s(short) e o valor de s à
		  variavel i (int)
		      */
        b = 10;
        s = b;
        i = s;

        System.out.println("===========================================");
        System.out.println("inteiros");
        System.out.println("===========================================");
        System.out.println("i = s = b = " + i);

		 /* Saida da impressao:
		  ===========================================
          inteiros
          ==========================================
          i = s = b = 10
          chamamos de 'conversão implìcita'
		  */

        /* Agora multiplicaremos i por 100 e atribuiremos o total dessa multiplicação ao proprio i
         */

        i *= 100;
        System.out.println("novo valor de i =" + i);

		 /*Saida da impressao:
		  * novo valor de i =1000

		  /* olhe para a linha de código abaixo com muita atenção. Eu tento colocar o valor de i em b, mas o Java não deixa.
		   * Preciso então, fazer um 'casting' ou conversão explicito. Antes da variavel i eu insiro entre parenteses() o
		   * tipo de dado para o qual eu quero convertê-la.Lembre-se que acima eu converti de byte para short e de short para int
		   * e isso não foi necessário. No entanto essa conversão acima tb foi um 'casting', só que foi 'um casting implícito'.
		   *
		   * Quando eu realizo a conversão abaixo algo vai dar errado.
		   * Imagine que vc pesagasse 10 copos de suco de laranja e jogasse o conteúdo dos 10 copos em uma jarra. Tranquilo, sem
		   * problemas! Agora imagine vc pegando o conteúdo da jarra e jogando em apenas um dos copos. Haverá uma perda considerável
		   * de suco!
		   * Depois da conversão de int para byte abaixo, onde atualmente o valor de i é 1000, o valor de b será igua a -24!
		   * Veja mais abaixo, pq isso acontece.
		   */
        b = (byte )i;
        System.out.println("O valor de b = " + b);

		/* Saida da impressão
		 *
		 O valor de b = -24

		 */

		 /* O que ocorre é que no lugar de o Java lançar uma exceção ou converter para zero, ele retira a parte binario do
		  * int e deixa apenas a do byte e aperesenta o que restou.

		  * Observe o esquema abaixo.

		  i = 1000 em binário --> 00000000 00000000 00000011 11101000
		  b = 1000 em binário --> -------- -------- -------- 11101000
		  Veja que boa parte do número é perdido, se vc pegar o que sobrou no b e fizer uma conversão de binário para decimal
		  usando complemento de dois vai chegar ao numero -24.

		  Portanto, saiba que o Java vai fazer esse tipo de conversão porque ele acha que vc programador sabe que poderá perder
		  bites nessa conversão.
		  */

        /* abaixo apenas inserimos o valor do int em um long que é o dobro de um int. ou seja, sem problemas!
         */

        l = i;

        System.out.println("O valor de l = " + l);
        System.out.println( "----------------------------------");

		 /* Saida da impressão:

		   O valor de l = 1000
           ----------------------------------
		  */

        /* Chegamos aos numeros com ponto flutuante (casas decimais) ex: 0,011
         */

        System.out.println("========================================");
        System.out.println("ponto flutuante");
        System.out.println("========================================");

        d = 125.32;
        System.out.println("Valor de d = " +d);
        d = 125.32d;
        System.out.println("Valor de d = " +d);
        d = 125.32f;
        System.out.println("Valor de d = " +d);

		 /* saida da impressão:

	        ========================================
            ponto flutuante
            ========================================
            Valor de d = 125.32
            Valor de d = 125.32
            Valor de d = 125.31999969482422

            */

		 	/* no primeiro caso atribuimos 125.32 a variavel d.
		 	 sem problemas, funciona legal, como podemos ver na saida da impressão.
		 	 logo depois atribuimos 125.32d/ mas pra que serve esse "d" depois do valor? Indica para o Java que estou afirmando
		 	 que a constante (125.32) é um double.
		 	 Os dois casos acima são idênticos. Como assim? Para o Java, o tipo padrão de um literal com ponto flutuante é double.
		 	 Portanto, 'não precisa colocar o 'd' depois do literal se quiser que ela seja double.

		 	 literal --> 125.32

		 	 Mas o terceiro caso é interessante. Atribuimos à variável 'd' o seguinte valor: 125.32f. Dessa vez estamos inserindo um
		 	 float num double, problema nenhum, pois o float é de 32 bit e o float é de 64 bits. Mas observe a saida da impressao.
		 	 Por que o numero da casa decimal é um valor quebrado? Investigue e comente na lista.
		 	 */
		 /* saida da impressão:

	        ========================================
         ponto flutuante
         ========================================
         Valor de d = 125.32
         Valor de d = 125.32
         Valor de d = 125.31999969482422

         */

        f = (float) 125.32;
        System.out.println("O valor de f = " + d);
        f = 125.32f;
        System.out.println("O valor de f = " + d);
        f = (float) 125.32d;
        System.out.println("O valor de f = " + d);
        System.out.println("-------------------------------------------");

		 /* Mesma coisa que foi feita com o Double, mas dessa vez com o float.
		  	Logo no primeiro caso é necessário fazer um casting já que estamos informando explicitamente que o literal
		  	é do tipo Double.
		  	É bom lembrar que ao converter de double para float, pode haver perda de bits.

		  		 Pergunta: Por que todos os valores sairam tão quebrados, em contraste com o double? Investigue e comente na lista.
		  		Saida da impressão:
		  		O valor de f = 125.31999969482422
                O valor de f = 125.31999969482422
                O valor de f = 125.31999969482422
-------------------------------------------
		  */
        /* Abordaremos agora o tipo booleano
         */

        System.out.println("========================================");
        System.out.println("booleano");
        System.out.println("========================================");

        bo = true;
        System.out.println("O valor de bo =" + bo);

        bo = (1 > 2 );
        System.out.println("O valor de bo =" + bo);

        bo = (f==d);
        System.out.println("O valor de bo =" + bo);

		 /*
		  O valor de true ou false pode ser atribuido sem problemas.
		  Se atribuimos uma operação á variavel . Essa operação será avaliada e seu valor será armazenado na variavel .
		  No caso de (1 > 2) sabemos que o resultado será false.
		  Depois testamos se f é igual a d. Observe que o operador de teste de igualdade é == semlehante á linguagem C.
		  Falaremos sobre os operados mais a frente.

		  Saida da impressao:
		  ========================================
          booleano
          ========================================
          O valor de bo =true
          O valor de bo =false
          O valor de bo =true
          */

        System.out.println("========================================");
        System.out.println("brincando com os tipo");
        System.out.println("========================================");

        System.out.println("Posso converter int para float?");

        System.out.println("i antes da conversão = " + i);
        System.out.println("i antes da conversão = " + f);
        f = i;
        System.out.println("i depois da conversão = " + i);
        System.out.println("i depois da conversão = " + f);

        System.out.println("--");
		 /*
		  Em nossa primeira brincadeira com os tipos, tentamos converter de int para float. Observe atentamente a saida
		  na impressao:

		  ========================================
Posso converter int para float?
i antes da conversão = 1000
i antes da conversão = 125.32
i depois da conversão = 1000
i depois da conversão = 1000.0

		  */
        f = (float)d;

        System.out.println("Posso converter float para int?");
        System.out.println("i antes da conversão = " + i);
        System.out.println("f antes da conversão = " + f);
        f = (int)f;
        System.out.println("i depois da conversão = " + i);
        System.out.println("f depois da conversão = " + f);
        System.out.println("------------------------------");

		 /* Depois da nossa primeira 'brincadeira' o valor de f ficou igua ao valor de i por isso atribuimos o valor de 'd' na
		  novamente à variavel f.

		  Agora o que queremos saber é que se é possivel atribuir um valor de float a um inteiro. O contrario foi possivel sem
		  um casting. mas dessa vez o casting será necessário. Mas, alem desse detalhe, outra coisa vai ocorrer.
		  pode ser desejável ou não. Comente na lista o que ocorreu nessa conversão de float para int e em que situação isso
		  seria desejável.
		  Saída da impressão:

		  */

    }

}

