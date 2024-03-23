package javaRevise_coding;

public class removeDuplicateCharFromString {
    public static void main(String[] args) {
        String name="tickkt";
        StringBuffer sd=new StringBuffer();
        for(int i=0;i<name.length()-1;i++){
            if(name.indexOf(String.valueOf(name.charAt(i)))==name.lastIndexOf(String.valueOf(name.charAt(i)))){
              sd.append(name.charAt(i));
            }
        }
        System.out.println(sd);
    }
}
