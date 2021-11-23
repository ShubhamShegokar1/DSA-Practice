import java.util.Scanner;

public class permuation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cur=0;
        find(cur,arr);
    }
    private static void find(int cur, int[] arr) {
     if(cur==arr.length){
         for(int j=0;j<arr.length;j++){
             System.out.print(arr[j]+" ");
         }
         System.out.println();
         return;
     }

     for (int i=cur;i<arr.length;i++){
         swap(i, cur,arr);
         find(cur+1,arr);
         swap(i, cur,arr);
     }
    }

    private static void swap(int i, int cur,int arr[]) {
      int temp;
      temp=arr[i];
      arr[i]=arr[cur];
      arr[cur]=temp;
    }
}

