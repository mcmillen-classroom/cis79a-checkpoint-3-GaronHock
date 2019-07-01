package garonh.checkpoint3;

import java.util.Scanner;

public class TFQuestion extends Question {
    private boolean mTFAnswer;
    private String[] mFillAnswer;

    public TFQuestion(String text, boolean ans) {
        super(text);
        mTFAnswer = ans;
    }

    //Checks the user input against answer returns whether the user answered the question correctly
    @Override //This is supposed to overRide something from the parent
    public boolean checkAnswer(boolean userAnswer)
    {
     return (mTFAnswer == userAnswer);
    }

    public boolean getTFAnswer() {
        return mTFAnswer;
    }

    public void setTFAnswer(boolean TFAnswer) {
        mTFAnswer = TFAnswer;
    }

    //Fill in the blank
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
    public boolean readInputAndCheckAnswer(Scanner input)
    {
        System.out.print("Enter T/F: ");
        String in = input.nextLine();
        boolean boolResponse;

        if (in.equals("T") || in.equals("true")) {
            boolResponse = true;
        } else {
            boolResponse = false;
        }
        return checkAnswer(boolResponse);
    }

    @Override
    public boolean checkAnswer(int ans) {
        return true;
    }
}
