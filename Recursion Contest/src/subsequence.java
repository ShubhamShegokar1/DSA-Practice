package com.exampleLlibrary.Library.Respository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        String str =sc.nextLine();
        String ans[]= new String[1000];
       int count= find(str,ans);
       for(int i=0;i<count;i++) {
           System.out.println(ans[i]);
       }
    }

    private static int find(String str,String ans[]) {
        if(str.length()==0) {
          ans[0]="";
          return 1;
        }
        int countOfArray=find(str.substring(1),ans);
        for(int i=0;i<countOfArray;i++){
            ans[i+countOfArray]=str.charAt(0)+ans[i];
        }
      return 2*countOfArray;
    }
}

