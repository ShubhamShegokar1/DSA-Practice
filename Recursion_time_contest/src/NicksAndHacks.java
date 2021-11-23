import java.util.Scanner;
public class NicksAndHacks
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int n=sc.nextInt();
            int ans=find(1,n);
            if(ans==1) {
            	System.out.println(true);
            }
            else {
            	System.out.println(false);
            }
        }
    }
    private static int find(int i,int n)
    {
    	if(i==n) {
    		return 1;
    	}
    	if(i>n) {
    		return 0;
    	}
    	 find(i*10,n);
    	return find(i*20, n);

    }
}
