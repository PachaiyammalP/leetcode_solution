class Solution {
    public String capitalizeTitle(String title) {
      
        String[] words = title.toLowerCase().split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            if (word.length() <= 2) {
                ans.append(word);
            } else {
                ans.append(Character.toUpperCase(word.charAt(0)))
                   .append(word.substring(1));
            }
            ans.append(" ");
        }

        return ans.toString().trim();
    }
}
    
