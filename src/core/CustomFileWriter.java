package core;

import java.io.FileWriter;
import java.io.IOException;

public class CustomFileWriter {

    public void writeUserDataToFile(UserData userData) {
        try (FileWriter writer = new FileWriter(userData.getSurname() + ".txt", true)) {
            writer.write(userData.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}