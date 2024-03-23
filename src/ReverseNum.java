public class ReverseNum {


        public static void main(String[] args)
        {
            int number = 9876540, reverse = 0;
            // Avoid getting the size of the collection in the loop
            int length = String.valueOf(number).length();
            for(int i = 0; i < length; i++)
            {
                // Avoid multiple if-else statements
                boolean isLastDigit = (i == length - 1);
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = isLastDigit ? 0 : number/10;
            }
            System.out.println("The reverse of the given number is: " + reverse);
        }


}
