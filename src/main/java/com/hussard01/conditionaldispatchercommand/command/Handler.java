package com.hussard01.conditionaldispatchercommand.command;


import java.util.Map;

public abstract class Handler {
    protected CatalogApp catalogApp;

    public Handler(CatalogApp catalogApp) {
        this.catalogApp = catalogApp;
    }

    public abstract HandlerResponse execute(Map<String, String> parameters);
}
