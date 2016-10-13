public  class SumOfTwoDice {
	public static void main(String[] args) {
		int SIDE = 6;
		int first = (int)(Math.random() * SIDE + 1);
		int second = (int)(Math.random() * SIDE + 1);
		int sum = first + second;
		System.out.println(sum);
	}
}