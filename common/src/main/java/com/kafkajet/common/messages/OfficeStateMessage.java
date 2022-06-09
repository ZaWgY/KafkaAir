package com.kafkajet.common.messages;

import com.kafkajet.common.bean.Source;
import com.kafkajet.common.bean.Type;

public class OfficeStateMessage extends Message{

    public OfficeStateMessage() {
        this.source = Source.OFFICE;
        this.type = Type.STATE;
    }
}
