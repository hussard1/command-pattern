package com.hussard01.conditionaldispatchercommand.command;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class WorkShopManager {

    private final String template = "newTemplate";
    private final String dir = "dir";
    private List<String> workshops = new ArrayList<>();
    public String getNextWorkshopID() {
        return UUID.randomUUID().toString();
    }

    public String createNewFileTemplate(String nextWorkShopID, String dir, String template) {
        return String.join("-", nextWorkShopID, dir, template);
    }

    public void addWorkshop(String newWorkshopContents) {
        workshops.add(newWorkshopContents);
    }
}
