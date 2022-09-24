package com.hussard01.conditionaldispatchercommand.app;


import java.util.Map;

public abstract class Handler {
    protected CatalogApp catalogApp;

    public Handler(CatalogApp catalogApp) {
        this.catalogApp = catalogApp;
    }

    public abstract HandlerResponse execute(Map<String, String> parameters);
}
