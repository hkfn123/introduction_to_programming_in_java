public class MidOfFive {
	public static void main(String[] args) {
		int a1 = Integer.parseInt(args[0]);
		int a2 = Integer.parseInt(args[1]);
		int a3 = Integer.parseInt(args[2]);
		int a4 = Integer.parseInt(args[3]);
		int a5 = Integer.parseInt(args[4]);

		int avg = (a1 + a2 + a3 + a4 + a5)/5;
		int ret = a1;
		int abs = Math.abs(avg-a1);
		if((Math.abs(avg-a2)) <= abs) {
			abs = Math.abs(avg-a2);
			ret = a2;
		} 
		if((Math.abs(avg-a3)) <= abs) {
			abs = Math.abs(avg-a3);
			ret = a3;
		}  
		if((Math.abs(avg-a4)) <= abs) {
			abs = Math.abs(avg-a4);
			ret = a4;
		} 
		if((Math.abs(avg-a5)) <= abs) {
			abs = Math.abs(avg-a5);
			ret = a5;
		} 

		System.out.println(ret);

	}
}
;
