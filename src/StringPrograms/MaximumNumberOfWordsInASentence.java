package StringPrograms;

public class MaximumNumberOfWordsInASentence {
    // Approach 1: Use String.split(" ") to count words in each sentence
    static int mostWords1(String[] sentences){
        int maxWords=0;

        for(String s:sentences){
            int maxCount=s.split(" ").length;
            maxWords=Math.max(maxCount,maxWords);
        }
        return maxWords;
    }

    // Approach 2: Count spaces manually, words = spaces + 1
    static int mostWords2(String[] sentences){
        int maxWords=0;

        for(String s:sentences){
            int spaces=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    spaces++;
                }
            }

            int maxCount=spaces+1;
            maxWords=Math.max(maxCount,maxWords);
        }
        return maxWords;
    }
    public static void main(String[] args){
        String[] sentences={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        int maxBySplit = mostWords1(sentences);      // using split()
        int maxByCountSpaces = mostWords2(sentences); // using space counting

        System.out.println("Input sentences:");
        for (String sentence : sentences) {
            System.out.println(" - " + sentence);
        }

        System.out.println();
        System.out.println("Max words (split approach): " + maxBySplit);
        System.out.println("Max words (count spaces approach): " + maxByCountSpaces);


    }
}
