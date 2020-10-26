import java.util.Scanner;

public class OrdenandoNumeros {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int[] array = new int [10];
		
		for(int i = 0; i<array.length; i++) {
			int valorDigitado = Integer.parseInt(leitor.nextLine());
			array[i] = valorDigitado;
		}
		ordenarArray(array);
		leitor.close();
	}
	
	public static void ordenarArray(int[] array) {
		for(int i = 0; i<array.length; i++) {
			int posicaoMenorNumero = i;
			for(int j = i; j<array.length; j++) {
				if(array[j] < array[posicaoMenorNumero]) {
					posicaoMenorNumero=j;
				}
			}
			int temporario = array[i];
			array[i]=array[posicaoMenorNumero];
			array[posicaoMenorNumero]=temporario;
		}
		System.out.println("ordenado:");
		for (int i : array) {
			System.out.println(i);
		}
	}
	
	
}
