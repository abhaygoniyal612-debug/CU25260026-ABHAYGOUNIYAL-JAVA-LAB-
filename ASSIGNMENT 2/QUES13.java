import java.util.Scanner;

class QUES13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result;

        if (Character.isDigit(ch)) {
            result = "Digit";
        } else {
            result = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                    ? ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                        ? "Vowel" : "Consonant")
                    : "Special Symbol";
        }

        System.out.println("The character is a " + result);

        sc.close();
    }
}