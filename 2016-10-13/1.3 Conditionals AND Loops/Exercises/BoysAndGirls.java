public class BoysAndGirls {
	public static void main(String[] args) {
		int girlOrBoy = Integer.parseInt(args[0]);
		int times = Integer.parseInt(args[1]);

		int cnt = 0;
		for (int i = 0; i < times; i++) {
			while(true){
				int r = (int)(Math.random()*2);
				if(r == girlOrBoy) {
					cnt++;
					break;
				} else {
					cnt++;
				}
			}
		}

		System.out.println(Math.round(cnt*0.1/times*10));
	}
}