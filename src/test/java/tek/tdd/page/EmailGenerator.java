package tek.tdd.page;

import java.util.Random;

public class EmailGenerator {
    public String generateRandomEmail() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder email = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(allowedChars.length());
            email.append(allowedChars.charAt(index));
        }
        email.append("kaur04@gmail.com");

        return email.toString();
    }
}
