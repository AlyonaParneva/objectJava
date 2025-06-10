package ru.courses.enums;

public enum Spiciness {
    VERY_HOT("очень острый"),
    HOT("острый"),
    MILD("не острый");

    private final String description;

    Spiciness(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
