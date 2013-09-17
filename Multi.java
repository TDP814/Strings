public class Multi {

	public static void main(String[] args){
		int [][] a = {	{ 1,  2,  3,  4,  5},
						{ 6,  7,  8,  9, 10},
						{11, 12, 13, 14, 15}};

		System.out.println("Sum of the row " + sumRow(0,a));
		System.out.println("Sum of the colum " + sumCol(0,a));
		System.out.println("Sum of total " + sumTotal(a));
	}
	
	public static void print(int[][] a){
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
	}

	public static int sumRow(int n, int [][]a){
		int sum=0;
		for (int i=0; i<a[n].length; i++) {
			sum = sum + a[n][i];
		}
		return sum;
	}

	public static int sumCol(int n, int [][]a){
		int sum=0;
		for (int i=0; i<a.length; i++) {
			sum = sum + a[i][n];
		}
		return sum;
	}

	public static int sumTotal(int[][] a){
		int sum=0;
		for (int i=0; i<a.length; i++) {
			sum = sum + sumRow(i, a);
		}
		return sum;
	}

	public static reverseRow(int n, int [][]a){
		
	}
}