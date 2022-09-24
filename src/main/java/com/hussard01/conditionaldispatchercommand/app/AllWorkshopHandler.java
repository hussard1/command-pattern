package com.hussard01.conditionaldispatchercommand.app;

import java.util.Map;

import static com.hussard01.conditionaldispatchercommand.app.ActionName.ALL_WORKSHOP;

public class AllWorkshopHandler extends Handler{

    public AllWorkshopHandler(CatalogApp catalogApp) {
        super(catalogApp);
    }

    public HandlerResponse execute(Map<String, String> parameters) {
        return HandlerResponse.of(parameters);
    }
}
