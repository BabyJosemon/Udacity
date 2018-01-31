package com.example.android.reportcardproject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by babyj on 1/30/2018.
 */

public class ReportCard {

    List<String> Subjects;
    List<Integer> Marks;

    public ReportCard() {
        this.Subjects = new ArrayList<>();
        this.Marks = new ArrayList<>();
    }

    private List<String> getSubjects() {
        return Subjects;
    }

    public void setSubjects(List<String> Subject) {
        this.Subjects = Subject;
    }

    private List<Integer> getMarks() {
        return Marks;
    }

    public void setMarks(List<Integer> mark) {
        this.Marks = mark;
    }

    private double getAverage() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += Marks.get(i);
        }
        return sum / 5;
    }

    public String getSubjectNames() {
        List<String> allSubjects = getSubjects();
        List<Integer> allMarks = getMarks();

//        StringBuilder temp2 = new StringBuilder();
//        for(String Subjects : allSubjects){
//            temp2.append(Subjects);
//            temp2.append(",");
//        }
//        String temp = temp2.toString();
//        return temp;

        String temp = "";
        for (int i = 0; i < allSubjects.size(); i++) {
            temp += ("Subject: " + allSubjects.get(i) + " Marks: " + Integer.toString(allMarks.get(i)) + "\n");
        }
        return temp;
    }

    @Override
    public String toString() {
        return "REPORT CARD: " + "\n"
                + getSubjectNames() + "\n"
                + "Average of Student: " + getAverage();
    }

}
