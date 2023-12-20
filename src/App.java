public class App {
    public static void main(String[] args) throws Exception {
        int position = 0;

        while (position < 100) {
            int randomNumber = (int) (Math.random() * 100);
            int option = randomNumber % 3;
            int dice = (randomNumber % 6) + 1;
            if (option == 1) {
                position = position + dice > 100 ? position : position + dice;
            }
            if (option == 2)
                position = Math.max(0, position - dice);
        }
        System.out.println("The player reached the 100 mark ");
    }
}
