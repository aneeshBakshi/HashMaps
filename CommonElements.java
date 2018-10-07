import java.util.HashMap;
import java.util.Arrays;

class CommonElements{
	private static void commonElement(int[] a,int[] b,int[] c){

		HashMap<Integer,Integer> map= new HashMap<>();

		int i,count,n1=a.length,n2=b.length,n3=c.length;

		for(i=0;i<n1;i++)
			map.put(a[i],1);

		for(i=0;i<n2;i++)
			if(map.containsKey(b[i])){
				count=map.get(b[i])+1;
				map.put(b[i],count);
			}

		for(i=0;i<n3;i++)
			if(map.containsKey(c[i])){
				count=map.get(c[i])+1;
				if(count==3)
					System.out.printf(c[i]+" ");
			}
		//System.out.println(map.size());

	}

	public static void main(String[] args){

		/*int a11[]={1,5,10,20,40,80};
		int a12[]={6,7,20,80,100};
		int a13[]={3,4,15,20,30,70,80,120};

		commonElement(a11,a12,a13);*/

		int a21[]={1,5,5};
		int a22[]={3,4,5,5,10};
		int a23[]={5,5,10,20};

		commonElement(a21,a22,a23);

	}
}