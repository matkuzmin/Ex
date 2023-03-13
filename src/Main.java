

public class Main {
    public static void main(String[] args) {
        String s = "1234567";
        if (s.length() % 2 == 0) {
            String s1 = s.substring(0, s.length() / 2);
            String s2 = s.substring(s.length() / 2, s.length());
            System.out.println("Строка 1 " + s1 + " Строка 2 " + s2);
        }
        else
            System.out.println("Введите строку в которой колличество символов четное");

    }

}
