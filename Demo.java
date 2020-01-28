import java.util.*;
public class Demo { 
	static int findMax(int mat[][]) 
	{ 
		int max = Integer.MIN_VALUE; 
		for (int i = 0; i <3; i++) { 
			for (int j = 0; j <3; j++) { 
				if (mat[i][j] > max) { 
					max = mat[i][j]; 
				} 
			} 
		} 
		return max; 
	} 
	public static void main(String args[]) 
	{ 
int[][] mat = new int[3][3];

Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array: ");
    for(int i=0; i <3; i++) {
        for(int j=0; j <3; j++) {
            mat[i][j] = sc.nextInt();
        }
    }

		System.out.println(findMax(mat)) ; 
	
	} 
} 