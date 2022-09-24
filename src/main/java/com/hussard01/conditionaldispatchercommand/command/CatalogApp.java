package com.hussard01.conditionaldispatchercommand.command;

import java.util.HashMap;
import java.util.Map;

import static com.hussard01.conditionaldispatchercommand.command.ActionName.ALL_WORKSHOP;
import static com.hussard01.conditionaldispatchercommand.command.ActionName.NEW_WORKSHOP;

public class CatalogApp {
    private final WorkShopManager workshopManager;

    private Map<ActionName, Handler> handlers;

    public CatalogApp(WorkShopManager workshopManager) {
        this.workshopManager = workshopManager;
        this.createHandler();
    }
    public HandlerResponse executeActionAndGetResponse(ActionName actionName , Map<String, String> parameters) {
        return lookUpBy(actionName).execute(parameters);
    }

    public void createHandler() {
        handlers = new HashMap<>();
        handlers.put(NEW_WORKSHOP, new NewWorkshopHandler(this));
        handlers.put(ALL_WORKSHOP, new AllWorkshopHandler(this));
    }

    public Handler lookUpBy(ActionName actionName) {
        return handlers.get(actionName);
    }

    public WorkShopManager getWorkshopManager() {
        return workshopManager;
    }
}
