package controlflow.level2;

import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();

        int heightAmar = input.nextInt();
        int heightAkbar = input.nextInt();
        int heightAnthony = input.nextInt();

        if(ageAmar < ageAkbar && ageAmar < ageAnthony){
            System.out.println("Amar is the Youngest");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Akbar is the Youngest");
        }
        else{
            System.out.println("Anthony is the  Youngest");
        }

        if(heightAmar > heightAkbar && heightAmar >heightAnthony){
            System.out.println("Amar is the Tallest");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Akbar is the tallest");
        }
        else{
            System.out.println("Anthony is the tallest");
        }
        input.close();
    }
}
