package com.hussard01.conditionaldispatchercommand;

import com.hussard01.conditionaldispatchercommand.app.ActionName;
import com.hussard01.conditionaldispatchercommand.app.CatalogApp;
import com.hussard01.conditionaldispatchercommand.app.HandlerResponse;
import com.hussard01.conditionaldispatchercommand.app.WorkShopManager;
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
