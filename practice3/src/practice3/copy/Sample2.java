package practice3.copy;
import java.util.*;
class Sample2 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Test cases");
		int noOfTest = sc.nextInt();

        
		for (int t = 0; t < noOfTest; t++)
		{
			System.out.println("Enter n");
			int n =sc.nextInt();
			System.out.println("Enter elemets");
	        List<Integer> list1 = new ArrayList<Integer>();

			List<Integer> list = new ArrayList<Integer>();
			
			for(int i=0;i<n;i++)
			{
			list.add(sc.nextInt());
			}
            
			Collections.sort(list);
			
		 
			for (int h = 0; h < list.size() ; h++) 
				{
	                    System.out.print(list.get(h)+",");
	            }
			
        	for(int i=0;i<list.size()-1;i++)
			{   
        		System.out.println("\n");
               
            	int count = 0;
				for (int j = i; j < list.size() ; j++) 
				{
					if (list.get(i) == list.get(j) ) 
					{
						count++;

					}

				}
                
				list1.add(count);
				
				System.out.println("count--->" +count);
				
				
				// 1 2 2 3 3 3
				
				int skip=0;;
				for(int f=i+1;f<list.size();f++)
				{
					if(list.get(f)==list.get(i))
					{
						skip++;
						i=i+skip;
					}
				}

             
			
        	if(i==list.size())
        	{
        		System.out.println("Final List");
        	for (int h = 0; h < list1.size() ; h++) 
    		{
                    System.out.print(list1.get(h)+"-");
            }
        	}
             System.out.println("\n\n\n");
		}
		}
	
	
		
	}
}