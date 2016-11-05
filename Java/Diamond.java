public class Diamond {
	public static void main(String[] args) {
		int diamond = 0;
		while (diamond==0) {
		for(int top = 1; top<5; top +=2) {
			for(int space = 0; space<5 - top / 2; space++)
			System.out.print(" ");
			for(int TopRow = 0; TopRow < top; TopRow++)
			System.out.print("*");
		System.out.print("\n");
		}
		for(int bottom = 5; bottom>0; bottom -= 2) {
			for(int space = 0; space<5 - bottom / 2; space++)
			System.out.print(" ");
			for (int row = 0; row < bottom; row++)
			System.out.print("*");
		System.out.print("\n");
		}
		break;
		}
	}
}
