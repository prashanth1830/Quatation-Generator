import java.util.Random;
public class Quotegen {
    public static void main(String[] args) {
        String[] quotes = {
            "Hi,Sir",
            "The only limit to our realization is our doubts of today...",
            "Success is not final, failure is not fatal"
        };
        Random random = new Random();
        int randomIndex = random.nextInt(quotes.length);
        System.out.println("Random Quote: " + quotes[randomIndex]);
    }
}
