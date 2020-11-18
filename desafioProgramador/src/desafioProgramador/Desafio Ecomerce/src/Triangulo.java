import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double base1 = 0, altura1 = 0, base2 = 0, altura2 = 0, area1 = 0, area2 = 0;
		
		while (base1 <= 0 || altura1 <= 0 || altura2 <= 0 || base2 <= 0) {
			System.out.println("Digite a base do primeiro triângulo: ");
			base1 = read.nextDouble();
			System.out.println("Digite a altura do primeiro triângulo: ");
			altura1 = read.nextDouble();
			System.out.println("Digite a base do segundo triângulo: ");
			base2 = read.nextDouble();
			System.out.println("Digite a altura do segundo triângulo: ");
			altura2 = read.nextDouble();
		}
		
		area1 = (base1 * altura1) / 2;
		area2 = (base2 * altura2) / 2;
		
		System.out.printf("Triângulo 1: \nBase: %.2f\tAltura: %.2f\tÁrea: %.2f\n",
				base1, altura1, area1);
		System.out.printf("Triângulo 2: \nBase: %.2f\tAltura: %.2f\tÁrea: %.2f\n",
				base2, altura2, area2);
		
		if (area1 > area2) {
			System.out.println("O triângulo 1 tem maior área!");
		} else if (area2 > area1) {
			System.out.println("O triângulo 2 tem maior área!");
		} else {
			System.out.println("Os dois triângulos tem o mesmo tamanho!");
		}
		
	}
}
