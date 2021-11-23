import java.util.Scanner;
public class DigitMania 
{
	
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
      int test=sc.nextInt();
      for(int i=0;i<test;i++) 
      {
    	  int elements=sc.nextInt();
          int n=sc.nextInt();
          char num = Character.forDigit(n, 10);
         // System.out.println(num);
    	  int arr[]= new int[elements];
          for(int j=0;j<elements;j++) 
          {
        	  arr[j]=sc.nextInt();
          }
    	  int max=0;
    	  int index=0;
    	  int ans=0;
    	  int check=0;
    	 System.out.println( find(num,arr,max,index,ans,check));
      }
	}
	private static int find(char num, int arr[],int max,int index,int ans,int check) 
	{
		if(index==arr.length){
			return ans;
		}
       String str=""+arr[index];
       int cnt=0;
       
       for(int i=0;i<str.length();i++) 
       {
    	   if(str.charAt(i)==num) 
    	   {
    		   cnt++;
    	   }
       }

       if(max<cnt) {
		   max=cnt;
		   ans=arr[index];
		   check=arr[index];
		  // System.out.println(arr[index]);
	   }
       if(max==cnt &&  check<arr[index]) {
    	   ans=arr[index];
    	   check=arr[index];
       }
       
		return find(num,arr, max,index+1,ans,check);
	}
}
