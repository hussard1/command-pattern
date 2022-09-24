package com.hussard01.conditionaldispatchercommand.command;

import java.util.Map;

public class AllWorkshopHandler extends Handler{

    public AllWorkshopHandler(CatalogApp catalogApp) {
        super(catalogApp);
    }

    public HandlerResponse execute(Map<String, String> parameters) {
        return HandlerResponse.of(parameters);
    }
}
