import java.util.*;

public class rewards2
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            int boxes=sc.nextInt();
            int trucks=sc.nextInt();
            ArrayList <Integer>truckArray= new ArrayList<>();
           ArrayList <Integer>boxArray= new ArrayList<>();
            for (int i=0;i<boxes;i++) {
                boxArray.add(sc.nextInt());
            }
            for (int i=0;i<trucks;i++) {
                truckArray.add(sc.nextInt());
            }
        Collections.sort(truckArray);
        Collections.sort(boxArray);

            int left=0;
            int right=2*boxes;
           int ans=0;
           while(left<=right)
            {
                int mid = (left + right) / 2;
                if (check( mid,boxArray, boxes , truckArray , trucks  ))
                {
                    right = mid-1;
                    ans=mid;
                }
                else
                {
                    left = mid + 1;
                }
            }
            System.out.println(ans);

    }

    private static boolean check(int mid, ArrayList<Integer> boxArray, int boxes, ArrayList<Integer> truckArray, int trucks)
    {
        int temp=0;
        int count=0;
        while(count<trucks)
        {
            for (int j = 0; j < mid && temp < boxes && truckArray.get(count) >= boxArray.get(temp); j += 2)
            {
                temp++;
            }
            count++;
        }

        if(temp==boxes)
        return  true;
        else
            return false;
    }
}
