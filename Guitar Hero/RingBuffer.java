/* *****************************************************************************
 *  Name: Anelyse Piani-Hohmann
 *  NetID:   apianihohmann
 *  Precept:
 *
 *  Partner Name:  Eric Peet
 *  Partner NetID:  epeet
 *  Partner Precept:
 *
 *  Description:  This is a template file for GuitarString.java. It lists the
 *                constructors and methods you need, along with descriptions
 *                of what they're supposed to do.
 *
 *                Note: it won't compile until you fill in the constructors
 *                and methods (or at least commment out the ones whose return
 *                type is non-void).
 *
 **************************************************************************** */
public class RingBuffer {
    public double[] elements;
    public int capacity = 0;
    public int first = 0;
    public int last = 0;
    public int size = 0;

    public RingBuffer(int capacity) {
        this.capacity = capacity;
        elements = new double[capacity];
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        }

        else {
            return false;
        }


    }

    boolean isFull() {
        if (size == capacity) {
            return true;
        }
        else {
            return false;
        }
    }

    double dequeue() {
        if (size <= 0)
            throw new IllegalArgumentException("Ring Buffer Empty");
        double holder = elements[first];
        elements[first] = 0;
        first++;
        if (first == capacity)
            first = 0;

        size--;
        return holder;
    }

    int size() {
        return size;
    }

    void enqueue(double x) {
        if (size >= capacity)
            throw new IllegalArgumentException("Ring Buffer Full");
        elements[last] = x;
        last++;
        if (last == capacity)
            last = 0;
        size++;
    }

    double peek() {
        if (size == 0)
            throw new IllegalArgumentException("Ring Buffer Empty");
        return elements[first];
    }

    //toy client below

    public static void main(String[] arguments) {
        int N = Integer.parseInt(arguments[0]);
        RingBuffer elements = new RingBuffer(N);
        for (int i = 1; i <= N; i++) {
            elements.enqueue(i);
        }
        double t = elements.dequeue();
        elements.enqueue(t);
        System.out.println("Size after wrap-around is " + elements.size());
        while (elements.size() >= 2) {
            double x = elements.dequeue();
            double y = elements.dequeue();
            elements.enqueue(x + y);
        }
        System.out.println(elements.peek());
    }
}

