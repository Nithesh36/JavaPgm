package Playing;

public class SplitZeroToBeginin {
    public static void main(String[] args) {
        String digits = "320430444000";
        char[] arr = digits.toCharArray();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                char temp = arr[count];
                System.out.println(arr[count] +"vv ");
                arr[count] = arr[i];
                System.out.println(arr[count] +"  : ct");
                arr[i] = temp;
                System.out.println(arr[i]);
                count++;
            }
        }

        //String result = new String(arr);
       // System.out.println(result);
    }
}
