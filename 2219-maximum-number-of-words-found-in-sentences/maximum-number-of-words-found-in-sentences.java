class Solution {
    public int wordCount(String str){
        int count =0;
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count + 1;
    }

    public int mostWordsFound(String[] sentences) {
        int maxNum = 0;
        for(int i=0 ;i < sentences.length;i++){
            int count = wordCount(sentences[i]);
            if(count > maxNum){
                maxNum = count;
            }
        }
        return maxNum;
    }
}