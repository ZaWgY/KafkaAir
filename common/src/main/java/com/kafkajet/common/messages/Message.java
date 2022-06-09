package com.kafkajet.common.messages;

import com.kafkajet.common.bean.Source;
import com.kafkajet.common.bean.Type;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Message {
    protected Type type;
    protected Source source;

    public String getCode() {
         return source.name() + "_" + type.name();
    }
}
