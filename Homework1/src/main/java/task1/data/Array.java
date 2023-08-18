package task1.data;

public class Array<E>{
    private E[] arr;
    private int size;

    public Array(E[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }

    public Array(int size) {
        this.size = size;
        this.arr = (E[]) new Object[size];
    }

    public int size() {
        return arr.length;
    }
    public E getVal(int index) {
        return arr[index];
    }

    public void setVal(int index, E value) {
        arr[index] = value;
    }

    public Array sliceArray (int index) {
        Array newArray = new Array(index);
        for (int i = 0; i < index; i++) {
            newArray.setVal(i, arr[i]);
        }
        return newArray;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < arr.length ; i++) {
            if (i == arr.length - 1)
                str = str + arr[i];
            else
                str = str + arr[i] + " ";
        }
        return str;
    }
}
