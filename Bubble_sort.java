public class Main {
	public static void main(String[] args) {

		//Array
		int[] arr = {5, 3, 8, 1, 2};
		
		//outer loop
		for (int i = 0; i < arr.length - 1; i++) {
            //inner loop
			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
