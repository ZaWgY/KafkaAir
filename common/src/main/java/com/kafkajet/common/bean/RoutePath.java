package com.kafkajet.common.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoutePath {
    private RoutePoint from;
    private RoutePoint to;
    private double progress;

    public void addProgress(double speed) {
        progress += speed;
        if(progress > 100) {
            progress = 100;
        }
    }

    public boolean done() {
        return progress == 100;
    }

    public boolean inProgress() {
        return progress < 100;
    }
}
