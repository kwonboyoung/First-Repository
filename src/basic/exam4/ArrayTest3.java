package basic.exam4;

public class ArrayTest3 {
	public static void main(String[] args) {
		// int[열]
		// int[행][열]
		// int[표][행][열]
		// int[더미][표][행][열]

		int score[][] = { 
				
				{ 100, 90, 80, 70 }, 
				{ 90, 80, 70, 60 }, 
				{ 80, 70, 60, 50 }
				
				
		};
		String name[] = {"유재하","신해철","서태지"};

		/*
		 * System.out.println(score[1][2]); //70
		 * 
		 * System.out.println(score[2][0]); //80
		 */

		int rowlen = score.length;
		
		System.out.println("\t국어\t영어\t수학\t철학\t총점\t평균");
		
		
		for (int row = 0; row < rowlen; row++) {
			int sum=0;
			System.out.print(name[row]+"\t");
			for(int col=0; col < score[row].length; col++){
				System.out.print(score[row][col]+"\t");
				sum += score[row][col];
			}
			int avg = sum/(score[row].length);
			System.out.print(sum+"\t");
			System.out.println(avg);
		}
	}
}
