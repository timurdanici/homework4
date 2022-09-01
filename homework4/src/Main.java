import java.util.Scanner;

public class Main {

    static void Upper(){
            System.out.println("Enter first word");
            Scanner sc = new Scanner(System.in);
            String x = sc.nextLine();
            System.out.println("Enter second word");
            String y = sc.nextLine();

            System.out.println(x.toUpperCase() + y.toUpperCase());
    }

    static StringBuilder DeleteVowel(StringBuilder builder) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] vow = {'a', 'e', 'i', 'o', 'y', 'u'};
        for (int i = 0; i < builder.length(); i++) {
            int count = 0;
            for (char c : vow) {
                if (builder.charAt(i) == c) {
                    count = 1;
                    break;
                }
            }
            if (count == 0) {
                stringBuilder.append(builder.charAt(i));
            }
        }
        return stringBuilder;
    }

    static void reverse(){
        String y = " ";
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter text");
        String x = sc.nextLine();
        int len = x.length();
        for(int i=len-1;i>=0;i--)
            y = y + x.charAt(i);
        System.out.println("Reversed text: " + y);
    }

    public static void main(String[] args) {
        Upper();

        System.out.println();

        String x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        x = sc.nextLine();
        StringBuilder builder = new StringBuilder(x);
        System.out.println(DeleteVowel(builder));
        System.out.println();

        reverse();
    }
    }

