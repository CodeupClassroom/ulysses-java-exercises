package shapes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShapesTest {
    public static void main(String[] args) {

        HashMap<String, Measurable> quadrilaterals = new HashMap<>();

        quadrilaterals.put("box1", new Rectangle(3, 5));
        quadrilaterals.put("box2", new Square(4));
        quadrilaterals.put("box3", new Square(12));

        // iterating across a HashMap
        for (Map.Entry<String, Measurable> entry : quadrilaterals.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }


        ArrayList<String> compiledLanguages = new ArrayList<>();
        compiledLanguages.add("Java");
        compiledLanguages.add("C++");
        compiledLanguages.add("C#");
        compiledLanguages.add("Swift");

        ArrayList<String> interpretedLanguages = new ArrayList<>();
        interpretedLanguages.add("Ruby");
        interpretedLanguages.add("Python");
        interpretedLanguages.add("Clojure");
        interpretedLanguages.add("Scheme");
        interpretedLanguages.add("Lisp");
        interpretedLanguages.add("Lisp");
        interpretedLanguages.add("Lisp");
        interpretedLanguages.add("Lisp");
        interpretedLanguages.add("Lisp");
        interpretedLanguages.add("JavaScript");


        if(interpretedLanguages.contains("Lisp")) {
            int count = 0;
            for(String language : interpretedLanguages) {
                if(language.equalsIgnoreCase("lisp")) {
                    count++;
                }
            }
            System.out.println("LISP shows up " + count + " times.");
        }

        HashMap<String, ArrayList> languages = new HashMap<>();
        languages.put("compiled", compiledLanguages);
        languages.put("interpreted", interpretedLanguages);

        // how to get "JavaScript" out of this data
        String output = (String) languages.get("interpreted").get(interpretedLanguages.indexOf("JavaScript"));

        System.out.println(output);

    }
}
