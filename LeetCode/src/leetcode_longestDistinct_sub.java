import java.util.HashMap;
public class leetcode_longestDistinct_sub {
	public static void main(String[] args) {
		String s = "dvdf";
		int n = s.length();
		int i = 0;
		int j=0;
		int max = 0;
		HashMap <Character,Integer> map= new HashMap<>();
		while(true) 
		{
			while (i < n) 
			{
				i++;
				char ch = s.charAt(i);
				map.put(ch, map.getOrDefault(ch, 0)+1);
				if(map.get(ch)==2) {
				  break;	
				}
				else {
					int temp=i-j;
					if(temp>max) temp=max;
				}
			}
			while (j < i) 
			{
				j++;
				char ch = s.charAt(i);
				map.put(ch, map.get(ch)-1);
				if(map.get(ch)==1) 
				{
					  break;	
				}
			}
		
		}
	}

}