public class LettersList
{
    //code the getLetterList method that accepts a word as argument and returns a list of its letters
    /* Complete the getLettersList method that get the list of letters in the input word. */
    public static String[] getLettersList(String word){
        String[] list = new String[word.length()];
        int count = 0;
        for (int i = 0; i < word.length(); i = i + 1){
            list[count] = word.substring(count, count + 1);
            count = count + 1;
        }
        return list;
    }
}