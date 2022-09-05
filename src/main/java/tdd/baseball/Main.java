package tdd.baseball;

import tdd.baseball.service.GenerateRandomNum;
import tdd.baseball.request.Input;
import tdd.baseball.request.PlayAgain;
import tdd.baseball.service.Judge;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenerateRandomNum randomNum = new GenerateRandomNum();
        Input input = new Input();
        Judge judge = new Judge();
        PlayAgain playagain = new PlayAgain();
        boolean again = true;

        while (again){
            List<Integer> computer = randomNum.create();
            String result = "";
            while (!result.equals("3스트라이크")){
                result = judge.judgement(computer, input.playerNumber());
                System.out.println(result);
            }
            again = playagain.playAgain();
        }
    }
}
