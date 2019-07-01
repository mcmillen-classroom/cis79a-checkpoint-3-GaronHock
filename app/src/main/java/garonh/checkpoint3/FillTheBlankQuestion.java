package garonh.checkpoint3;

import java.util.Scanner;

public class FillTheBlankQuestion extends Question {

    private String[] mFillAnswer;

    public FillTheBlankQuestion(String text, String... ans) {
        super(text);
        mFillAnswer = ans;
    }

    //Fill in the blank
    @Override
    public boolean checkAnswer(String userAnswer)
    {
        for (String ans: getFillAnswer())
        {
            if (ans.equalsIgnoreCase(userAnswer))
            {
               return true;
            }

        }
        return false;
    }

    public String[] getFillAnswer() {
        return mFillAnswer;
    }

    public void setFillAnswer(String[] fillAnswer) {
        mFillAnswer = fillAnswer;
    }
    @Override
    public boolean readInputAndCheckAnswer(Scanner input){
        System.out.println("Enter Answer: ");
        String in = input.nextLine();
        return checkAnswer(in);
    }


    public boolean checkAnswer(int ans) {
        return true;
    }

}
