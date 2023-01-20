import java.util.*;

class faceToFace_RightTriangle {
	public static void main(String args[]) {
		Scanner p = new Scanner(System.in);
        System.out.println("Enter a number: ");
		int N = p.nextInt();
        int i;

		for (i=1; i<=N; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for (int j=1; j<=2*(N-i); j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
        p.close();
	}
}