public class CheckFormat {
    public static void checkFormats(String[] data) {
        if (data.length < 6) {
            throw new RuntimeException("Указаны не все данные");
        }
        if (data[0].matches(".*\\d.*")) {
            throw new RuntimeException("Фамилия не может содержать цифры!");
        }
        if (data[1].matches(".*\\d.*")) {
            throw new RuntimeException("Имя не может содержать цифры!");
        }
        if (data[2].matches(".*\\d.*")) {
            throw new RuntimeException("Отчество не может содержать цифры!");
        }
        if (data[3].length() != 10 || !data[3].contains(".")
                || data[3].matches("[a-zA-Zа-яА-Я]*$")) {
            throw new RuntimeException("Неверный формат даты!");
        }
        if (data[4].length() != 11 || data[4].matches(".*\\D.*")) {
            throw new RuntimeException("Неверный формат телефона!");
        }
        if (!data[5].equals("m") && !data[5].equals("f")) {
            throw new RuntimeException("Неверно указан пол!");
        }
    }
}
