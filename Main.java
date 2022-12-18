import java.util.*;

public class Main {
    public static void main(String[] args){
        int n,k;                                  
        String n_str;
        Scanner sc = new Scanner(System.in);  
        n = sc.nextInt();
        k = sc.nextInt();
        n_str = Integer.toString(n);                     //Converting Int to String type for further operations
        Main obj = new Main();                           
        String answer_str = obj.rotate(n_str,k);         //rotated string
        int answer = Integer.parseInt(answer_str);       //rotated Integer
        System.out.println(answer);
        sc.close();
    }
    String rotate(String str , int k){
        String str1="";
        String str2="";
        int len = str.length();                          //Getting length of string
        if (k>=0){
            k = k%len;                                   //Taking modulus of k with length of string to avoid index OutOfRange Error
            str1 = str.substring(len-k , len);           //Getting last k letters
            str2 = str.substring(0,len-k);               //Getting remaining letters
        }
        else{
            k = k*(-1);
            k = k%len;
            str1 = str.substring(k, len);                //Getting all letters except first k letters
            str2 = str.substring(0, k);                  //Getting first k letters
        }
        String answer = str1+str2;                       //Adding the both pieces of string
        return answer;
    }
}
