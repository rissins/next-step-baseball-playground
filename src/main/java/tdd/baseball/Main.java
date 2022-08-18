package tdd.baseball;

import tdd.baseball.request.Input;
import tdd.baseball.request.View;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        View view = new View();

        view.requestNumber();
        input.inputNumber();
    }
}
