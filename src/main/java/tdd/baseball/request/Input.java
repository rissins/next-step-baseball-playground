package tdd.baseball.request;

import java.util.Scanner;

public class Input {

    private static Scanner SCANNER = new Scanner(System.in);

    public String inputNumber() {
        return SCANNER.next();
    }

    public int inputPlayRequestNumber() {
        return SCANNER.nextInt();
    }
}
