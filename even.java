
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data= new Scanner(System.in);
        System.out.println("enter the num");
       int num=data.nextInt();
        System.out.println("num:"+num);
    if (num%2==0){
        System.out.println("the num is even");
    }   
    else{
        System.out.println("the num is odd");
    }
    }
}
