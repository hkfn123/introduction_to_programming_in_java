public class State5 {
	public static void main(String[] args) {
		double r1 = Math.random();
		double r2 = Math.random();
		double r3 = Math.random();
		double r4 = Math.random();
		double r5 = Math.random();

		System.out.println("Random Numbers(0 - 1): ");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);

		double min = Math.min(Math.min(Math.min(r1, r2), Math.min(r3, r4)), r5);
		double max = Math.max(Math.max(Math.max(r1, r2), Math.max(r3, r4)), r5);
		double average = (r1+r2+r3+r4+r5)/5;
		
		System.out.print("Minimum: ");
		System.out.println(min);
		System.out.print("Maximum: ");
		System.out.println(max);
		System.out.print("Average: ");
		System.out.println(average);

	}
}