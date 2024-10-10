package com.example.menu.enums;

public enum ItemType {
    APPETIZERS("Appetizers", 1),
    ENTREES("Entrees", 2),
    DESSERTS("Desserts", 3),
    BEVERAGES("Beverages", 4),
    SIDES("Sides", 5);

    private final String sectionName;
    private final int sectionId;

    ItemType(String sectionName, int sectionId) {
        this.sectionName = sectionName;
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public int getSectionId() {
        return sectionId;
    }

    @Override
    public String toString() {
        return sectionName + " (ID: " + sectionId + ")";
    }
}

