package enumTasks.trafficLight;

public class TrafficLightDemo {

    public static String getAction(TrafficLight signal) {
        if (signal == null) {
            return "Invalid signal";
        }

        switch (signal) {
            case RED:
                return "Stop";
            case YELLOW:
                return "Get ready";
            case GREEN:
                return "Go";
            default:
                return "Unknown signal";
        }
    }

    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + " -> " + getAction(light));
        }
    }
}


