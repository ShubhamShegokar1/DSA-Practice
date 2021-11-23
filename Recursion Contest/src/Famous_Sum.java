import java.util.Scanner;

public class Famous_Sum {

    public static int findNumber()
    {
        return 0;
    }

    public  static int find(int num)
    {
       int temp=0;
       if(num>9) {
           while (num > 1) {
               temp+= num / 10;
           }
       }

      if(temp>9)
          find(temp);
      else
          return temp;
       return 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long num=sc.nextLong();
        int n=sc.nextInt();
        String str = String.valueOf(num);
        String newStr="";
        for(int i=0;i<n;i++) {
              newStr+=str;
        }
        int number=0;
        int i=0;
        while(i<newStr.length())
        {
         int temp=Character.getNumericValue(newStr.charAt(i));
         number+=temp;
         i++;
        }
        System.out.println(number);
        int ans=find(number);
        System.out.println(ans);

    }
}
