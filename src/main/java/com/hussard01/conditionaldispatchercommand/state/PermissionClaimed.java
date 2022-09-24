package com.hussard01.conditionaldispatchercommand.state;

public class PermissionClaimed extends PermissionState {
    @Override
    public void claimedBy(SystemAdmin admin, SystemPermission permission) {
        if(permission.getState().equals(Permission.CLAIMED)) {
            return;
        }
        permission.setPermission(Permission.DENIED);
    }
}
