class Solution {
    public String reverseWords(String s) {
        String []arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            String k=arr[i];
            char[] word = k.toCharArray();
            int l=0;
            int r=word.length-1;
            while(l<r){
                char temp=word[l];
                word[l]=word[r];
                word[r]=temp;
                l++;
                r--;
            }
            arr[i] = new String(word);
        }
        return String.join(" ", arr);
    }
}