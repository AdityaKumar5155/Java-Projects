import java.util.*;

public class Main {
    public static void main(String[] args){
        int n,k;
        String n_str;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        n_str = Integer.toString(n);
        Main obj = new Main();
        String answer_str = obj.rotate(n_str,k);
        int answer = Integer.parseInt(answer_str);
        System.out.println(answer);
        sc.close();
    }
    String rotate(String str , int k){
        String str1="";
        String str2="";
        int len = str.length();
        if (k>=0){
            k = k%len;
            str1 = str.substring(len-k , len);
            str2 = str.substring(0,len-k);
        }
        else{
            k = k*(-1);
            k = k%len;
            str1 = str.substring(k, len);
            str2 = str.substring(0, k);
        }
        String answer = str1+str2;
        return answer;
    }
}
