package pack1;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] bab = {1,3,4,2,1,6,9,0,1,0,0,0,0,0,3,3};
getUniq(bab);
	}

	public static void getDups(int[]arr){
		int[] vals = new int[256];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int tmp: arr){
			if(vals[tmp]==1 && (!list.contains(tmp))){
				System.out.println(tmp);
				list.add(tmp);
			}
			vals[tmp]=1;
			
		}
	}
	public static void getUniq(int []arr){
		int[]boo = new int[256];
		for(int tmp:arr){
			boo[tmp]++;
		}
		for(int tmp:arr){
			if(boo[tmp]==1){
				System.out.println(tmp);
			}
		}
		
	}
}
