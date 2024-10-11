package com.example.menu.enums;

public enum ItemType {
    Appetizer("Appetizer", 1),
    Entree("Entree", 2),
    Dessert("Dessert", 3),
    Beverage("Beverage", 4),
    Side("Side", 5);

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

    public static ItemType getValue(int i) {
        switch (i) {
            case 1: return Appetizer;
            case 2: return Entree;
            case 3: return Dessert;
            case 4: return Beverage;
            case 5: return Side;
        }
        return null;
    }

    @Override
    public String toString() {
        return sectionName + " (ID: " + sectionId + ")";
    }
}

