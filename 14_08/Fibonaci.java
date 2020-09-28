import java.util.Scanner;

public class Fibonaci {

    public static void main(String[] args) {

        //Napisati program koji ce ispisati n brojeva Fibonacijevog niza.

        Scanner sc=new Scanner(System.in);
        int fib1=0, fib2=1, fib3=0;
        System.out.println("Unesite broj cifara niza");
        int brojac= sc.nextInt();
        System.out.print(fib1+ " ");
        System.out.print(fib2+ " ");

        while(brojac>0){
            fib3=fib1+fib2;
            fib1=fib2;
            fib2=fib3;
            System.out.print(fib3+ " ");
            brojac--;
        }

    }

    }
