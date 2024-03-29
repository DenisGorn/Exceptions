import java.util.Scanner;

public class GetData {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию, имя, отчество, дату рождения (в формате dd.mm.yyyy), номер телефона " +
                "(число без разделителей) и пол(символ латиницей f или m), разделенные пробелом\nПример заполнения: Ivanov Ivan Ivanovich 01.01.1980 89012223344 m\n");
        String input = scanner.nextLine();
        String[] data = getData(input);
        CheckFormat.checkFormats(data);
        WriteToFile.writeToFile(data);
        scanner.close();
    }

    public static String[] getData(String input) {
        String[] result = input.split(" ");
        if (result.length < 6) {
            throw new RuntimeException("Введены не все данные!");
        } else if (result.length > 6) {
            throw new RuntimeException("Введены лишние данные!");
        }
        return result;
    }
}
