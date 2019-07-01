package garonh.checkpoint3;

import java.util.Scanner;

public class MultipleChoiceQuestion extends Question {
    private String[] mOptions;
    private int mAnswer;
    int index = 0;


    public MultipleChoiceQuestion(String text, String[] Options, int ans) {
        super(text);
        mAnswer = ans;
        mOptions = Options;
    }

    public void setFillAnswer(String[] Options) {
        mOptions = Options;
    }

    public int getAnswer() {
        return mAnswer;
    }

    @Override
    public boolean isMultipleChoiceQuestion() {
        return true;
    }

    @Override
    public boolean readInputAndCheckAnswer(Scanner input) {

       for (int index = 0; index < 4; index++) {

           System.out.println(mOptions[index]);

        }

        System.out.println("Enter the number: ");
        int in = input.nextInt();
        return checkAnswer(in);

    }



    @Override
    public boolean checkAnswer(int userAnswer) {
        if (userAnswer == mAnswer) {
            return true;

        }
        return false;
    }
}


