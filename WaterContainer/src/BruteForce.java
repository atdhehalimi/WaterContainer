import java.util.Random;
public class BruteForce {

    public int maxArea(int[] height) {        
        int maxarea = 0;
// Krijojmë një nested for loop, cikli i jashtëm përshkon grupin nga 0 deri në fund (indeksi i këtij cikli është left).
        for (int left = 0; left < height.length; left++) {
//Cikli i brendshëm përshkon grupin nga left + 1 deri në fund (indeksi i këtij cikli është right).
            for (int right = left + 1; right < height.length; right++) {
//Gjejmë ujin që mund të përmbahet në enë me lartësinë e kufijve vargu[left] dhe vargu[right], pra sipërfaqja = (right – left)* min(array[left],array[right])
                int width = right - left;
//Nëse kjo sipërfaqe është më e madhe se maksimumi aktual, përditësojmë maksimumin aktual   
                maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * width);
            }
        }
//Shtypim maksimumin aktual.
        return maxarea;
    }
}