class EqualStrings {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character,Integer> temp1 = new HashMap<>();
        Map<Character,Integer> temp2 = new HashMap<>();
        
        for(int i=0; i<word1.length(); i++){
            char ch = word1.charAt(i);
            if(temp1.containsKey(ch)){
                temp1.put(ch, temp1.get(ch)+1);
            }else{
                temp1.put(ch,1);
            }
        }
        for(int i=0; i<word2.length(); i++){
            char ch = word2.charAt(i);
            if(temp2.containsKey(ch)){
                temp2.put(ch, temp2.get(ch)+1);
            }else{
                temp2.put(ch,1);
            }
        }

        for(char ch : temp1.keySet()){
            int count = 0;
            if(temp2.containsKey(ch)){
                count = temp2.get(ch);
            }
            if(Math.abs(temp1.get(ch)-count) > 3){
                return false;
            }
        }

        for(char ch : temp2.keySet()){
            int count = 0;
            if(temp1.containsKey(ch)){
                count = temp1.get(ch);
            }
            if(Math.abs(temp2.get(ch)-count) > 3){
                return false;
            }
        }
        return true;
    }
}
