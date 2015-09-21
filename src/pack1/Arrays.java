package pack1;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] bab = {1,3,4,2,1,6,9,0,1,0};
getDups(bab);
	}

	public static void getDups(int[]arr){
		int[] vals = new int[256];
		for(int tmp: arr){
			if(vals[tmp]==1){
				System.out.println(tmp);
			}
			vals[tmp]=1;
		}
	}
}
