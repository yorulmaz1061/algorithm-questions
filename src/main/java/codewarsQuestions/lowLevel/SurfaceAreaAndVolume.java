package codewarsQuestions.lowLevel;

import java.util.Arrays;

public class SurfaceAreaAndVolume {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(getSize(4, 2, 6)));

    }
    public static int[] getSize(int w,int h,int d) {
        int area = (2*(w*d))+(2*(w*h))+(2*(d*h));
        int volume = w*h*d;
        return new int[]{area,volume};
    }
}
