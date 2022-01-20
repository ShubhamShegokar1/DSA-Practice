
public class SearchIn2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean searchMatrix(int[][] arr, int target) {
        int row=arr.length;
        int column=arr[0].length;
        int i=0;
        int j=0;
       while(i<row && j<column)
       {
         if(arr[i][j]==target)  return true;
         if(arr[i][0]<target && arr[i][column-1]<target) i++;  
         else 
         {
             while(j<column)
             {
                 if(arr[i][j]==target) return true;
                    j++;
             }
             return false;
         }  
        }
        return false;
    }

}
