class Solution {
    public String[] findOcurrences(String text, String first, String second) {
       ArrayList<String> occurences = new ArrayList();
        
        String[] words = text.split(" ");
        
        for(int i = 0; i < words.length-2; i++) {            
            if(words[i].equals(first) && words[i+1].equals(second)) {
                occurences.add(words[i+2]);
            }
        }
        
        return occurences.parallelStream().toArray(String[]::new);
    }
}