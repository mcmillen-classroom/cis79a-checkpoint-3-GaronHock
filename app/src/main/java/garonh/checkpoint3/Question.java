package garonh.checkpoint3;

import java.util.Scanner;

public abstract class Question {
    private String mText;
    private int mAnswerType;

    public Question(String text) {
        mText = text;
    }


    //0 = read in boolean, 1 = read in string, 2 = read in number


    //Stub method intentionally does nothing
    public boolean checkAnswer(boolean boolResponse) {
        return false;
    }
    //Stub method
    // Only applies to fill in the blank question
    public boolean checkAnswer(String userAnswer)
    {
        return false;
    }

    public int getAnswerType() {
        return mAnswerType;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String toString() {
        return "Question: " + mText;
    }
    //Stub
    public boolean readInputAndCheckAnswer(Scanner input){
        return true;
    }

    public boolean checkAnswer(int ans) {
        return true;
    }

    public boolean isMultipleChoiceQuestion(){
        return false;
    }

}

