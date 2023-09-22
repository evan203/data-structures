import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This program checks which words in a file are not present in a dictionary.
*/
public class WordAnalysis
{
    public static void main(String[] args)
        throws FileNotFoundException
    {
        String wd = "Chapter 15 Class Notes\\src\\";
        Set<String> dictionaryWords = readWords(wd+"words");
        Set<String> warAndPeace = readWords(wd+"war-and-peace.txt");
        // find words that are in the novel but not in the dictionary
        for (String word : warAndPeace)
            if (!dictionaryWords.contains(word))
                System.out.println(word);
        // find the number of unique words in the novel
        System.out.println("There are "+warAndPeace.size()+" unique words in war and peace.");
        // remove words with less than 3 letters
        Iterator<String> iterator = warAndPeace.iterator();
        while (iterator.hasNext())
            if (iterator.next().length() > 3)
                iterator.remove(); // avoids concurrent modification error by removing with iterator
        System.out.println("There are "+warAndPeace.size()+" words more than 3 letters in war and peace.");
    }


    /**
     * Reads all words from a file.
     *
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a
     * word is a sequence of upper- and lowercase letters.
    */
    public static Set<String> readWords(String filename)
        throws FileNotFoundException
    {
        // not TreeSet because order doesn't matter
        Set<String> words = new HashSet<>();
        Scanner in = new Scanner(new File(filename), "UTF-8");
        // set delimiter (what it goes to next scanner thing) to all not letters using regex 
        in.useDelimiter("[^a-zA-Z]+");
        while (in.hasNext())
        {
            // add words to set (duplicates are ignored because sets can't have duplicates)
            words.add(in.next().toLowerCase());
        }
        return words;
    }
}
