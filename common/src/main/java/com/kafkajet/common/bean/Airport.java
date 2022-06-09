package com.kafkajet.common.bean;


import lombok.Data;

import java.util.List;

@Data
public class Airport {
    private String name;
    private List<String> boards;
    private int x;
    private int y;


    private void addBoard(String boardName) {
        int ind = boards.indexOf(boardName);
        if(ind >= 0) {
            boards.set(ind,boardName);
        } else {
            boards.add(boardName);
        }
    }

    private void removeBoard(String boardName) {
        boards.remove(boardName);
    }
}
