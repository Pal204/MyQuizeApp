package com.example.myquizapp;

public class Question2 {

    public String mQuestion[]={
            "A___C",
            "I___K",
            "M___O",
            "O___Q",
            "W___Y",
            "R___P",
            "B___D",
            "H___J",
            "L___N",
    };

    private String mChoice[][]={
            {"B","J","P","M"},
            {"O","J","P","M"},
            {"N","J","P","M"},
            {"B","P","J","M"},
            {"X","J","P","M"},
            {"B","J","P","O"},
            {"O","J","C","M"},
            {"B","I","P","M"},
            {"M","J","P","B"},
    };
    private String mCorrectAnswer[]={"B","J","N","P","X","O","C","I","M"};

    public String getQuestion(int a){
        String question=mQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String choice=mChoice[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice=mChoice[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice=mChoice[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice=mChoice[a][3];
        return choice;
    }
    public String getCorrentanswer(int a){
        String answer=mCorrectAnswer[a];
        return answer;
    }
}
