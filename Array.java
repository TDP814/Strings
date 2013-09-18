class Array {

	public static void main(String[] args) {

		int[] data = new int[10];

		for (int i=0; i < data.length; i++) {
			data[i] = 10-i;
			System.out.println(data[i]);		
		}

		System.out.println("Orinial Array\n");
		printArray(data);

		
		System.out.println("\n Doubled Array");
		printArray(data);

		System.out.println("\n Summed Array");
		sum(data);

		System.out.println("\n Largest Elements");
		largest(data);

		System.out.println("\n Closest To Zero");
		closestToZero(data);

		System.out.println("\n Smash");
		int[] r ={1,2};
		smash(data);

	}

	public static int[] doubleIt(int[] a){
		for (int = 0; i < a.length; i++) {
			a[i]=a[i]*2
		}
		return a;
	}

	public static void sum(int[] a){
		int sumOdd = a[0], sumEven = a[0], sumAll = a[0];
		for (int i = 0; i < data.length; i++) {
			if (a[i] % 2 == i) {
				if (sumOdd < a[i]) {
					sumOdd = a[i];
				}
				if (sumAll < a[i]){
					sumAll = a[i];
				}
			} else {
				if (sumEven < a[i]) {
					sumEven = a[i];
				}
				if (sumAll < a[i]) {
					sumAll = a[i];
				}
			}
		}
		System.out.println("Odd = "+sumOdd+" Even = "+sumEven+" All = "+sumAll);
	}

	public static void largest(int[] a){
		int b = a[0], c = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > c) {
				if (a[i] > b) {
					b = a[i];
				} else {
					c = a[i];
				}
			}
		}
		System.out.println(b);
		System.out.println(c);
	}

	public static int[] closestToZero(int[] a){
		int b = a[0];
		for (int = 0; i < a.length; i++) {
			if ((a[i] > 0) && (b > 0)) {
				if ((a[i] - 0) < (b - 0)) {
					b = a[i];
				}
			}
		}
	}

	public static void printArray(int[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);		
		}
	}

}