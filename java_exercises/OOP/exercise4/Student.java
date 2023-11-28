package com.OOP.exercise4;


import java.util.Map;

public class Student implements Comparable<Student> {
    private Map<String, Integer> examNameToScore;

    @Override
    public int compareTo(Student other) {
        int thisAverageScore = calcAverageScore();
        int otherAverageScore = other.calcAverageScore();
        if (thisAverageScore < otherAverageScore) {
            return -1;
        } else if (thisAverageScore > otherAverageScore) {
            return 1;
        }
        return 0;
    }

    private int calcAverageScore() {
        int allExamScores = 0;
        for (Integer score : examNameToScore.values()) {
            allExamScores += score;
        }
        return allExamScores / examNameToScore.size();
    }
}
