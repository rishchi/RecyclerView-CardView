package com.example.rishabh.lastone;

import java.util.ArrayList;

/**
 * Created by Rishabh on 7/26/2017.
 */

public class Subject {

        private String title;
        ArrayList<Chapter>chapterNames;

        public Subject(String name, ArrayList<Chapter> subClass)
        {
            title=name;
            chapterNames=subClass;
        }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Chapter> getChapterNames() {
        return chapterNames;
    }

    public void setChapterNames(ArrayList<Chapter> chapterNames) {
        this.chapterNames = chapterNames;
    }
}
