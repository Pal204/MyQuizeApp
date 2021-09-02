package com.example.myquizapp;

public class Questions1 {

    public String mQuestion[]={
            "A",
            "B",
            "C",
            "D",
            "E",
            "F",
            "G",
            "H",
            "I",
    };

    private String mChoice[][]={
            {"a","b","c","d"},
            {"a","b","c","d"},
            {"c","b","c","d"},
            {"a","b","d","d"},
            {"e","b","c","d"},
            {"a","b","c","f"},
            {"f","b","g","d"},
            {"a","h","c","d"},
            {"i","b","c","d"},
    };
    private String mCorrectAnswer[]={"a","b","c","d","e","f","g","h","i"};

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
