public class WordScrambler {
    private String[] scrambledWords;

    public WordScrambler(String [] wordArr){
        scrambledWords = mixedWords(wordArr);
    }

    public String [] getScrambledWords(){
        return scrambledWords;
    }

    private String recombine(String word1, String word2){
        if(word1.contains(" ") || word2.contains(" "))
            throw new IllegalArgumentException("Word Array must contain single words only! Attack on Titan contains more than one word!");
        String str1 = word1.substring(0, word1.length()/2);
        String str2 = word2.substring(word2.length()/2);
        String combine = (str1 + str2);
        return combine;
    }

    private String[] mixedWords(String [] words){
        int i = 0;
        String [] mix= new String[words.length];
        if(words.length%2 == 1)
            throw new IllegalArgumentException("Word Array must contain an even number of elements!");
        while(i< words.length-1){

            String x = recombine(words[i], words[i+1]);
            String y = recombine(words[i+1], words[i]);
            mix[i] = x;
            mix[i+1] = y;
            i = i+2;
        }
        return mix;
    }

}
