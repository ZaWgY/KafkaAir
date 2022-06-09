package com.kafkajet.common.messages;

import com.kafkajet.common.bean.Board;
import com.kafkajet.common.bean.Source;
import com.kafkajet.common.bean.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardStateMessage extends Message{

    private Board board;

    public BoardStateMessage() {
        this.source = Source.BOARD;
        this.type = Type.STATE;
    }

    public BoardStateMessage(Board board) {
        this();
        this.board = board;
    }
}
