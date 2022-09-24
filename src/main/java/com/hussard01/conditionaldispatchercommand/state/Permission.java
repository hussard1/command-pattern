package com.hussard01.conditionaldispatchercommand.state;

import lombok.Getter;

@Getter
public enum Permission {
    REQUESTED,
    CLAIMED,
    GRANTED,
    DENIED,
    UNIX_REQUESTED,
    UNIX_GRANTED,
    ;

}
