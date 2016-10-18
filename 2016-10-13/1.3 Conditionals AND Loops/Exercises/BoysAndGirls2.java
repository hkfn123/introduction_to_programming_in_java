public class BoysAndGirls2 {
	public static void main(String[] args) {
		int times = Integer.parseInt(args[0]);
		int p = Integer.parseInt(args[1]);
		boolean isFirst = true;
		int first = 0;
		int girlOrBoy=-1;

		int cnt = 0;
		for (int i = 0; i < times; i++) {
			while(true){
				int r = (int)(Math.random()*(p+1));
				if (p == 0) {
					girlOrBoy = 1;
				} else {
					if (r%p == 0) {
						girlOrBoy = 1;
					} else {
						girlOrBoy = 2;
					}
				}
				
				cnt++;
				if(first == girlOrBoy) {	
					break;
				} 

				if (isFirst) {
					isFirst = false;
					first = girlOrBoy;
				}
			}
			isFirst = true;
			first = -2;
			girlOrBoy=-1;
			System.out.println(cnt);
		}

		System.out.println(Math.round(cnt*0.1/times*10));
	}
}