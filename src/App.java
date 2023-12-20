public class App {
    public static void main(String[] args) throws Exception {
        int position = 0;
        int randomNumber = (int) (Math.random() * 100);
        int dice = (randomNumber % 6) + 1;
        int option = randomNumber % 3;
        if (option == 1)
            position += dice;
        if (option == 2) {
            position -= dice;
            position = Math.max(position, 0);
        }
        System.out.println("The current position is " + position);
    }
}
