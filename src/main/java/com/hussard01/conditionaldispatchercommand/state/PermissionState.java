package com.hussard01.conditionaldispatchercommand.state;

import lombok.Getter;

@Getter
public abstract class PermissionState {
    public abstract void claimedBy(SystemAdmin admin, SystemPermission permission);
}
