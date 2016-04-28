package foodstore;

public class GardenPea extends Food{

	public GardenPea(String storeName) {
		super(storeName);
	}

	
	public void showStoreName() {
		super.showStoreName();
		super.storeName = "R";
		System.out.println(storeName);
	}
	
	
	public void loopThrough() {
		int numbers[][]  = new int[5][2];
		numbers[0][0] = 15;
		numbers[0][1] = 1;
		numbers[1][0] = 15;
		numbers[1][1] = 1;
		numbers[2][0] = 9;
		numbers[2][1] = 15;
		numbers[3][0] = 1;
		numbers[3][1] = 15;
		numbers[4][0] = 1;
		numbers[4][1] = 100;
		
		
		for(int i = 0; i<numbers.length; i++) {			
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
			}

			System.out.println();
		}
		
//		for(int number : numbers[][]) {
//			System.out.println(number);
//		}
	}
}