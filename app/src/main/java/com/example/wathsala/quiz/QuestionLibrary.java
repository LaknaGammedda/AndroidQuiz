package com.example.wathsala.quiz;

/**
 * Created by
 * on 5/27/17.
 */
public class QuestionLibrary {

    private String mQuestions [] = {
            "Which the following is not  part of the three-sphere model for system management",
            "which process group normally requires  the most resources and time",
            "Which of following items is not normaly included in the project chater",
            "A ______ is a temporary endeavor undertaken to create a unique product service of result "


    };


    private String mChoices [][] = {
            {"Techology", "Information", "Business"},
            {"Initiating", "Planning", "Executing"},
            {"Guntt chart", "Stakeholder signature", "Budget information"},
            {"Program", "Process", "Project"}
    };


    private String mCorrectAnswers[] = {"Information","Executing","Guntt chart", "Project"};


    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }


    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }



    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}