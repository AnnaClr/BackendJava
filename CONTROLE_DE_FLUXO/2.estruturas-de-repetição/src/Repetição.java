public class Repetição {
    public static void main(String[] args) throws Exception {
        // >>>>> FOR <<<<<
        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}

        // Outras estruturas:
        // estrutura 1:
        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }

        // estrutura 2:
        // o que importa é somente o bloco condicional.
        int carneirinhos = 1;
        for( ; carneirinhos <=20; ) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
            carneirinhos ++;
        }

        // // for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da execução )

        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        // >>>>> FOR EACH <<<<<

        String estudantes [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        // Forma abreviada:
        for(String estudante : estudantes) {
        System.out.println(estudantes);
        }

        // >>>>> BREAK E CONTINUE <<<<
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            
            System.out.println(numero);
            // Qual a saída no console ?
        }

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            
            System.out.println(numero);
            // Qual a saída no console ?
        }
    }
}
