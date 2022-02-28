package acadamy.learnprogramming;

public class LoveLetter
{
    public int letterRotation(String input, int number) {

        int count = 0;
        String arr[] = input.split(" ");
        if (input != null && !input.isEmpty()) {
            for (int i = 0; i < arr.length; i++) {
                String s1 = arr[i] + arr[i];

                int start = arr[i].length() - number;

                String s2 = s1.substring(start, start + arr[i].length());

                if (s2.equalsIgnoreCase(arr[i])) {
                    count++;
                }
            }
        }
        return count;
    }
}
