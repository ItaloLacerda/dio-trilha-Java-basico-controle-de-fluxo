import java.util.Scanner;

/**
 * A Classe contador tem o objetivo realizar uma contagem da diferença de dois valores inceridos pelo usiario via terminal
 * @author Italo Lacerda
 * @since 08/27/2023
 * @version 1.0
 */

public class Contador {
	/**
	 * Metedo principal responsavel pela execução do programa.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}

	/**
	 * Metodo responsavel por realizar a contagem da diferença de dois valores.
	 * @param parametroUm Inteiro que sera o subtraendo.
	 * @param parametroDois Inteiro que sera o minuendo.
	 * @throws ParametrosInvalidosException
	 */
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

		if (parametroUm > parametroDois)
			throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;

		for (int i = 1; i <= contagem ; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}
