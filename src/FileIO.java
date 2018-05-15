import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIO {
    public static void main(String[] args) {
        String directory = "data";
        String filename = "groceries.txt";

        createFileIfNotExists(directory, filename);

//        ArrayList<String> items = makeList();
//        System.out.println(items);
//
//        try {
//            writeListToFile(items, directory, filename);
//        } catch(IOException e) {
//            System.out.println(e.getMessage());
//        }
        try {
            readLines(directory, filename);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }


    }

    public static void createFileIfNotExists(String directory, String filename) {

            Path dataDirectory = Paths.get(directory);
            Path dataFile = Paths.get(directory, filename);

            try {
                if (Files.notExists(dataDirectory)) {
                    Files.createDirectories(dataDirectory);
                }

                if (Files.notExists(dataFile)) {
                    Files.createFile(dataFile);
                }
            } catch(IOException e) {
                System.out.println(e.getMessage());
            }
    }


    public static void writeListToFile(ArrayList<String> list, String directory, String filename) throws IOException {

        Path filepath = Paths.get(directory, filename);
        Files.write(filepath, list, StandardOpenOption.APPEND);

    }

    public static void readLines(String directory, String filename) throws IOException {

        Path filePath = Paths.get(directory, filename);

        List<String> list = Files.readAllLines(filePath);

        for(String item : list) {
            System.out.println(item);
        }
    }

    public static ArrayList<String> makeList() {
        ArrayList<String> list = new ArrayList<>();
        Input input = new Input();
        String item;

        do {
            item = input.getString("Please input the item you want to add to the list.");
            list.add(item);

        } while(input.yesNo("Do you want to add another item to the list? Press y or Yes to continue"));

        return list;
    }

}
