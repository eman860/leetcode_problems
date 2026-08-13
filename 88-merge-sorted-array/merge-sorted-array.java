class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int max = m-1;
        int nax = n-1;
        int right = m + n - 1;

        while(nax >= 0){
            if(max >=0 && nums1[max] > nums2[nax]){
                nums1[right] = nums1[max];
                max--;
            }
            else{
                nums1[right] = nums2[nax];
                nax--;
            }
            right --;
        }
    }
}