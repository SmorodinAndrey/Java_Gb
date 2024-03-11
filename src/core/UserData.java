package core;

public class UserData {
    private String surname;
    private String firstName;
    private String middleName;
    private String dateOfBirth;
    private long phoneNumber;
    private char gender;

    public UserData(String surname, String firstName, String middleName, String dateOfBirth, long phoneNumber,
            char gender) {
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return surname + " " + firstName + " " + middleName + " " + dateOfBirth + " " + phoneNumber + " " + gender;
    }

}