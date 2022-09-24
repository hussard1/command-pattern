package com.hussard01.conditionaldispatchercommand.state;

import lombok.extern.java.Log;

@Log
public class StateApplication {

  public static void main(String[] args) {
    SystemAdmin admin = new SystemAdmin();
    SystemPermission permission1 = new SystemPermission(new PermissionRequested(), admin);
    permission1.claimedBy(admin);
    assert permission1.getPermission() == Permission.REQUESTED;
    SystemPermission permission2 = new SystemPermission(new PermissionClaimed(), admin);
    permission2.claimedBy(admin);
    assert permission2.getPermission() == Permission.DENIED;
  }
}
