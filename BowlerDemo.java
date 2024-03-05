
/**
 * 
 */

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Mid Term Project
 * @author Ben Thompson
 */
public class BowlerDemo {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f1 = new File("scores.txt");
		Scanner scores = new Scanner(f1);
		Scanner scnr = new Scanner(System.in);
		String all = scores.nextLine();
		StringTokenizer pure = new StringTokenizer(all, ", ");

		// Array to hold raw int values from txt file
		int[] raw = new int[pure.countTokens()];

		// Sending integers from file to an array
		while (pure.hasMoreTokens()) {
			for (int i = 0; i < raw.length; i++) {
				raw[i] = Integer.parseInt(pure.nextToken());
			}
		}

		// All bowlers instantiated
		Bowler b11 = new Bowler(raw[0], raw[1], raw[2], raw[3]);
		Bowler b12 = new Bowler(raw[4], raw[5], raw[6], raw[7]);
		Bowler b13 = new Bowler(raw[8], raw[9], raw[10], raw[11]);
		Bowler b14 = new Bowler(raw[12], raw[13], raw[14], raw[15]);
		Bowler b15 = new Bowler(raw[16], raw[17], raw[18], raw[19]);
		Bowler b21 = new Bowler(raw[20], raw[21], raw[22], raw[23]);
		Bowler b22 = new Bowler(raw[24], raw[25], raw[26], raw[27]);
		Bowler b23 = new Bowler(raw[28], raw[29], raw[30], raw[31]);
		Bowler b24 = new Bowler(raw[32], raw[33], raw[34], raw[35]);
		Bowler b25 = new Bowler(raw[36], raw[37], raw[38], raw[39]);
		Bowler b31 = new Bowler(raw[40], raw[41], raw[42], raw[43]);
		Bowler b32 = new Bowler(raw[44], raw[45], raw[46], raw[47]);
		Bowler b33 = new Bowler(raw[48], raw[49], raw[50], raw[51]);
		Bowler b34 = new Bowler(raw[52], raw[53], raw[54], raw[55]);
		Bowler b35 = new Bowler(raw[56], raw[57], raw[58], raw[59]);
		Bowler b41 = new Bowler(raw[60], raw[61], raw[62], raw[63]);
		Bowler b42 = new Bowler(raw[64], raw[65], raw[66], raw[67]);
		Bowler b43 = new Bowler(raw[68], raw[69], raw[70], raw[71]);
		Bowler b44 = new Bowler(raw[72], raw[73], raw[74], raw[75]);
		Bowler b45 = new Bowler(raw[76], raw[77], raw[78], raw[79]);

		// Adding bowlers to an ArrayList of type Bowler
		ArrayList<Bowler> allBowlers = new ArrayList<Bowler>(20);
		allBowlers.add(b11);
		allBowlers.add(b12);
		allBowlers.add(b13);
		allBowlers.add(b14);
		allBowlers.add(b15);
		allBowlers.add(b21);
		allBowlers.add(b22);
		allBowlers.add(b23);
		allBowlers.add(b24);
		allBowlers.add(b25);
		allBowlers.add(b31);
		allBowlers.add(b32);
		allBowlers.add(b33);
		allBowlers.add(b34);
		allBowlers.add(b35);
		allBowlers.add(b41);
		allBowlers.add(b42);
		allBowlers.add(b43);
		allBowlers.add(b44);
		allBowlers.add(b45);

		boolean flag = true;

		while (flag) {

			System.out.println("What would you like to see? ");
			System.out.println("1. File Info");
			System.out.println("2. File Info Plus Individual Averages");
			System.out.println("3. File Info Plus Team Info");
			System.out.println("4. Exit");

			int inpt = scnr.nextInt();
			switch (inpt) {
			case 1:
				fileInfo(allBowlers);
				break;

			case 2:
				bowlerAverages(allBowlers);
				break;

			case 3:
				teamTotals(allBowlers);
				break;

			case 4:
				System.out.println("Goodbye");
				flag = false;
				break;

			default:
				System.out.println("Please Enter A Valid Response");
				break;

			}
		}

	}

	/**
	 * Method to display all file information
	 * 
	 * @param file - passing in the ArrayList of type Bowler objects
	 */
	public static void fileInfo(ArrayList<Bowler> bowler) {
		System.out.println("---------------------------------------------------");
		System.out.println("Bowler Information: ");
		for (int i = 0; i < bowler.size(); i++) {
			System.out.println("Bowler Number: " + bowler.get(i).getNumber() + "; Score 1: " + bowler.get(i).getScore1()
					+ ", Score 2: " + bowler.get(i).getScore2() + ", Score 3: " + bowler.get(i).getScore3());
		}
		System.out.println("---------------------------------------------------");
	}

	/**
	 * Method to display all file information plus the average of the bowler
	 * 
	 * @param bowler
	 */
	public static void bowlerAverages(ArrayList<Bowler> bowler) {
		System.out.println("---------------------------------------------------");
		System.out.println("Bowler Information Plus Individual Average: ");
		for (int i = 0; i < bowler.size(); i++) {
			System.out.println("Bowler Number: " + bowler.get(i).getNumber() + " | Score 1: "
					+ bowler.get(i).getScore1() + ", Score 2: " + bowler.get(i).getScore2() + ", Score 3: "
					+ bowler.get(i).getScore3() + " - Bowler Average: " + bowler.get(i).bowlerAvg());
		}
		System.out.println("---------------------------------------------------");
	}

	/**
	 * Method to display file info and team info
	 * 
	 * @param bowler
	 */
	public static void teamTotals(ArrayList<Bowler> bowler) {
		int t1g1Total = 0;
		int t1g2Total = 0;
		int t1g3Total = 0;

		int t2g1Total = 0;
		int t2g2Total = 0;
		int t2g3Total = 0;

		int t3g1Total = 0;
		int t3g2Total = 0;
		int t3g3Total = 0;

		int t4g1Total = 0;
		int t4g2Total = 0;
		int t4g3Total = 0;

		System.out.println("---------------------------------------------------");
		System.out.println("Bowler Info: ");
		for (int i = 0; i < bowler.size(); i++) {
			System.out
					.println("Bowler Number: " + bowler.get(i).getNumber() + " | Score 1: " + bowler.get(i).getScore1()
							+ ", Score 2: " + bowler.get(i).getScore2() + ", Score 3: " + bowler.get(i).getScore3());
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Team Info: ");
		for (int i = 0; i < bowler.size(); i++) {

			if (bowler.get(i).getNumber() > 100 && bowler.get(i).getNumber() < 200) {
				t1g1Total += bowler.get(i).getScore1();
				t1g2Total += bowler.get(i).getScore2();
				t1g3Total += bowler.get(i).getScore3();
			}

			else if (bowler.get(i).getNumber() > 200 && bowler.get(i).getNumber() < 300) {
				t2g1Total += bowler.get(i).getScore1();
				t2g2Total += bowler.get(i).getScore2();
				t2g3Total += bowler.get(i).getScore3();
			}

			else if (bowler.get(i).getNumber() > 300 && bowler.get(i).getNumber() < 400) {
				t3g1Total += bowler.get(i).getScore1();
				t3g2Total += bowler.get(i).getScore2();
				t3g3Total += bowler.get(i).getScore3();
			}

			else if (bowler.get(i).getNumber() > 400 && bowler.get(i).getNumber() < 500) {
				t4g1Total += bowler.get(i).getScore1();
				t4g2Total += bowler.get(i).getScore2();
				t4g3Total += bowler.get(i).getScore3();
			}

		}
		int t1Total = t1g1Total + t1g2Total + t1g3Total;
		int t2Total = t2g1Total + t2g2Total + t2g3Total;
		int t3Total = t3g1Total + t3g2Total + t3g3Total;
		int t4Total = t4g1Total + t4g2Total + t4g3Total;

		System.out.println("Team 1 Info - Game 1 Total: " + t1g1Total + ", Game 2 Total: " + t1g2Total
				+ ", Game 3 Total: " + t1g3Total + ", Series Total: " + t1Total);
		System.out.println("Team 2 Info - Game 1 Total: " + t2g1Total + ", Game 2 Total: " + t2g2Total
				+ ", Game 3 Total: " + t2g3Total + ", Series Total: " + t2Total);
		System.out.println("Team 3 Info - Game 1 Total: " + t3g1Total + ", Game 2 Total: " + t3g2Total
				+ ", Game 3 Total: " + t3g3Total + ", Series Total: " + t3Total);
		System.out.println("Team 4 Info - Game 1 Total: " + t4g1Total + ", Game 2 Total: " + t4g2Total
				+ ", Game 3 Total: " + t4g3Total + ", Series Total: " + t4Total);
		System.out.println("---------------------------------------------------");
	}

}
