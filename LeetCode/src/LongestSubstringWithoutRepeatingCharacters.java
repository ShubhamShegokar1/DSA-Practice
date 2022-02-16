import java.util.Arrays;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("aabaab!bb"));
	}

	public static int lengthOfLongestSubstring(String str) 
	{
		HashSet<Character> set = new HashSet<>();
		int ans = 0;
		int cnt = 0;
		int start = 0;
		for (int i = 0; i < str.length(); i++) 
		{
			if (set.contains(str.charAt(i))) 
			{
				while (set.contains(str.charAt(i))) 
				{
					set.remove(str.charAt(start));
					start++;
					--cnt;
				}
			}

			set.add(str.charAt(i));
			++cnt;
			ans = Math.max(ans, cnt);

			System.out.println(set);
		}
		return ans;
	}
}
