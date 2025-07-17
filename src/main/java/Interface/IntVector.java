package Interface;

public class IntVector implements IntList {
    private int[] data;
    private int size;

    public IntVector() {
        data = new int[20];
        size = 0;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void add(int number) {
        if (size == data.length) {
            int newLength = data.length * 2; // Double the size
            int[] newData = new int[newLength];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
        data[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id >= size || id < 0) {
            throw new IndexOutOfBoundsException("Index: " + id);
        }
        return data[id];
    }
}

