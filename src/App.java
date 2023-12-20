public class App {
    public static void main(String[] args) throws Exception {
        int position = 0;
        int randomNumber = (int) (Math.random() * 100);
        int dice = (randomNumber % 6) + 1;
        System.out.println("The number in the die is " + dice);
    }
}
