package string.level2;

import java.util.Scanner;

class RockPaperScissors {

    static String computerChoice() {
        int n = (int)(Math.random() * 3);
        return n == 0 ? "rock" : n == 1 ? "paper" : "scissors";
    }

    static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("paper") && comp.equals("rock")) ||
                (user.equals("scissors") && comp.equals("paper")))
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int userWin = 0, compWin = 0;

        for (int i = 0; i < games; i++) {
            String user = sc.next();
            String comp = computerChoice();
            int res = winner(user, comp);

            if (res == 1) userWin++;
            else if (res == -1) compWin++;
        }

        System.out.println("User Win %: " + (userWin * 100.0 / games));
        System.out.println("Computer Win %: " + (compWin * 100.0 / games));
    }
}