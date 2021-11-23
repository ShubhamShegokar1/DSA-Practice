import java.util.Scanner;

public class SumExistOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements =sc.nextInt();
        int arr[]= new int[elements];
        for(int j=0;j<elements;j++){
            arr[j]=sc.nextInt();
        }
        int n=sc.nextInt();
        int counter=0;
        boolean b=true;
        if(find(n,arr,counter,b)) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }

    private static boolean find(int target, int[] arr, int cnt,boolean b) {
       if (cnt > arr.length) {
           return false;
       }
       if (cnt<arr.length) {
           if(arr[cnt]==target) {
               return true;
           }
       }

           return find(target, arr, cnt + 1, b);

     }
}
