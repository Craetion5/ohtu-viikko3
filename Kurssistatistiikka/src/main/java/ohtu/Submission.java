package ohtu;

import java.util.ArrayList;

public class Submission {

    private int week;
    private String course;
    private ArrayList <Integer> exercises;
    private int hours;

    public void setWeek(int week, int hours, String course, ArrayList exercises) {
        this.week = week;
        this.hours = hours;
        this.course = course;
        this.exercises = exercises;
    }

    public int getWeek() {
        return week;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public ArrayList getExercises() {
        return exercises;
    }

    public void setExercises(ArrayList exercises) {
        this.exercises = exercises;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        String exer = "";
        for (int i = 0; i < exercises.size(); i++) {
            exer = exer + exercises.get(i);
            if (i != exercises.size() - 1) {
                exer += ", ";
            }
        }

        return course + ", viikko " + week + " tehtyjä tehtäviä yhteensä " + exercises.size() + ", aikaa kului " + hours + " tuntia, tehdyt tehtävät: " + exer;
    }
}
