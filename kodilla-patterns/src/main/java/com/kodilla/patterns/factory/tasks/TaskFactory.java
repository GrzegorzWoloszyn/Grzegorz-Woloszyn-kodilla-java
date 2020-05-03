package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public Task executeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping...","shoes", 6 );
            case PAINTING:
                return new PaintingTask("Painting...", "white", "garage");
            case DRIVING:
                return new DrivingTask("Driving to...", "Nebraska", "bike");
            default:
                return null;
        }
    }
}
