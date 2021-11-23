import java.util.*;
public class Reverse2 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 
		 int n = Integer.parseInt(sc.nextLine()); 
	      String arr[] = new String[n];
		  for(int i=0;i<n;i++)
		  {
			  arr[i]=sc.nextLine();
					  
		  }
          sc.close();
		  int count1=0;
		  int count2=-1;
		  ArrayList <Integer> first = new ArrayList <>();        
		  ArrayList <Integer> second = new ArrayList <>();  
		  char ch1='a',ch2='b';
		  for(int i=0;i<n;i++)
		  {
			   
			  for( int j=0;j<arr[i].length();j++)
			  {
			     if(arr[i].charAt(j)=='a' || arr[i].charAt(j)=='e' ||arr[i].charAt(j)=='i' 
			    		 ||arr[i].charAt(j)=='o' ||arr[i].charAt(j)=='u'  )
			     {
			    	 count1=j;
			    	 ch1=arr[i].charAt(j);
			    	System.out.println("ch1 :"+ch1);
			    	first.add(count1);
			     }
			  }	 
			  System.out.println();
	 		  
			  
			  for(int j=arr[i].length()-1;j>=0;j--)
			  {
			        count2++;
				  if(arr[i].charAt(j)=='a' || arr[i].charAt(j)=='e' ||arr[i].charAt(j)=='i' 
				    		 ||arr[i].charAt(j)=='o' ||arr[i].charAt(j)=='u'  )
					  {

					        ch2=arr[i].charAt(j);
					    	System.out.println("ch2 :"+ch2+"  count :"+count2);
					        second.add(count2);
					    	//System.out.print(count2+" ");
					  }
			 }
			  System.out.println(first);
			  System.out.println(second);
			  System.out.println("Size :"+second.size());
			  char temp1='a';
			  char temp2='b';
			   for(int p=0;p<first.size();p++)
			  {
				  for(int q=second.size()-1;q>=0;q--)
				  {
					  if(first.get(p)==second.get(q)) // ->
					  {
						  // temp1 = arr[p].charAt(p);
						   //temp2 = arr[p].charAt(j);
                          System.out.println(arr[p].charAt(first.get(p)));
                          System.out.println(arr[q].charAt(second.get(q)));
                            
//						   arr[p].charAt(temp1) ;
//						   arr[j].charAt(temp2) ;

					  }
				  }
			  }
			  
			  
		  }

          
          first.clear();
          second.clear();
 }
}
