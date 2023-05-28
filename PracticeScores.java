
public class PracticeScores {

	public static void main(String[] args) {
		int[] englishScores = {765, 820, 440, 530, 900, 960, 735};
		double total = 0;
		for(int i : englishScores) {
			total += i;
		}
		double ave = total / englishScores.length;
		System.out.println(ave);
		
//		double ave_second = 0.01 * ( Math.round(ave*100) );
		double ave_second = 0.01 * (double)((int)(ave*100 + 0.5));
		System.out.println(ave_second);

	}

}
