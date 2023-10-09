package Lesson17;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
        public static void main(String[] args) {
            System.out.println("Enter your string. Don't forget about abbreviation");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String pattern = "\\b[A-Z]{2,6}\\b";
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(input);

            while (m.find()) {
                String match = m.group();
                System.out.println("Found: " + match);
            }
        }
    }

