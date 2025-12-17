import java.util.Scanner;

public class NaturalNumbers{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N = sc.nextInt();
        int sum=0;
        for(int i=1; i<=N; i++){
            sum+=i;

        }
        System.out.println("sum="+sum);
    }
}