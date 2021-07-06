package practice.progs;

import java.util.Scanner;

public class HourGlass2DArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rowsInMatrix = 6;
		int colInMatrix = 6;
		int minValueInArray = -9;
		int elementInHourGlass = 7;
		int maxHourGlassSum = minValueInArray * elementInHourGlass;
		int matrix[][] = new int[rowsInMatrix][colInMatrix];
		int hourGlassSum;
		for(int i=0; i < rowsInMatrix; i++) {
			for(int j=0; j < colInMatrix; j++ ) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		//Printing Matrix
		try {
			for (int i = 0; i < rowsInMatrix; i++) {
				for (int j = 0; j < colInMatrix; j++) {

					System.out.println(matrix[i][j] + " " + matrix[i][j + 1] + " " + matrix[i][j + 2] + " "
							+ matrix[i][j + 3] + " " + matrix[i][j + 4] + " " + matrix[i][j + 5]);
					System.out.println(matrix[i + 1][j] + " " + matrix[i + 1][j + 1] + " " + matrix[i + 1][j + 2] + " "
							+ matrix[i + 1][j + 3] + " " + matrix[i + 1][j + 4] + " " + matrix[i + 1][j + 5]);
					System.out.println(matrix[i + 2][j] + " " + matrix[i + 2][j + 1] + " " + matrix[i + 2][j + 2] + " "
							+ matrix[i + 2][j + 3] + " " + matrix[i + 2][j + 4] + " " + matrix[i + 2][j + 5]);
					System.out.println(matrix[i + 3][j] + " " + matrix[i + 3][j + 1] + " " + matrix[i + 3][j + 2] + " "
							+ matrix[i + 3][j + 3] + " " + matrix[i + 3][j + 4] + " " + matrix[i + 3][j + 5]);
					System.out.println(matrix[i + 4][j] + " " + matrix[i + 4][j + 1] + " " + matrix[i + 4][j + 2] + " "
							+ matrix[i + 4][j + 3] + " " + matrix[i + 4][j + 4] + " " + matrix[i + 4][j + 5]);
					System.out.println(matrix[i + 5][j] + " " + matrix[i + 5][j + 1] + " " + matrix[i + 5][j + 2] + " "
							+ matrix[i + 5][j + 3] + " " + matrix[i + 5][j + 4] + " " + matrix[i + 5][j + 5]);

				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
			
		
		
		for(int i=0; i < (rowsInMatrix - 2); i++) {
			for(int j=0; j <(colInMatrix - 2); j++) {
				
				// Printing the HorGlass Starting Point
				System.out.println("Checking HourGlass at ("+ i + " " + j +")");
				
				// Printing HourGlass Matrix
				System.out.println(matrix[i][j] + " " + matrix[i][j+1] + " " +  matrix[i][j+2]);
				System.out.println(" " + matrix[i+1][j+1]);
				System.out.println(matrix[i+2][j] + " " + matrix[i+2][j+1] + " " + matrix[i+2][j+2] );
				
				//Counting the sum of elements in HourGlas
				hourGlassSum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2]
											+ matrix[i+1][j+1] + 
							   matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
			
				if( hourGlassSum > maxHourGlassSum) {
					maxHourGlassSum = hourGlassSum;
				}
			
			}
				
		}
		
		System.out.println("Maximum HourGlass Sum = "+maxHourGlassSum);
		
		
		

	}

}
