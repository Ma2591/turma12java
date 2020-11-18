package Lista4Exe3;
import java.util.Scanner;
public class Lista4Exe3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1[][] = new int[4][6], n2[][] = new int[4][6], m1[][] = new int[4][6], m2[][] = new int[4][6];
		System.out.println("Matriz N1: \n");
		for (int lin = 0; lin < 4; lin++) {
			for (int col = 0; col < 6; col++) {
				n1[lin][col] = (int) (Math.random() * 100);
				System.out.print("[" + n1[lin][col] + "]");
			}
			System.out.println("\n");
		}
		System.out.println("\n_________________________________\n\n");
		System.out.println("Matriz N2: \n");
		for (int lin = 0; lin < 4; lin++) {
			for (int col = 0; col < 6; col++) {
				n2[lin][col] = (int) (Math.random() * 100);
				System.out.print("[" + n2[lin][col] + "]");
			}
			System.out.println("\n");
		}
		System.out.println("\n_________________________________\n\n");
		System.out.println("Matriz M1(Soma de N1 e N2): \n");
		for (int lin = 0; lin < 4; lin++) {
			for (int col = 0; col < 6; col++) {
				m1[lin][col] = n1[lin][col] + n2[lin][col];
				System.out.print("[" + m1[lin][col] + "]");
			}
			System.out.println("\n");
		}
		System.out.println("\n__________________________________\n\n");
		System.out.println("Matriz M2(Subtração de N1 e N2): \n");
		for (int lin = 0; lin < 4; lin++) {
			for (int col = 0; col < 6; col++) {
				m2[lin][col] = n1[lin][col] - n2[lin][col];
				System.out.print("[" + m2[lin][col] + "]");
			}
			System.out.println("\n");
		}
		System.out.println("\n_________________________________\n");
		ler.close();
	}
}
	
	


