package org.pearl;

import java.util.Arrays;

public class Assignment {
    private String assignmentId;
    private int[] scores = new int[10];
    private static int nextId = 1;

    public Assignment() {
        this.assignmentId = "A" + String.format("%02d", nextId++);
        for (int i = 0; i < scores.length; i++) {
            scores[i] = (int) (Math.random() * 100);
        }
    }

    public double calcAssignmentAvg() {
        return Arrays.stream(scores).average().orElse(0);
    }

    public static boolean isAssignmentsTotalWeightValid(int totalWeight) {
        return totalWeight == 100;
    }

    @Override
    public String toString() {
        return assignmentId + ": " + Arrays.toString(scores);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Assignment that = (Assignment) obj;
        return assignmentId.equals(that.assignmentId) &&
                Arrays.equals(scores, that.scores);
    }


}
