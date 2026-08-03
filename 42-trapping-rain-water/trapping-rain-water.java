class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length -  1;
        int leftmax =0;
        int rightmax =0;
        int totalmax = 0;

        while(left < right){
            if(height[left] <  height[right]){
                if(height[left] > leftmax){
                    leftmax = height[left];
                }
                else{
                    totalmax += leftmax - height[left];
                }
                left++;
            }
            else{
                if(height[right] > rightmax){
                    rightmax = height[right];

                }
                else{

                    totalmax += rightmax - height[right];
                }
                right--;
            }
        }

        return totalmax;
    }
}