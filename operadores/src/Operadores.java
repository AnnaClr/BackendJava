public class Operadores {
    public static void main(String[] args) throws Exception {
        // >>>>> OPERADORES JAVA: <<<<<

        String nome = "Ana Clara"; // literal, caracteres, alabetico...
        System.out.println(nome);
        
        int idade = 18; // valores númericos.
        System.out.println(idade);
        
        double peso = 48.5; // valores númericos.
        System.out.println(peso);
        
        char sexo = 'M'; 
        System.out.println(sexo);
       
        boolean doadorOrgao = false; // valor lógico {Verdadeiro ou falso}.
        System.out.println(doadorOrgao);

        // >>>>> OPERADORES ARITMÉTICOS: <<<<<

        double soma = 10.5 + 15.7;
        System.out.println(soma);

        int subtração = 113 - 25;
        System.out.println(subtração);

        int multiplicação = 20 * 7;
        System.out.println(multiplicação);

        int divisão = 15 / 3;
        System.out.println(divisão);

        int modulo = 18 % 3;
        System.out.println(modulo);

        double expressao = (10 * 7) + (20 / 4);
        System.out.println(expressao);

        // OBS: O operador de adição (+), quando usado em variaveis tipo texto, realizará a "concatenação de texto".
       
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        // QUAL O RESULTADO DAS OPERAÇÕES ABAIXO?
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        // >>>>> OPERADORES UNÁRIOS: <<<<<

        // (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
        // (-) Operador unário de valor negativo – nega um número ou expressão aritmética;
        // (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
        // (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
        // (!) Operador unário lógico de negação – nega o valor de uma expressão booleana.

        int numero = 5;
        System.out.println(numero);
		
        // Imprimindo o numero negativo
        System.out.println(- numero);

        // incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        // incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++); // ops algo de errado não está certo
        System.out.println(numero); // agora sim, numero virou 7

        // ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);

        // >>>>> OPERADORES TERNÁRIOS: <<<<<
        // O operador ternário é representado pelos símbolos "?" e ":" utilizados na seguinte estrutura de sintaxe:
        // <Expressão Condicional>`` ? ``<Caso condição seja true>`` : ``<Caso condição seja false>

        int a, b;
        a = 5;
        b = 6;

        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE:
        String result = " ";
        if(a==b)
            result = "verdadeiro";
        else
            result = "falso";
        System.out.println(result);

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO:
        String resultado = (a==b) ? "verdadeiro" : "falso";
        System.out.println(resultado);

        // >>>>> OPERADORES RELACIONAIS: <<<<<

        // == Quando desejamos verificar se uma variável é IGUAL A outra.
        // != Quando desejamos verificar se uma variável é DIFERENTE da outra.
        // > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
        // >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
        // < Quando desejamos verificar se uma variável é MENOR QUE outra.
        // <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

        int num1 = 1;
        int num2 = 2;

        if(num1 > num2)
            System.out.println("Numero 1 maior que numero 2");

        if(num1 < num2)
            System.out.println("Numero 1 menor que numero 2");

        if(num1 >= num2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(num1 <= num2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(num1 != num2)
            System.out.println("Numero 1 é diferente de numero 2");

        
        String nomeUm = "Ana Clara";
        String nomeDois = new String("Ana Clara");
        System.out.println(nomeUm == nomeDois); 
        System.out.println(nomeUm.equals(nomeDois)); 

        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); // true

        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); // false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); // true
        
        // equals na parada
        System.out.println(nome1.equals(nome2)); // ??
        System.out.println(nome2.equals(nome3)); // ??
        System.out.println(nome3.equals(nome4)); // ??

        int numero1 = 130;
        int numero2 = 130;
        System.out.println(numero1 == numero2); // true
        
        Integer number1 = 130;
        Integer number2 = 130;

        System.out.println(number1 == number2); // false
        
        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals
        
         System.out.println(number1.equals(number2)); 

        // >>>>> OPERADORES LÓGICOS: <<<<<

        // Os operadores lógicos, representam o recurso que nos permite criar expressões lógicas maiores, a partir da junção de duas ou mais expressões.
        // && Operador Lógico "E"
        // || Operador Lógico "OU"

        boolean condicao1= true;
        boolean condicao2= false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if(condicao1 && condicao2)
            System.out.println("Os dois valores precisam ser verdadeiros");;

        // Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.println("Um dos valores precisa ser verdadeiro");

        // ComparacaoAvancada.java
        int firstNum = 1;
        int SecondNum = 1;

        if(firstNum== 2 & SecondNum ++ == 2 )
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 1 agora é " + firstNum);
        System.out.println("O numero 2 agora é " + SecondNum);

        // Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )
        // O mesmo acontece com o operador | e || , considerando que operador, agora representa que se uma das alternativas for verdadeira, a outra nem precisa ser avaliada.

    }
}
