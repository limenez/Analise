import java.util.Scanner;

// A classe do nosso projeto
public class AnaliseCondicional {
    // Iremos criar os métodos 
	public static void main(String[] args) {
		// Criando uma variável
		int tempo;
		
		//Fazer a chamada de um objeto um componente
		Scanner teclado = new Scanner(System.in);
		/// Mensagem de interação com o usuário
		System.out.println("Digite que horas são:");
		
		// Vinculando a informação do Scanner para uma varável
		tempo = teclado.nextInt();
		
		// Criando um processo condicional
		if(tempo<=12) {
			System.out.println("Olá bom diaaaaa");
		}else if(tempo<=18) {
			System.out.println("Olá boa tarde");
		}else
			System.out.println("Bom noite");
		
		}

	}


