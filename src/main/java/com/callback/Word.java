package com.callback;


import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Package com.callback
 * @anthor：wyang
 * @date：2021/1/20
 */
public class Word {

    private List<String> wordList = loadList();

    private List<String> loadList() {

        List<String> wordList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            wordList.add(String.valueOf(i));
        }
        return wordList;

    }
}
