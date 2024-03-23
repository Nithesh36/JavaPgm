package javaRevise_coding;

public class TransformFirstLetterToCaps {

    public static void main(String[] args) {
        int conversionNumber = 32;
        String name = "nithesh kumar eswar";

        String[] SplitedString = name.split(" ");
        StringBuffer captilized = new StringBuffer();

        for (int i = 0; i < SplitedString.length; i++) {
            for (int j = 0; j < SplitedString[i].length(); j++) {
                if (j == 0) {
                    char cap = ((char) (SplitedString[i].charAt(0) - 32));

                    captilized.append(cap);
                } else
                    captilized.append(SplitedString[i].charAt(j));
            }
            captilized.append(" ");
        }
        System.out.println(captilized.toString());
    }
}



