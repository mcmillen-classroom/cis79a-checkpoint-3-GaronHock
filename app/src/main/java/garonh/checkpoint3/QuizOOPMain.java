package garonh.checkpoint3;

import java.util.Scanner;

public class QuizOOPMain {




    public QuizOOPMain(String text) {


    }

    // this is where the app starts
    //MAIN
    public static void main (String[] args) {

        //PART1

        // System.out.println("Welcome to the quiz! Good luck");
        // Question q1 = new Question("hey", true);
        //System.out.println(q1);
        // q1.setText("I've changed my question text");
        // q1.setTFAnswer(false);
        // System.out.println(q1);


        //PART2

        String [] theOptions = {"1.Ruby", "2.Javascript", "3.C++", "4.Java"};
        String [] theNames = {"1.Jeff", "2.Heffe", "3.William", "4.Bobby"};

        Question[] questions = new Question[5];
        questions[0] = new TFQuestion("Laney is better than BCC ", true);
        questions[1] = new TFQuestion("Java is an easy to understand language ", false);
        questions[2] = new FillTheBlankQuestion("When season will the F building be open again?", "fall");
        questions[3] = new MultipleChoiceQuestion("Which language is the best", theOptions, 3);
        questions[4] = new MultipleChoiceQuestion("What's my middle name", theNames, 3);

        int index = 0;
        int score = 0;







        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the quiz! Good luck");

        while (index < questions.length) {
            System.out.println(questions[index].getText());



                if (questions[index].readInputAndCheckAnswer(input)) {
                    System.out.println("You are correct!");

                } else {
                    System.out.println("You are incorrect");
                }



            index++;
            }

        }



    }
