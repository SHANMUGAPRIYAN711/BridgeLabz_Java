package methods.level3;

public class FootBallTeamHeight {
    public static int[] generateHeight(){
        int[] heights = new int[11];
        for(int i = 0; i < heights.length; i++){
            heights[i] = (int)(Math.random()*101) + 150;
        }
        return heights;
    }
    //find sum of Heights
    public static int findsum(int[] heights){
        int sum = 0;
        for(int h : heights){
            sum += h;
        }
        return sum;
    }
    //find mean
    public static double findmean(int[] heights){
        return (double) findsum(heights) /heights.length;
    }
    //To find Shortest height
    public static int findShortest(int[] heights){
        int min = heights[0];
        for(int h : heights){
            if(h < min){
                min = h;
            }
        }
        return min;
    }
    //To find tallest height
    public static int findLargest(int[] heights){
        int max = 0;
        for(int h : heights){
        if(h > max){
            max = h;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] height =generateHeight();
        System.out.println("Mean height :" + findmean(height));
        System.out.println("Shortest height : " + findShortest(height));
        System.out.println("Tallest height  : " + findLargest(height));
    }
}
