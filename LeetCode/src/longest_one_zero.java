import java.util.HashSet;

class longest_one_zero {
	public static void main(String[] args) {
		System.out.println(checkZeroOnes("aabaabcbb"));
	}

	public static int checkZeroOnes(String str) {
		HashSet <Character> set = new HashSet<>(); 
		int ans=0;
		int cnt=0;
		int start=0;
		for(int i=0;i<str.length();i++) 
		{
			if(set.contains(str.charAt(i)))
			{
				while(str.charAt(start)!=str.charAt(i) ) {
					set.remove(str.charAt(start));
					start++;
					--cnt;
				}
			}
			else { 
				set.add(str.charAt(i));
				++cnt;
				ans=Math.max(ans, cnt);
			}
			System.out.println(set);

		}
		return ans;
	}
}