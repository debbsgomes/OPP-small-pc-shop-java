package trabalho_oo_uva;

import java.util.Scanner;

public class ServiceComputador {

	public static void main(String[] args) {
		
		Computador computador1 = new Computador();
		Computador computador2 = new Computador();
		Computador computador3 = new Computador(8, 256, "positivo", 5000 , true);
		Computador computador4 = new Computador(4, 120, "casimiro", 2000, false);
		
		inputUsuario(computador1);		
		inputUsuario(computador2);
		
		System.out.println("\ncomputador 1 " + computador1.imprimir());
		System.out.println("\ncomputador 2 " + computador2.imprimir());
		
		System.out.println("\ncomputador 3 " + computador3.imprimir());
		System.out.println("\ncomputador 4 " + computador4.imprimir());
	}
	
	public static void inputUsuario(Computador computador) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira o valor da memória Ram: ");
		computador.setMemoriaRam(scanner.nextInt());
		System.out.println("Insira o valor do SSD: ");
		computador.setSsd(scanner.nextInt());
		System.out.println("Insira o modelo da placa mãe: ");
		computador.setPlacaMae(scanner.next());
		System.out.println("Insira o preço do computador: ");
		computador.setPreco(scanner.nextFloat());
		System.out.println("Insira se está disponível em estoque: ");
		computador.setEstoque(scanner.nextBoolean());
	}
}
