package tricky.basicprogram;

import java.util.*;

public class CharacterCountInStringUsingHashMapExample {


    public static void main(String[] args) {

        charactersCount("This is is");

    }

    public static void charactersCount(String input) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] inputAr = input.toCharArray();

        for (int i = 0; i < inputAr.length; i++) {
            char ch = inputAr[i];
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);


            } else {
                map.put(ch, 1);
            }

        }
        Iterator<Character> charIterator=map.keySet().iterator();
        while(charIterator.hasNext()){
            char ch=charIterator.next();
            System.out.print(ch+"="+map.get(ch)+" ");
        }
    }


    private void mappingWordsLength(List<String> wordsList) {
        Map<Integer, Set<String>> mapping = new HashMap<>();
        for (String word : wordsList) {
            mapping.computeIfAbsent(word.length(), HashSet ::new).add(word);
        }
        List<Integer> lengths = new LinkedList<>(mapping.keySet());
        Collections.sort(lengths);
        lengths.forEach(n -> System.out.println(mapping.get(n).size() + " words with " + n + " chars"));
    }
}
