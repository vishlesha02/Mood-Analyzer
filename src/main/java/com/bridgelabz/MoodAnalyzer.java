package com.bridgelabz;

public class MoodAnalyzer {

    private String message;
    public MoodAnalyzer()
    {

    }
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood (String message)
        {
            if (message.contains("happy")) {
                return "happy";
            } else if (message.contains("sad")) {
                return "sad";
            }
            return null;
        }

    public String analyzeMoodRefactor ()
    {
        if (message.contains("happy")) {
            return "happy";
        } else if (message.contains("sad")) {
            return "sad";
        }
        return null;
    }

}


