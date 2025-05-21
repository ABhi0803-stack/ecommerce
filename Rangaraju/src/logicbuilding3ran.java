
public class logicbuilding3ran {

	public static void main(String[] args) {

		 // Print the first rectangle
		for (int i = 1; i <= 4; i++) {  // 4 rows
            for (int j = 1; j <= 8; j++) {  // 8 columns
                if (i == 1 || i == 4 || j == 1 || j == 8) {
                    System.out.print("*");  // Print '*' for borders
                } else {
                    System.out.print(" ");  // Print space for inner area
                }
            }
            System.out.println();  // Move to the next line after each row
        }
		
        // Print the second pattern with diagonals
        for (int i = 1; i <= 4; i++) {  // 4 rows
            for (int j = 1; j <= 8; j++) {  // 8 columns
                if (j == i+1 && i != 0) {  
                    System.out.print("*");  // Print '*' for diagonal
                } else {
                    System.out.print(" ");  // Print space for non-diagonal area
                }
            }
            System.out.println();  // Move to the next line after each row
        }
    }
		
		
	}


