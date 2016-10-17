public class RollLoadedDie {
	public static void main(String[] args) {
		double roll = Math.random();

		if(roll <= 1.0/8.0) roll = 1;
		else if(roll <= 2.0/8.0) roll = 2;
		else if(roll <= 3.0/8.0) roll = 3;
		else if(roll <= 4.0/8.0) roll = 4;
		else if(roll <= 5.0/8.0) roll = 5;
		else roll = 6;

		System.out.println(roll);
	}
}