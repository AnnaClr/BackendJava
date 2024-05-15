public class Condicionais {
    public static void main(String[] args) throws Exception {
        // CONDICIONAIS SIMPLES:
        double saldo = 25.0;
        double valorSolicitado = 17.0;
 
        if(valorSolicitado < saldo)
         saldo = saldo - valorSolicitado;
 
         System.out.println(saldo);

        // CONDICIONAIS COMPOSTAS:
        int nota = 6;
       
        if(nota >= 7)
         System.out.println("Aprovado");
 
        else
         System.out.println("Reprovado");

        // CONDICIONAIS ENCADEADAS:
        int nota1 = 6;

        if (nota1 >= 7)
            System.out.println("Aprovado");
        else if (nota1 >= 5 && nota1 < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");

        // CONDIÇÃO TERNÁRIA
        // Cenário 1:
        int nota2 = 7;
		String resultado = nota2 >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
        // Cenário 2:
        int nota3 = 6;
		String result = nota3 >=7 ? "Aprovado" : nota3 >=5 && nota3 <7 ? "Recuperação" : "Reprovado";
		System.out.println(result);

        // SWITCH CASE:
        // Condicional If/Else
        String sigla = "M";

		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MÉDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");

        // Condicional Switch Case:
        String sigla1 = "M";

		switch (sigla1) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
			
		// Modo condicional convencional:
        String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}

        // Modo condicional switch Case:
        String plano1 = "M"; // M / T
        switch (plano1) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}

    }
}
