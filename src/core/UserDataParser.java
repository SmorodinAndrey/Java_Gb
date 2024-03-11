package core;

public class UserDataParser {

    public UserData parseUserData(String input) {
        String[] data = input.split(" ");

        if (data.length != 6) {
            throw new IllegalArgumentException("Неверное количество данных!");
        }

        String surname = data[0];
        String firstName = data[1];
        String middleName = data[2];
        String dateOfBirth = data[3];
        long phoneNumber;
        char gender;

        try {
            phoneNumber = Long.parseLong(data[4]);
            if (!String.valueOf(phoneNumber).matches("\\d+")) {
                throw new IllegalArgumentException("Номер телефона должен содержать только цифры!");
            }

            gender = data[5].charAt(0);
            if (gender != 'f' && gender != 'm') {
                throw new IllegalArgumentException("Пол должен быть символом 'f' или 'm'!");
            }
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Неверный формат данных!");
        }

        if (!dateOfBirth.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new IllegalArgumentException(
                    "Неверный формат даты рождения. Дата рождения должна быть в формате ДД.ММ.ГГГГ");
        }

        return new UserData(surname, firstName, middleName, dateOfBirth, phoneNumber, gender);
    }
}