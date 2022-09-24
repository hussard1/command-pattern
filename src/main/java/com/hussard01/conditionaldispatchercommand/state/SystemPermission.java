package com.hussard01.conditionaldispatchercommand.state;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SystemPermission {

  private Permission permission;
  private PermissionState state;
  private SystemAdmin admin;

  public SystemPermission(PermissionState state, SystemAdmin admin) {
    this.state = state;
    this.admin = admin;
  }

  public void claimedBy(SystemAdmin admin) {
    this.state.claimedBy(admin, this);
    willBeHandleBy(admin);
  }

  public void deniedBy(SystemAdmin admin) {
    if (this.permission.equals(Permission.CLAIMED)) {
      return;
    } else if (this.admin.equals(admin)) {
      return;
    }
    this.permission = Permission.DENIED;
  }

  private void willBeHandleBy(SystemAdmin admin) {
    this.admin = admin;
  }
}
