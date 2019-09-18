package exam51to100;

public class Exam85 {
    class UserException extends Exception {
    }

    class AgeOutOfLimitException extends UserException {
    }

    public void doRegister(String name, int age)
            throws UserException, AgeOutOfLimitException {
        if (name.length() < 6) {
            throw new UserException();
        } else if (age >= 60) {
            throw new AgeOutOfLimitException();
        } else {
            System.out.println("User is registered.");
        }
    }

    public static void main(String[] args) throws UserException {
        Exam85 t = new Exam85();
        t.doRegister("Mathew", 60);
    }


}
