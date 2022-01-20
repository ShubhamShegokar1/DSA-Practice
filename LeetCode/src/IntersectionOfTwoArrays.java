import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		 int[] nums1 = {4,9,5};
		 int[] nums2 = {9,4,9,8,4};
		 intersection(nums1,nums2);
	}
	public static int[] intersection(int[] nums1, int[] nums2) 
	{
		HashSet <Integer> map1= new HashSet<>();
		HashSet <Integer> map2= new HashSet<>();
		ArrayList <Integer> list= new ArrayList<>();
		
		for(int i=0;i<nums1.length;i++) 
		{
			map1.add(nums1[i]);
		}
		for(int i=0;i<nums2.length;i++) 
		{
			map2.add(nums2[i]);
		}
		
		
		 for (int i : map1) 
		 {       
           if(map2.contains(i)) 
           {
        	 list.add(i);
           }
        }
		 int index=0;
		 int arr[]=new int[list.size()];
		 for (int i : list) 
		 {       
           arr[index]=i;
           index++;
        }
		return arr;
	}
}
