//yousef yasser
//20216049

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(num+ " * " + i+ " = "+ num * i);
        }
    }
}