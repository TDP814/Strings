import java.util.Random;

class mean {
	
	public static Random r = new Random(5345);

	public static void main(String[] args) {
		int[] randomArray = makeRandom(1000, 100);
		System.out.print("The average of the array is ");
		System.out.println(mean(randomArray) + ".");

		System.out.print("The average from index 40 to index 45 is ");
		System.out.println(meanOfRange(randomArray, 40, 45) + ".");
	}

	public static double mean(int[] a){
		double sum = 0.0;
		for (int i = 0; i<a.length; i++) {
			sum = sum + a[i];
		}
		return(sum / a.length);
	}

	public static double meanOfRange(int[] a, int start, int end){
		if (start < end) {
			double sum = 0.0;
			for (int i=start; i<end; i++) {
				sum = sum + a[i];
			}
			return (sum / (end - start));
		} else {
			System.out.println("Error. Start bigger than end.");
			return 0.0;
		}
	}

	public static int[] makeRandom(int size, int range){
		int[] a = new int[size];

		for (int i=0; i<a.length; i++) {
		 	a[i] = r.nextInt(range + 1);
		 } 
		return a;
	}
}