package codewarsQuestions.highLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MoveZeros {
    public static void main(String[] args) {
        int[] array={0,1,0,3,12};
        moveZeroes(array);



    }
    public static void moveZeroes(int[]nums){
        int size=nums.length;
        if (size==0 || size==1){
            return;
        }
        int nz=0;
        int z=0;
        while (nz<size){
            if (nums[nz] !=0){
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z]= temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
        System.out.println(Arrays.toString(nums));


    }
}
