package com.mohammedev.androidschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /**
     *  عرفوا مصفوفة بإسم students
     *  define an arraylist named students
     */
    ArrayList<Student> students = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.studentListView);

        /**
         *  إكتبوا الكود بعد هذا السطر
         *  ضيفوا عناصر من الكلاس
         *  add objects from class Student
         */

        Student s1 = new Student("Noor",14,12,R.drawable.girl);
        Student s2 = new Student("Maryam",13,10,R.drawable.girl1);
        Student s3 = new Student("Sara",15,11,R.drawable.girl2);

        students.add(s1);
        students.add(s2);
        students.add(s3);


        StudentAdapter studentAdapter = new StudentAdapter(this,0,students);


        listView.setAdapter(studentAdapter);
    }
}