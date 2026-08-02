class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandies = 0;
        for(int candy : candies ){
            maxcandies = Math.max(maxcandies, candy);
        }
        List<Boolean> str = new ArrayList<>();
        for(int candy : candies ){
            if(candy + extraCandies >= maxcandies ){
                str.add(true);
            }
            else{
                str.add(false);
            }
        }
        return str;
    }
}