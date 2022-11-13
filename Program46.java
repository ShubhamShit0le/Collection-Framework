import java.util.*;

class Program46
{
	public static void main(String[] args) {
		
		int Arr[]={1,2,3,1,5,6,9,5};

		HashMap<Integer,Integer> hobj=new HashMap<>();
		for(int i:Arr)
		{
			if(hobj.containsKey(i))
			{
				hobj.put(i,hobj.get(i)+1);
			}
			else
			{
				hobj.put(i,1);
			}
		}

		System.out.println(hobj);


	}
}