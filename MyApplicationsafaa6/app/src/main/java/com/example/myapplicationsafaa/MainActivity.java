package com.example.myapplicationsafaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student> studentArrayList = new ArrayList<>();
    int currentStudent = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView StudentphotoView = findViewById(R.id.studentPhoto);
        TextView studentNameView = findViewById(R.id.studentName);
        TextView studentAgeView = findViewById(R.id.studentEge);
        TextView studentGredView = findViewById(R.id.studentGrade);
        Button button = findViewById(R.id.changeStudent);
        Student s1 = new Student( "youssef",14,12,R.drawable.boy1);
        Student s2 = new Student( "salman",13,10,R.drawable.boy2);
        Student s3 = new Student( "majed",15,11,R.drawable.boy3);
        Student s4 = new Student( "mohammed",16,10,R.drawable.boy4);




        studentArrayList.add(s1);  // 0
        studentArrayList.add(s2); // 1
        studentArrayList.add(s3); // 2
        studentArrayList.add(s4); // 3

        StudentphotoView.setImageResource(studentArrayList.get(currentStudent).getStudentPhoto());
        studentNameView.setText(studentArrayList.get(currentStudent).getStudentName());
        studentAgeView.setText(studentArrayList.get(currentStudent).getStudentAge());
        studentGredView.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentStudent == studentArrayList.size()){
                    currentStudent = 0;
                }
                currentStudent++;
                StudentphotoView.setImageResource(studentArrayList.get(currentStudent).getStudentPhoto());
                studentNameView.setText(studentArrayList.get(currentStudent).getStudentName());
                studentAgeView.setText(studentArrayList.get(currentStudent).getStudentAge());
                studentGredView.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));






            }
        });









    }
}




