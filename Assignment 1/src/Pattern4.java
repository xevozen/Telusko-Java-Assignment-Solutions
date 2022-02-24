
public class Pattern4 {
	public static void main(String args[]) {
		int rows = 5;
		
		for(int i = 0; i<rows; i++) {
			System.out.print("$");
		}
		System.out.println();
		for(int i = 1; i<rows-1; i++) {
			System.out.print("$");
			for(int j = 1; j<rows-1; j++) {
				System.out.print(" ");
			}
			System.out.print("$\n");
		}
		for(int i = 0; i<rows; i++) {
			System.out.print("$");
		}
		System.out.println();
	}
}
