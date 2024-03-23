package javaRevise_coding;

public class reverseEachWordWithoutChangingPos {
    public static void main(String[] args) {
        String myName="nithesh kumar cse";
        StringBuilder reversedSentence= new StringBuilder();
        String words[]=myName.split(" ");
        for(int i=0;i<words.length;i++){
//            for(int j=words[i].length()-1;j>=0;j--)
                reversedSentence.append(new StringBuffer(words[i]).reverse());
                reversedSentence.append(" ");
        }
        System.out.println(reversedSentence);
    }

}
