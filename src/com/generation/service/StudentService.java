package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import javax.sound.midi.SysexMessage;
import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put(student.getId(), student);
    }

    public Student findStudent( String studentId )
    {
        return students.get(studentId);
    }

    public boolean showSummary()
    {
        if(students.isEmpty()) {
            return false;
        }
        else {
            for (Student s: students.values()){
                System.out.println("Student: " +s);
                for(Course c : s.getEnrolledCourses()){
                    System.out.println("Course: " +c);
                }
            }
            return true;
        }
    }

    public void enrollToCourse( String studentId, Course course )
    {
        students.get(studentId).enrollToCourse(course);
    }
}
