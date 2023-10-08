package hw3_21000703_phanvanthanh.execrise4;

import hw3_21000703_phanvanthanh.execrise3.SimpleLinkedList;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập văn bản:");
        String text = scanner.nextLine();
        scanner.close();
        StringTokenizer tokenizer = new StringTokenizer(text, " \t\n\r\f.,;?!()[]{}\"'");
        SimpleLinkedList<WordCount> wordCounts = new SimpleLinkedList<>();
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            WordCount wordCount = new WordCount(word, 1);
            int index = wordCounts.indexOf(wordCount);

            if (index == -1) {
                wordCounts.add(wordCount);
            } else {
                WordCount existingWordCount = wordCounts.get(index);
                existingWordCount.incrementCount();
            }
        }
        System.out.println("Số lần xuất hiện của từng từ:");
        for (WordCount wordCount : wordCounts) {
            System.out.println(wordCount.getWord() + ": " + wordCount.getCount());
        }
    }
}

class WordCount {
    private String word;
    private int count;

    public WordCount(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        count++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordCount wordCount = (WordCount) o;
        return word.equals(wordCount.word);
    }
}