public class App {
    public static void main(String[] args) throws Exception {
        int player1 = 0;
        int player2 = 0;
        int chance = 0;
        int roll = 0;
        while (player1 < 100 && player2 < 100) {
            int randomNumber = (int) (Math.random() * 100);
            int option = randomNumber % 3;
            int dice = (randomNumber % 6) + 1;
            if (option == 1) {
                if (chance == 0)
                    player1 = player1 + dice > 100 ? player1 : player1 + dice;
                else
                    player2 = player2 + dice > 100 ? player2 : player2 + dice;
            }
            if (option == 2) {
                if (chance == 0)
                    player1 = Math.max(0, player1 - dice);
                else
                    player2 = Math.max(0, player2 - dice);
            }
            if (option != 1)
                chance = 1 - chance;
            roll++;
            System.out.println("Position of player 1 after " + roll + " moves is " + player1
                    + " and position of player 2 is " + player2);
        }
        System.out.println(player1 + " " + player2);
        if (player1 == 100)
            System.out.println("Player 1 won");
        if (player2 == 100)
            System.out.println("Player 2 won");
    }
}