package javaRevise_coding;

import java.util.*;

public class ShortestCompleteWordV2 {
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String words[] = {"Man", "pstsb", "steps", "aa", "sh", "ptWQsy", "pstws"};
        licensePlate = licensePlate.toLowerCase();
        ArrayList<String> licenseChar = new ArrayList<>();
        Map<String,Integer > shortWord = new HashMap<>();
        boolean flag = false;
        for (int i = 0; i < licensePlate.length(); i++) {
            if (licensePlate.charAt(i) >= 'a' && licensePlate.charAt(i) <= 'z')
                licenseChar.add(String.valueOf(licensePlate.charAt(i)));
        }

        for (int i = 0; i <words.length ; i++) {

            for(int j=0;j<words[i].length();j++){

            }
        }

            }

}
