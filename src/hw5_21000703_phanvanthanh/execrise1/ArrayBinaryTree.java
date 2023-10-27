package hw5_21000703_phanvanthanh.execrise1;

public class ArrayBinaryTree<E,T> implements BinaryTreeInterface<T>{
    private E[] array;
    private int n = 0;
    private int defaultsize = 100;
    public ArrayBinaryTree() {
        array = (E[]) new Object[defaultsize];
    }
    public void setRoot(E element) {
        if(n == 0) {
            array[1] = element;
            n = 1;
        } else {
            throw new IllegalStateException("Root is already set.");
        }
    }
    public void setLeft(E element, int parentIndex) {
        int leftChildIndex = 2 * parentIndex;
        if(leftChildIndex < array.length) {
            array[leftChildIndex] = element;
            n = Math.max(n, leftChildIndex);
        } else {
            throw new IllegalStateException("Array is full or index out of bounds");
        }
    }
    public void setRight(E element, int parentIndex) {
        int rightChildIndex = 2 * parentIndex + 1;
        if(rightChildIndex < array.length) {
            array[rightChildIndex] = element;
            n = Math.max(n, rightChildIndex);
        } else {
            throw new IllegalStateException("Array is full or index out of bounds");
        }
    }

    @Override
    public T root() {
        return (T) array[1];
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int numChildren(T p) {
        int index = findIndex(p);
        if (index == -1) {
            throw new IllegalArgumentException("Node not found.");
        } else {
            if (index * 2 + 1 <= n) {
                if (array[index * 2] == null && array[index * 2 + 1] == null) return 0;
                if (array[index * 2] != null && array[index * 2 + 1] == null) return 1;
                if (array[index * 2] == null && array[index * 2 + 1] != null) return 1;
                if (array[index * 2] != null && array[index * 2 + 1] != null) return 2;
            }
            return 0;
        }
    }

    @Override
    public T parent(T p) throws Exception {
        int index = findIndex(p);
        if(index == -1) {
            throw new IllegalArgumentException("Node not found.");
        } else {
            if(index > 1) {
                return (T) array[index/2];
            }
            else {
                return null;
            }
        }
    }

    @Override
    public T left(T p) {
        int index = findIndex(p);
        if(index == -1) {
            throw new IllegalArgumentException("Node not found");
        } else {
            if(index > 1) {
                if(index % 2 == 0) {
                    return null;
                } else {
                    return (T) array[index - 1];
                }
            } else {
                return null;
            }
        }
    }

    @Override
    public T right(T p) {
        int index = findIndex(p);
        if(index == -1) {
            throw new IllegalArgumentException("Node not found");
        } else {
            if(index > 1 ){
                if(index % 2 != 0) {
                    return null;
                } else {
                    return (T) array[index + 1];
                }
            } else {
                return null;
            }
        }
    }

    @Override
    public T sibling(T p) {
        int index = findIndex(p);
        if(index == -1) {
            throw new IllegalArgumentException("Node not found");
        } else {
            if(index > 1) {
                if(index % 2 != 0) {
                    return (T) array[index - 1];
                } else {
                    return (T) array[index + 1];
                }
            }
            return null;
        }
    }
    private int findIndex(T p) {
        for(int i = 1; i < n; ++i) {
          if(array[i] != null && array[i].equals(p)) {
              return i;
          }
        }
        return -1;
    }
}
