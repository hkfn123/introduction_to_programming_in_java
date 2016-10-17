public class Gambler {
	public static void main(String[] args) {
		int stack = Integer.parseInt(args[0]);
		int goal = Integer.parseInt(args[1]);
		int times = Integer.parseInt(args[2]);

		int bets = 0;
		int wins = 0;

		for(int t = 0; t < times; t++) {

			int cash = stack;
			while(cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5) cash++;
				else cash--;
			}

			if (cash == goal) wins++;
		}

		System.out.println(wins + " wins  of " + times);
		System.out.println("Percent of games won = " + 100.0*wins/times);
		System.out.println("Avg # bets		     = " + 1.0 *bets /times);
	}
}