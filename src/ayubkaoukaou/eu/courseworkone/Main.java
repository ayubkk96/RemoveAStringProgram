package ayubkaoukaou.eu.courseworkone;

public class Main {

    public static void main(String[] args) {

        removeString("Remove a character from this sentence", 'e');



    }

    public static void removeString(String input, char characterNotWanted) {

        char[] characterArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <characterArray.length; i++) {
            if (!(characterArray[i] == characterNotWanted)) {
                 sb.append(characterArray[i]);
            }
        }
        System.out.println(sb.toString());

    }
}
