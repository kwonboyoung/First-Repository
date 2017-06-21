package basic.exam4;

public class ArrayTest4 {
	public static void main(String[] args) {
		// int[열]
		// int[행][열]
		// int[표][행][열]
		// int[더미][표][행][열]

		String name[] = { "유재하", "신해철", "서태지" };

		int score[][][] = { { { 100, 90, 80, 70 }, { 90, 80, 70, 60 }, { 80, 70, 60, 50 } },
				{ { 100, 90, 80, 70 }, { 90, 80, 70, 60 }, { 80, 70, 60, 50 } }, };
	

		for(int tab=0; tab<score.length; tab++){
			System.out.println((tab+1)+"학기 성적표");
			System.out.println("\t국어\t영어\t수학\t철학\t총점\t평균");
			for (int row = 0; row < score[tab].length; row++) {
				int sum = 0;
				System.out.print(name[row] + "\t");
				for (int col = 0; col < score[tab][row].length; col++) {
					System.out.print(score[tab][row][col] + "\t");
					sum += score[tab][row][col];
				}
				int avg = sum / (score[tab][row].length);
				System.out.print(sum + "\t");
				System.out.println(avg);
			}
			System.out.println("");
		}
	}
}