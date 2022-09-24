package com.hussard01.conditionaldispatchercommand.command;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

@Getter
@ToString
@AllArgsConstructor
public class HandlerResponse {
    private Map<String, String> map;
    public static HandlerResponse of(Map<String, String> parameters) {
        return new HandlerResponse(parameters);
    }
}
