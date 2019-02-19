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


public class GuitarString {
    // YOUR INSTANCE VARIABLES HERE
    static final int SAMPLING_RATE = 44100;
    static final double ENERGY_DECAY = 0.996;
    int length;
    RingBuffer myBuffer;


    public GuitarString(double frequency) {
        // YOUR CODE HERE
        double n = SAMPLING_RATE / frequency;
        double buffLength = Math.ceil(n);
        int length = (int) buffLength;
        myBuffer = new RingBuffer(length);
        for (int i = 0; i < n; i++) {
            myBuffer.enqueue(0);


        }
    }

    // creates a guitar string whose size and initial values are given by
    // the specified array
    public GuitarString(double[] init) {
        // YOUR CODE HERE
        int buffLength = init.length;
        myBuffer = new RingBuffer(buffLength);
        for (int i = 0; i < buffLength; i++) {
            myBuffer.enqueue(init[i]);
        }


    }


    // returns the number of samples in the ring buffer
    public int length() {
        // YOUR CODE HERE
        return myBuffer.size();


    }

    // plucks the guitar string (by replacing the buffer with white noise)
    public void pluck() {
        // YOUR CODE HERE
        int bufferLength = myBuffer.size();
        for (int i = 0; i < bufferLength; i++) {
            myBuffer.dequeue();
        }
        for (int i = 0; i < bufferLength; i++) {
            myBuffer.enqueue(StdRandom.uniform(-0.5, 0.5));
        }


        //int randomnum = ThreadLocalRandom.current().nextInt(-0.5,0.5 +1)
    }


    // advances the Karplus-Strong simulation one time step
    public void tic() {
        // YOUR CODE HERE
        double first = myBuffer.dequeue();
        double second = myBuffer.peek();
        double replace = ((first + second) / 2) * ENERGY_DECAY;
        myBuffer.enqueue(replace);

    }

    // returns the current sample
    public double sample() {
        // YOUR CODE HERE
        return myBuffer.peek();

    }


    // tests and calls every constructor and instance method in this class
    public static void main(String[] args) {
        double frequency = Double.parseDouble(args[0]);
        GuitarString myString = new GuitarString(frequency);
        System.out.println(myString.length());
        myString.pluck();
        System.out.println(myString.sample());
        myString.tic();


    }

}


