import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int total=0;
        for(int i=1;i<number;i++) {
            if(number%i==0) {
                total+=i;
            }
        }
        if (number<2) {
            System.out.println("Duzgun say deyil");
            return;
        }
        if(total==number) {
            System.out.println(number);
        }
        else {
            System.out.println("Beraber deyil");
        }
    }
}