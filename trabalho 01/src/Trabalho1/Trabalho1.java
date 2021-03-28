package Trabalho1;

import java.util.Scanner;

public class Trabalho1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // para usar o scanner e ler o teclado.
		int opcao;
		do {
			System.out.println("Olá, escolha uma das opções abaixo!\n");
			System.out.println("\n1. Quadrado\n2. Retângulo\n3. Triângulo\n4. Círculo\n9. Sair");
			opcao = scanner.nextInt();
			
			if(opcao == 1) {
				System.out.println("Digite o lado do quadrado: ");
				
				Quadrado q = new Quadrado(scanner.nextDouble());
				System.out.printf("A área do quadrado é igual a: %f\n", q.area() ); //printf para exibir o valor de um float (%f).
			}
			
			
			if(opcao == 2) {
				double lado, base;
				System.out.println("Digite o lado do retângulo: ");
				lado = scanner.nextDouble();
				System.out.println("Digite a base do retângulo: ");
				base = scanner.nextDouble();
				Retangulo r = new Retangulo(lado, base); //construtor
				System.out.printf("A área do retângulo é igual a: %f\n", r.area() );
					
			}
			
			if(opcao == 3) {
				double altura, base;
				System.out.println("Digite a base do triângulo: ");
				base = scanner.nextDouble();
				System.out.println("Digite a altura do triângulo: ");
				altura = scanner.nextDouble();
				Retangulo r = new Retangulo(altura, base); 
				System.out.printf("A área do triângulo é igual a: %f\n", r.area()/2 ); // usei a base de código do retângulo, simplesmente divindo por no final para achar a área.
			}
			
			if(opcao == 4) {
				System.out.println("Digite o raio do círculo: ");
				
				Circulo c = new Circulo(scanner.nextDouble());
				System.out.printf("A área do círculo é igual a: %f\n", c.area() );
			
			}
			
			if( !((opcao >= 1 && opcao <= 4) || opcao == 9)  ) {							//usei o exclamação para negar o que está dentro.(diferente)
				System.out.println("Opção inválida! Por favor, digite uma opção correta!\n");
			}	
			
		
		} while(opcao != 9); //com o while cria-se um looping.
		
		
		System.out.println("Obrigado e até logo!");
		
		
			
		scanner.close(); //para fechar o leitor.		

	}
}
