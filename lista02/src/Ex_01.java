import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();

        if(num % 2 != 0) {
            System.out.println("Weird");
        }else {
            if(num >= 2 && num <5) {
                System.out.println("Not weird");
            }else if(num >= 6 && num <=20) {
                System.out.println("Weird");
            }else{
                System.out.println("Not weird");
            }
        }

        scan.close();
    }
}