public class ReverseSentecnceInWord

{
//reverse  sentence without changing the position
    public static void main(String[] args) {
        String s="nithesh welcome bro";
        String ReversedWord="";
        String ReversedWor1d[]={"h"};

        for(int i=0;i<s.split(" ").length;i++){
            String []words=s.split(" ");
            for(int j= words[i].length()-1;j>=0;j--){
                ReversedWord=ReversedWord+words[i].charAt(j);
            }
            ReversedWord=ReversedWord+" ";
        }
        System.out.println(ReversedWord);
    }
}
