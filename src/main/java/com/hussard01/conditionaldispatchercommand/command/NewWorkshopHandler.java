package com.hussard01.conditionaldispatchercommand.command;

import java.util.Map;

import static com.hussard01.conditionaldispatchercommand.command.ActionName.ALL_WORKSHOP;

public class NewWorkshopHandler extends Handler{
    public NewWorkshopHandler(CatalogApp catalogApp) {
        super(catalogApp);
    }

    public HandlerResponse execute(Map<String, String> parameters) {
        String nextWorkShopID = workShopManager().getNextWorkshopID();
        String newWorkshopContents = workShopManager().createNewFileTemplate(nextWorkShopID, workShopManager().getDir(), workShopManager().getTemplate());
        workShopManager().addWorkshop(newWorkshopContents);
        parameters.put("id", nextWorkShopID);
        return catalogApp.executeActionAndGetResponse(ALL_WORKSHOP, parameters);
    }

    private WorkShopManager workShopManager() {
        return catalogApp.getWorkshopManager();
    }
}
