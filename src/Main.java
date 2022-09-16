import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String prompt = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        char[] charsInPrompt = prompt.toCharArray();
        int index = charsInPrompt.length;
        HashMap<Character, Integer> charList = new HashMap<>();
        int count = 0;
        for (char item : charsInPrompt)
            if (charList.containsKey(item)) {
                charList.put(item, charList.get(item) + 1);
            } else {
                charList.put(item, 1);
            }
        for (Map.Entry entry : charList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            // System.out.println(charList);
        }
    }
}
