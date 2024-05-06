// ANATOMIA DAS CLASSES - AULAS 5-6

package edu.ana.pasta1;
public class BoletimEscolar {
    public static void main(String[] args) {
      int mediaFinal = 6;
      if(mediaFinal > 6)	
        System.out.println("APROVADO"); 
      else if(mediaFinal == 6)
        System.out.println("PROVA MINERVA"); 
      else
        System.out.println("REPROVADO"); 		
    }

      // NÃO RECOOMENDADO: 
      // double salMedio = 1500.23  //variável abreviada, o que dificulta a compreensão
      // String emails = "aluno@escola.com" //confuso se a variável seria um array ou único e-mail
      // String myName = "JOSEPH" //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não 
      
      // RECOMENDADO:
      // double salarioMedio=1500.23;
      // String email ="aluno@escola.com";
      // String [] emails = {"aluno@escola.com","professor@escola.com"}
      // String meuNome = "JOSEPH" 
      
      // MÉTODOS:
      // Os métodos deverão ser nomeados como verbos, através de uma mistura de letras minúsculas e maiúsculas. Em princípio todas as letras que compõem o nome devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta, a partir da segunda palavra.
      // Exemplos sugeridos para nomenclatura de métodos:
      // somar(int n1, int n2){}
      // abrirConexao(){}
      // concluirProcessamento() {}
      // findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada
      // calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade


}
