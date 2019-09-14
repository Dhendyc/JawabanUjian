//package belajarweb;

public class Soal3 {
	
	public static void drawImage(int N) {
		
		if (N%2 == 0) {
			System.out.println("input harus ganjil!");
			return;
		}
		
		for (int i=0; i<N-1; i+=2) {
			for (int j=i; j<N-1; j+=2) {
				System.out.print("=");
			}
			
			for (int j=-1; j<i; j++) {
				System.out.print("@");
			}
			
			for (int j=i; j<N-1; j+=2) {
				System.out.print("=");
			}
			
			System.out.println();
		}
		
		for (int i=0; i<N; i+=2) {
			
			for (int j=0; j<i; j+=2) {
				System.out.print("=");
			}
			
			for (int j=i; j<N; j++) {
				System.out.print("@");
			}
			
			for (int j=0; j<i; j+=2) {
				System.out.print("=");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		drawImage(5);

	}

}
