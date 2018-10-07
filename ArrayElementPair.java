import java.util.HashMap;
import java.util.Arrays;

class ArrayElementPair{
	
	private static void pair(int[] a,int x){

		HashMap<Integer,Integer> map= new HashMap<>();

		int i,n=a.length;

		for(i=0;i<n;i++)
			map.put(a[i],x-a[i]);

		for(i=0;i<n;i++)
			if(map.containsKey(x-a[i]))
				System.out.println("Pair: "+a[i]+","+map.get(a[i]));
	}

	public static void main(String[] args){

		int a[]={1,2,3,4,5,6,7};
		int x=7;
		pair(a,x);
	}
}