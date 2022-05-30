package com.generation.model;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;
    private ArrayList<Course> enrolledCourses;

    public Student( String id, String name, String email, Date birthDate)
    {
        super( id, name, email, birthDate );
        enrolledCourses = new ArrayList<>();
    }

    public void enrollToCourse( Course course )
    {
        enrolledCourses.add(course);
    }

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO
        return null;
    }

    public Course findCourseById( String courseId )
    {
        for (Course c : enrolledCourses) {
            if (enrolledCourses.equals(courseId)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        return enrolledCourses;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}
