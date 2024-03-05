/**
 * 
 */





/**
 * @author Ben Thompson
 */
public class Bowler {
	
	private int number;
	private int score1;
	private int score2;
	private int score3;
	
	/**
	 * No Argument Constructor
	 */
	public Bowler() {
		number = 000;
		score1 = 000;
		score2 = 000;
		score3 = 000;
	}
	
	/**
	 * Argument Constructor
	 * @param num
	 * @param s1
	 * @param s2
	 * @param s3
	 */
	public Bowler(int num, int s1, int s2, int s3) {
		number = num;
		score1 = s1;
		score2 = s2;
		score3 = s3;
	}
	
	/**
	 * Bowler Number ID setter
	 * @param num - Sets number to num
	 */
	public void setNumber(int num) {
		number = num;
	}
	
	/**
	 * Bowler Number ID getter
	 * @return - Returns number
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * 
	 * @param s1 - Sets score1 to s1
	 */
	public void setScore1(int s1) {
		score1 = s1;
	}
	
	/**
	 * 
	 * @return - Returns score1
	 */
	public int getScore1() {
		return score1;
	}
	
	/**
	 * 
	 * @param s2 - Sets score2 to s2
	 */
	public void setScore2(int s2) {
		score2 = s2;
	}
	
	/**
	 * 
	 * @return - Returns score2
	 */
	public int getScore2() {
		return score2;
	}
	
	/**
	 * 
	 * @param s3 - Sets score3 to s3
	 */
	public void setScore3(int s3) {
		score3 = s3;
	}
	
	/**
	 * 
	 * @return - Returns score3
	 */
	public int getScore3() {
		return score3;
	}
	
	
	public double bowlerAvg() {
		double average = (score1 + score2 + score3)/3;
		
		return average;
	}

}
