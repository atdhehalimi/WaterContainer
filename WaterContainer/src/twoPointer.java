import java.util.Random;

public class twoPointer {
    public int maxArea(int[] height) {

//Mbajmë dy indekse, left = 0 dhe right = n-1 dhe një vlerë maxarea që ruan zonën maksimale.
        int maxarea = 0;
        int left = 0; 
        int right = height.length - 1;
//Ekzekutojmë unazën while përderisa left është më i vogël se right.        
        while (left < right) {
            int width = right - left;
//Përditësojmë maxarea me maksimumin e sipërfaqes maxarea dhe min(array[left], array[right])*width           
            maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * width);
//Nëse vlera në array[left] është më e madhe se array[right], atëherë përditësojmë right si right – 1, përndryshe përditësojmë left si left + 1
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
//Shtypim maxarea        
        return maxarea;
    }
}