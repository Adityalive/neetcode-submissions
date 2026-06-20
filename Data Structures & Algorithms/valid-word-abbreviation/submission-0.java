class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        //apple
        //a3e
        int i=0;
        int j=0;
        while(i<word.length() && j<abbr.length()){
            char wordchar =word.charAt(i);
            char abbrchar =abbr.charAt(j);
             if(Character.isDigit(abbrchar)){
                if(abbrchar=='0'){
                    return false;
                }
                int curr=0;
                while(j<abbr.length() && Character.isDigit(abbr.charAt(j))){
                    curr=curr*10+(abbr.charAt(j)-'0');
                    j=j+1;
                }
                i=i+curr;
             } 
        else{
            if(wordchar!=abbrchar){
               return false;
            }
            i++;
            j++;
        }


        }
        return i==word.length() && j==abbr.length();
    }
}