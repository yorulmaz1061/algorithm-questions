package codewarsQuestions.otherType;

public class Pillars {
    public static void main(String[] args) {


    }

    public static int pillars(int numPill, int dist, int width) {
        int totalDist = 0;
        int totalPilldistance = (numPill - 1) * dist * 100;
        int totalPillWidth = (numPill - 2) * width;
        if (numPill <= 1) return 0;
        else {
            return totalDist = totalPilldistance * totalPillWidth;
        }

    }
}