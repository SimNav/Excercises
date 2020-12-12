package lt.sdacademy.javafundamentals.Gruodzio12.PasswordValidationHomework;

public class Password {
    private String password;
    private int minLength = 6;
    private int maxLength = 12;

    public Password(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }


    public boolean isValid() {
        if (password.length() < minLength || password.length() > maxLength) {
            return false;
        }
        if (!(password.matches("[a-zA-Z0-9]+"))) {
            return false;
        }
        char[] passToCharArray = password.toCharArray();
        int count = 0;
        for (char n : passToCharArray) {
            if (Character.isDigit(n)) {
                count++;
            }
        }
        if (count < 2) {
            return false;
        }
        for (int i = 0; i < passToCharArray.length - 1; i++) {      // "11abcde"
            for (int j = i + 1; j <= i + 1; j++) {
                if (Character.isDigit(passToCharArray[i]) && Character.isDigit(passToCharArray[j])) {
                    return false;
                }
            }

        }
        return true;
    }

}
