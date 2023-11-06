package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerJunit {

    MoodAnalyzer obj=new MoodAnalyzer();
    @Test
    public void analyze_Given_Message_And_RespondMood_Sad()
    {
       Assertions.assertEquals("sad",obj.analyzeMood("I am in sad mood"));
    }

    @Test
    public void analyze_Given_Message_And_RespondMood_Happy()
    {
        Assertions.assertEquals("happy",obj.analyzeMood("I am in happy mood"));
    }
}
