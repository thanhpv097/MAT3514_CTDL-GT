package hw6_21000703_phanvanthanh.execrise1;

public class Test {
    public static void main(String[] args) throws Exception {
        UnsortedArrayPriorityQueue<Integer, String> unsortedArrayPriorityQueue = new UnsortedArrayPriorityQueue<>();
        unsortedArrayPriorityQueue.insert(20, "Phan Van Thanh");
        unsortedArrayPriorityQueue.insert(30, "Tran Anh Tuan");
        unsortedArrayPriorityQueue.insert(60, "Nguyen Thi An");
        unsortedArrayPriorityQueue.insert(90, "Nguyen Xuan Dinh");
        unsortedArrayPriorityQueue.insert(28, "Nguyen Thi Thuong");
        int N = unsortedArrayPriorityQueue.size();
        for(int i = 0; i < N; i++) {
            System.out.println(unsortedArrayPriorityQueue.array[i].getValue() +
                    " có số tuổi là: " +
                    unsortedArrayPriorityQueue.array[i].getKey());
        }
        System.out.println("__________________________________________");
        UnsortedLinkedPriorityQueue<Integer, String> unsortedLinkedPriorityQueue = new UnsortedLinkedPriorityQueue<>();
        unsortedLinkedPriorityQueue.insert(20, "Phan Van Thanh");
        unsortedLinkedPriorityQueue.insert(30, "Tran Anh Tuan");
        unsortedLinkedPriorityQueue.insert(60, "Nguyen Thi An");
        unsortedLinkedPriorityQueue.insert(90, "Nguyen Xuan Dinh");
        unsortedLinkedPriorityQueue.insert(28, "Nguyen Thi Thuong");
        N = unsortedArrayPriorityQueue.size();
        for(int i = 0; i < N; i++) {
            Entry<Integer, String> entry = unsortedLinkedPriorityQueue.min();
            System.out.println(entry.getValue() +
                    " có số tuổi là: " +
                    entry.getKey());
            unsortedLinkedPriorityQueue.removeMin();
        }
        System.out.println("__________________________________________");
        SortedArrayPriorityQueue<Integer, String> sortedArrayPriorityQueue = new SortedArrayPriorityQueue<>();
        sortedArrayPriorityQueue.insert(20, "Phan Van Thanh");
        sortedArrayPriorityQueue.insert(30, "Tran Anh Tuan");
        sortedArrayPriorityQueue.insert(60, "Nguyen Thi An");
        sortedArrayPriorityQueue.insert(90, "Nguyen Xuan Dinh");
        sortedArrayPriorityQueue.insert(28, "Nguyen Thi Thuong");
        N = sortedArrayPriorityQueue.size();
        for(int i = 0; i < N; i++) {
            System.out.println(sortedArrayPriorityQueue.array[i].getValue() +
                    " có số tuổi là: " +
                    sortedArrayPriorityQueue.array[i].getKey());
        }
        System.out.println("__________________________________________");
        SortedLinkedPriorityQueue<Integer, String> sortedLinkedPriorityQueue = new SortedLinkedPriorityQueue<>();
        sortedLinkedPriorityQueue.insert(90, "Nguyen Xuan Dinh");
        sortedLinkedPriorityQueue.insert(20, "Phan Van Thanh");
        sortedLinkedPriorityQueue.insert(60, "Nguyen Thi An");
        sortedLinkedPriorityQueue.insert(30, "Tran Anh Tuan");
        sortedLinkedPriorityQueue.insert(28, "Nguyen Thi Thuong");
        N = sortedLinkedPriorityQueue.size();
        for(int i = 0; i < N; i++) {
            Entry<Integer, String> entry = sortedLinkedPriorityQueue.min();
            System.out.println(entry.getValue() +
                    " có số tuổi là: " +
                    entry.getKey());
            sortedLinkedPriorityQueue.removeMin();
        }
    }
}
