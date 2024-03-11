import java.util.Scanner;

import core.CustomFileWriter;
import core.UserData;
import core.UserDataParser;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите данные (фамилия имя отчество дата_рождения телефон пол):");
            String input = scanner.nextLine();

            UserDataParser parser = new UserDataParser();
            UserData userData = parser.parseUserData(input);

            CustomFileWriter fileWriter = new CustomFileWriter();
            fileWriter.writeUserDataToFile(userData);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}