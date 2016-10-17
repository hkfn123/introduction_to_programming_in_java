public class RulerN {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String rule = " ";

		for(int i = 1; i <= n; i++) {
			rule = rule + i + rule;
		}

		System.out.println(rule);
	}
}