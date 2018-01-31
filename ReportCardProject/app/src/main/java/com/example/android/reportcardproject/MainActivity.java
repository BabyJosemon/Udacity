package com.example.android.reportcardproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ReportCard student = new ReportCard();

        List<String> Subjects = new ArrayList<>();
        List<Integer> Marks = new ArrayList<>();

        Subjects.add("English");
        Subjects.add("Mathematics");
        Subjects.add("Java");
        Subjects.add("Algorithms");
        Subjects.add("Automata");

        Marks.add(95);
        Marks.add(89);
        Marks.add(92);
        Marks.add(93);
        Marks.add(96);

        student.setSubjects(Subjects);
        student.setMarks(Marks);


    }
}
