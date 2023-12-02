package hw6_21000703_phanvanthanh.execrise6;

import hw6_21000703_phanvanthanh.execrise1.SortedArrayPriorityQueue;
import hw6_21000703_phanvanthanh.execrise2.MinHeapPriorityQueue;

public class App {
    public static void main(String[] args) {
        MinHeapPriorityQueue<Double, String> minHeapPriorityQueue = new MinHeapPriorityQueue<>();
        StockTradingSystem stockTradingSystem = new StockTradingSystem();
        try {
            stockTradingSystem.addOrder(minHeapPriorityQueue, 100.5, "Buy Order 1");
            stockTradingSystem.addOrder(minHeapPriorityQueue, 99.8, "Sell Order 1");
            stockTradingSystem.addOrder(minHeapPriorityQueue, 101.2, "Buy Order 2");
            stockTradingSystem.addOrder(minHeapPriorityQueue, 98.5, "Sell Order 2");
            stockTradingSystem.addOrder(minHeapPriorityQueue, 102.0, "Buy Order 3");

            stockTradingSystem.processOrder(minHeapPriorityQueue);
            stockTradingSystem.processOrder(minHeapPriorityQueue);
            stockTradingSystem.processOrder(minHeapPriorityQueue);
            stockTradingSystem.processOrder(minHeapPriorityQueue);
            stockTradingSystem.processOrder(minHeapPriorityQueue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
