import java.util.Scanner;


public class PassTwoDimensionalArray {
	public static void main(String args[]){
		int row = 3;
		int column = 4;
		int matrix[][] = new int[row][column];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < row; i++){
			for(int j= 0;j < column; j++){
				matrix[i][j] = sc.nextInt();
			}
			
		}
		sc.close();
		System.out.println("sum is :" + sum(matrix) );
	}
	public static int sum(int [][] matrix){
		int row =matrix.length;
		int column = matrix[0].length;
		int sum = 0;
		for(int i = 0; i < row; i++){
			for(int j= 0;j < column; j++){
				sum +=matrix[i][j] ;
			}
			
		}
		return sum;
		
	}
}
