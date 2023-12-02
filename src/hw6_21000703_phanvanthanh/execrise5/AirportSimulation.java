package hw6_21000703_phanvanthanh.execrise5;

import hw6_21000703_phanvanthanh.execrise1.Entry;
import hw6_21000703_phanvanthanh.execrise1.SortedArrayPriorityQueue;

public class AirportSimulation {
    public void addTakeoffEvent(SortedArrayPriorityQueue<Integer, String> eventQueue, int time, String description) throws Exception {
        eventQueue.insert(time, "Takeoff: " + description + " at time " + time);
    }
    public void addLandingEvent(SortedArrayPriorityQueue<Integer, String> eventQueue, int time, String description) throws Exception {
        eventQueue.insert(time, "Landing: " + description + " at time " + time);
    }
    public void processNextEvent(SortedArrayPriorityQueue<Integer, String> eventQueue) throws Exception {
        if(eventQueue.empty()) {
            throw new Exception("No more events in the queue");
        } else {
            Entry<Integer, String> nextEvent = eventQueue.removeMin();
            System.out.println("Processing Event: " + nextEvent.getValue());
        }
    }
}
