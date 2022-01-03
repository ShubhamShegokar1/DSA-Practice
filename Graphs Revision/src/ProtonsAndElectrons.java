import java.util.Scanner;

public class ProtonsAndElectrons {
    static int row;
    static int column;
    static int electrons;
    static int photons;

	public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
      row =sc.nextInt();
      column=sc.nextInt();
     char arr[][]= new char[row][column];
     sc.nextLine();
     for(int i=0;i<row;i++) 
     {
    	  String str=sc.nextLine();
    	 for(int j=0;j<column;j++) 
    	 {
    	 	 arr[i][j]=str.charAt(j);
    	 }
     }
     int electron=0;
     int photon=0;
     for(int i=0;i<row;i++) 
	  {
		  for(int j=0;j<column;j++) 
		  {
			 if(arr[i][j]=='.' || arr[i][j]=='E' || arr[i][j]=='P' ) 
			 {
				 electrons=0;
				 photons=0;
				solve(arr,i,j);	
				if(electrons<photons) {
					photon+=photons;
				}
				else if(electrons>photons){
					electron+=electrons;
				}
				else {
					photon+=photons;
				}
			 }
		  }
	  }
   
    	System.out.println(electron+" "+photon);
     
     
	}

	private static void solve(char[][] arr, int i, int j) {
		if(i<0 || j<0 || j>=column || i>=row || arr[i][j]=='#' ) {
			return;
		}
		if(arr[i][j]=='E') {
		 	electrons++;
		}
		else if(arr[i][j]=='P') {
			photons++;
		}
		arr[i][j]='#';
		solve(arr, i-1,  j);
		solve(arr, i+1,  j);
		solve(arr, i,    j-1);
		solve(arr, i,  j+1);
	}

}
