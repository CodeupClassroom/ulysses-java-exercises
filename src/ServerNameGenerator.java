public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjectives = {"happy", "quirky", "wonderful", "bready", "blue", "hasty", "lethargic", "verdant", "supportive", "rainy"};

        String[] nouns = {"day", "vehicle", "bunny-rabbit", "standard", "computer", "keyboard", "language", "expression", "statement"};


        String randomAdjective = getRandom(adjectives);
        String randomNoun = getRandom(nouns);

        String serverName = randomAdjective + "-" + randomNoun;

        System.out.println("Your new server is named: " + serverName);

    }

    public static String getRandom(String[] array) {
        int randomIndex = (int) Math.floor(Math.random() * array.length);
        return array[randomIndex];
    }
}
