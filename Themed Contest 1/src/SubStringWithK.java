import java.util.Scanner;

public class SubStringWithK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		 sc.nextLine();
		String str=sc.nextLine();
          int cnt=0;		
		String temp="";
		for(int i=0;i<n-1;i++) 
		{
			for(int j=i;j<n;j++) 
			{
				temp+=str.charAt(j);
				if(temp.length()==k) 
				{
					boolean b=false;
					for(int m=0;m<k-1 && b==false;m++) 
					{
						for(int z=m+1;z<k && b==false;z++) 
						{
							if(temp.charAt(m)==temp.charAt(z)) 
							{
								b=true;
								break;
							}
						}
					}
					
					if(b==false) 
					{
						System.out.println(temp);
					cnt++;
					}
					temp="";
				}
			}
		}
		System.out.println(cnt);
	}

}
