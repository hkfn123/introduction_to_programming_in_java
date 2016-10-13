public class BMI {
	public static void main(String[] args) {
		int w = Integer.parseInt(args[0]);
		int h = Integer.parseInt(args[1]);

		double h_ = h/100.0;
		double bmi = (w*1.0)/(h_*h_);
		System.out.printf("BMI: %.2f%%", bmi);
		System.out.println();
	}
}