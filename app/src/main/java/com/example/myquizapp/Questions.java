package com.example.myquizapp;

public class Questions {

    public String mQuestion[]={
            "1+1",
            "1+2",
            "1+3",
            "1+4",
            "1+5",
            "1+6",
            "1+7",
            "1+8",
            "1+9",
    };

    private String mChoice[][]={
            {"2","3","4","5"},
            {"2","3","4","5"},
            {"4","3","10","5"},
            {"10","3","5","2"},
            {"6","3","4","5"},
            {"2","3","4","7"},
            {"7","3","8","5"},
            {"2","9","4","5"},
            {"10","9","4","5"},
            {"2","3","10","9"},
    };
    private String mCorrectAnswer[]={"2","3","4","5","6","7","8","9","10"};

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
