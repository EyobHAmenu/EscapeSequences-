import java.util.Scanner;

public class EscapeSequences {
    public static void main(String[] args) {

        int height, base;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        height = sc.nextInt();
        System.out.print("Enter base: ");
        base = sc.nextInt();
        sc.nextLine();

        System.out.println("Box: ====================");
        for (int h = 1; h <= height ; h++) {
            for (int b = 1; b <=base ; b++) {
                if (b == 1 || b == base){
                    System.out.print("* ");
                }
                else if(h == 1 || h == height){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
