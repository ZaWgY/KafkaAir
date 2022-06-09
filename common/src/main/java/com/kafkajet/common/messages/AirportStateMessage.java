package com.kafkajet.common.messages;

import com.kafkajet.common.bean.Airport;
import com.kafkajet.common.bean.Source;
import com.kafkajet.common.bean.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirportStateMessage extends Message{

    private Airport airport;

    public AirportStateMessage() {
        this.source = Source.AIRPORT;
        this.type = Type.STATE;
    }

    public AirportStateMessage(Airport airport) {
        this();
        this.airport = airport;
    }
}
