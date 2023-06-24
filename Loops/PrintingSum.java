import java.util.*;

class PrintingSum{
    public static void main(String args[]){
        int n = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        while(n<i){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}