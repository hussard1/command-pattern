package com.hussard01.conditionaldispatchercommand.state;

public class PermissionRequested extends PermissionState {
    public void claimedBy(SystemAdmin admin, SystemPermission permission) {
        if(permission.getState().equals(Permission.REQUESTED)) {
            return;
        }
        permission.setPermission(Permission.CLAIMED);
    }
}
