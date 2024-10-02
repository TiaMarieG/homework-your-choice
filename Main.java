import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to my Java Program. Let's make a list of words! Please type in five words below:");

        List<String> wordList = new ArrayList<>();

        Scanner userInput = new Scanner(System.in);

        for(int i = 0; i <= 4; i++)
        {
            System.out.println("Type a word: ");
            String word = userInput.nextLine();
            
            wordList.add(word);

            System.out.println();
        }

        System.out.println("Thanks for making your list! Now, let's see if there are any duplicate words!");

        Map<String, Integer> dupWordsMap = new HashMap<>();

        for (String word : wordList)
        {
            if (!dupWordsMap.containsKey(word))
            {
                dupWordsMap.put(word, 1);
            }
            else
            {
                int currentCount = dupWordsMap.get(word);
                int newCount = currentCount + 1;
                dupWordsMap.put(word, newCount);
            }
        }

        System.out.println(dupWordsMap);

        int dupWords = 0;

        for (Integer dups : dupWordsMap.values())
        {
            if (dups != 1)
            {
                dupWords += 1;
            }
        }

        if (dupWords == 0)
        {
            System.out.println("There are no duplicate words!");
        }
        else
        {
            System.out.println("There are/is " + dupWords + " duplicate word(s)!");
        }

        System.out.println();

        System.out.println("Which index are you interested in pulling a word from?");

        System.out.println();

        System.out.println("Please pick an Index:");
        Integer index = userInput.nextInt();

        if (index > 4)
        {
            System.out.println("Please choose a valid index:");
            index = userInput.nextInt();
        }
        else
        {
            System.out.println("The word you chose is \"" + wordList.get(index) + "\" at " + index + "!");
        }

    }
}
