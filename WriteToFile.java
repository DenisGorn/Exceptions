import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void writeToFile(String[] data) {
        String fileName = data[0] + ".txt";
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter("data\\" + file, true)) {
            fileWriter.write(String.format("%s %s %s %s %s %s" + "\n", data[0], data[1],
                    data[2], data[3], data[4], data[5]));
        } catch (IOException e) {
            throw new RuntimeException("Возникла ошибка при работе с файлом");
        }
    }
}
