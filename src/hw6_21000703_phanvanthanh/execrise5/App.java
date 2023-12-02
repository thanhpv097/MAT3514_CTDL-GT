package hw6_21000703_phanvanthanh.execrise5;

import hw6_21000703_phanvanthanh.execrise1.SortedArrayPriorityQueue;

public class App {
    public static void main(String[] args) {
        SortedArrayPriorityQueue<Integer, String> eventQueue = new SortedArrayPriorityQueue<>();
        AirportSimulation simulation = new AirportSimulation();
        try {
            simulation.addTakeoffEvent(eventQueue, 10, "Takeoff Event 1");
            simulation.addLandingEvent(eventQueue, 15, "Landing Event 1");
            simulation.addTakeoffEvent(eventQueue, 12, "Takeoff Event 2");
            simulation.addLandingEvent(eventQueue, 18, "Landing Event 2");
            simulation.addTakeoffEvent(eventQueue, 20, "Takeoff Event 3");

            simulation.processNextEvent(eventQueue);
            simulation.processNextEvent(eventQueue);
            simulation.processNextEvent(eventQueue);
            simulation.processNextEvent(eventQueue);
            simulation.processNextEvent(eventQueue);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
