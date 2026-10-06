class Solution {
    public int maxArea(int[] height) {
        // int maxarea = 0;
        // for(int i =0;i<height.length-1;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int heightt = Math.min(height[i],height[j]);
        //         int width = j - i;
        //         int area = width * heightt;
        //         maxarea = Math.max(area,maxarea);
        //     }
        // }
        // return maxarea;
        int n = height.length;
        int i = 0;
        int j = n - 1;
        int maxarea = 0;
        while(i < j){
            int h = Math.min(height[i],height[j]);
            int width = j - i;
            int area = h * width;
            maxarea = Math.max(area,maxarea);
        
        if(height[i] <= height[j]){
            i++;
        } else{
            j--;
        }
        }
        return maxarea;
    }
}