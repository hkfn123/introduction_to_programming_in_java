public class Dragon {
	public static void main(String[] args) {
		String dragon0 = "F";
		String nograd0 = "F";
		String dragon1 = dragon0 + "L" + nograd0;
		String nograd1 = dragon0 + "R" + nograd0;
		String dragon2 = dragon1 + "L" + nograd1;
		String nograd2 = dragon1 + "R" + nograd1;
		String dragon3 = dragon2 + "L" + nograd2;
		String nograd3 = dragon2 + "R" + nograd2;
		String dragon4 = dragon3 + "L" + nograd3;
		String nograd4 = dragon3 + "R" + nograd3;
		String dragon5 = dragon4 + "L" + nograd4;

		System.out.println(dragon0);
		System.out.println(dragon1);
		System.out.println(dragon2);
		System.out.println(dragon3);
		System.out.println(dragon4);
		System.out.println(dragon5);
	}
}