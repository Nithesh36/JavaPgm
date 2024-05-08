import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ReverseSentence {
    public static void main(String[] args) {

        String userString = "nithesh wel ccs";
        String[] words = userString.split(" ");
        String ReversedWord = "";
        int ar[] = {1, 2, 7};
        for (int j = words.length - 1; j >= 0; j--) {
            ReversedWord = ReversedWord + words[j] + " ";
            //    ReversedWord=ReversedWord+" ";
        }
        System.out.println(ReversedWord);

       // System.out.println(IntStream.of(ar).findAny().stream().count());
    }

}


