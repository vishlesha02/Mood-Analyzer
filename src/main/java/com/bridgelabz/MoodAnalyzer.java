package com.bridgelabz;

public class MoodAnalyzer {

        public String analyzeMood (String message)
        {
            if (message.contains("happy")) {
                return "happy";
            } else if (message.contains("sad")) {
                return "sad";
            }
            return null;
        }
    }


