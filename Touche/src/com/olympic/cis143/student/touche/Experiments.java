package com.olympic.cis143.student.touche;

public class Experiments {
	public static void main (String [] args ) {

		// User entered
		int numberOfFencers = 4;
		String [] fencer = {"Tami", "Chris", "Jazzy", "Sparky"};

		// Other things we need
		int [][] score = new int[numberOfFencers][numberOfFencers];
		int numberOfBouts = 6; 	// we know that for a pool of 4 there are 6 bouts
		
		// Init all scores to zero
		for (int i = 0; i < numberOfFencers; i++) {
			for (int j = 0; j < numberOfFencers; j++) {
				score[i][j] = 0;
			}
		}
		
		// Display fencer list 
		for (int i = 0; i < numberOfFencers; i++) {
			System.out.println("Fencer " + (i + 1) + ": "  + fencer[i]);
		}

		// Bout order is static.  Pool of four is always fencers 1-4, 2-3, 1-3, 2-4, 3-4, 1-2
		String [] boutOrder = {fencer[0] + " vs. " + fencer[3], 
							   fencer[1] + " vs. " + fencer[2],
							   fencer[0] + " vs. " + fencer[2],
							   fencer[1] + " vs. " + fencer[3],
							   fencer[2] + " vs. " + fencer[3],
							   fencer[0] + " vs. " + fencer[1]
							   }; 
		System.out.println("");
		System.out.println("Bout order: " );
		for (int i = 0; i < numberOfBouts; i++) {
			System.out.println(boutOrder[i]);
		}
		
		// Lets enter in some fake scores.
		score[0][1] = 5;  
		score[0][2] = 0;
		score[0][3] = 1;
		score[1][0] = 1;
		score[1][2] = 0;
		score[1][3] = 2;
		score[2][0] = 5;
		score[2][1] = 5;
		score[2][3] = 5;
		score[3][0] = 5;
		score[3][1] = 5;
		score[3][2] = 0;
		
		// print the grid to see the scores
		for (int i = 0; i < numberOfFencers; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("[" + score[i][j] + "]");
			}
			System.out.println("\n");
		}
		
		// Calculate victories - YAY.  It works.  
		for (int i = 0; i < numberOfFencers; i++) {
			for (int j = 0; j < numberOfFencers; j++) {
				// exclude shaded out areas on grid (i.e. 0,0, 1,1 etc) 
				if (i != j) {
					// There cannot be a tie - force them to correct the scoresheet --- also Check with Jazzy !!!!
					if ( score[i][j] == score [j][i]) {
						System.out.println(" THERE CANNOT BE A TIE.  WHO WON? ");
					}
					if ( score[i][j] > score [j][i]) {
						System.out.println("Fencer " + i + "Victory");
					}
				}
			}
		}
		
		
	}
}
