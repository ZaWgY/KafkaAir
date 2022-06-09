package com.kafkajet.common.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Route {
    private String bordName;
    private List<RoutePath> path = new ArrayList<>();

    public boolean notAssigned() {
        return bordName == null;
    }

}
