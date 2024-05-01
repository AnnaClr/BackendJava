// ANATOMIA DAS CLASSES - AULAS 1-4

package edu.ana.pasta2;
public class MyClass {
    public static void main(String[] args) {
        
    // String BR = "Brasil";
    // double PI = 3.14;
    // int ESTADOS_BRASILEIRO = 27;
    // int ANO_2000 = 2000;

    // Declaração INVÁLIDA de variáveis:
    // int numero&um = 1; // Os únicos símbolos permitidos são _ e $.
    // int 1numero = 1;   // Uma variável não pode começar com númerico.
    // int numero um = 1; // Não pode ter espaço no nome da variável.
    // int long = 1; // long faz parte das palavras reservadas da linguagem.
    
    // Declaração VÁLIDA de variáveis:
    // int numero$um = 1;
    // int numero1 = 1;
    // int numeroum = 1;
    // int longo = 1;

    // ESTRUTURA:
    // Tipo NomeBemDefinido = Atribuição // (opcional em alguns casos)

    // EXEMPLO:
    // int idade = 23;
    // double altura = 1.62;
    // Dog spike; // observe que aqui a variável spike não tem valor, é normal.
    
    // Declarar métodos em Java segue uma estrutura bem simples:
    
    // ESTRUTURA:
    // TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

    // EXEMPLO:
    // int somar (int numeroUm, int numero2)
    // String formatarCep (long cep) 

    String primeiroNome = "Ana";
    String segundoNome = "Clara";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    } 
}
 