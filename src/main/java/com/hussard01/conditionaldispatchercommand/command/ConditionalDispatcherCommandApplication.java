package com.hussard01.conditionaldispatchercommand.command;

import com.hussard01.conditionaldispatchercommand.command.ActionName;
import com.hussard01.conditionaldispatchercommand.command.CatalogApp;
import com.hussard01.conditionaldispatchercommand.command.HandlerResponse;
import com.hussard01.conditionaldispatchercommand.command.WorkShopManager;
import lombok.extern.java.Log;

import java.util.HashMap;

@Log
public class ConditionalDispatcherCommandApplication {

  public static void main(String[] args) {
    final WorkShopManager workShopManager = new WorkShopManager();
    final CatalogApp catalogApp = new CatalogApp(workShopManager);
    HandlerResponse response =
        catalogApp.executeActionAndGetResponse(ActionName.NEW_WORKSHOP, new HashMap<>());
    log.info(response.toString());
  }
}
