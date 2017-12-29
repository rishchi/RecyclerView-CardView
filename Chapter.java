package com.example.rishabh.lastone;

import java.util.ArrayList;

/**
 * Created by Rishabh on 7/26/2017.
 */

public class Chapter {
    private String chapterName;
    private ArrayList<TestQuiz> allTest;

    public Chapter(String name, ArrayList<TestQuiz> test)
    {
        chapterName=name;
        allTest=test;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public ArrayList<TestQuiz> getAllTest() {
        return allTest;
    }

    public void setAllTest(ArrayList<TestQuiz> allTest) {
        this.allTest = allTest;
    }
}
