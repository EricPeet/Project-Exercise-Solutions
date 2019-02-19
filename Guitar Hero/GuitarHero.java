/* *****************************************************************************
 *  Name:
 *  NetID:
 *  Precept:
 *
 *  Partner Name:
 *  Partner NetID:
 *  Partner Precept:
 *
 *  Description:  Plays two guitar strings (concert A and concert C)
 *                when the user types the lowercase letters 'a' and 'c',
 *                respectively in the standard drawing window.
 *
 **************************************************************************** */

public class GuitarHero {

    public static void main(String[] args) {

        String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";
        char[] ch = keyboard.toCharArray();

        GuitarString guitar[];
        guitar = new GuitarString[keyboard.length()];

        for (int i = 0; i < keyboard.length(); i++) {

            double frequency = 440 * Math.pow(2, ((double) i - 24) / 12);
            guitar[i] = new GuitarString(frequency);
        }

        // the main input loop
        while (true) {

            // check if the user has typed a key, and, if so, process it
            if (StdDraw.hasNextKeyTyped()) {

                // the user types this character
                char key = StdDraw.nextKeyTyped();

                // pluck the corresponding string
                int index = keyboard.indexOf(key);
                if (index != -1) {
                    guitar[index].pluck();
                }

            }
            double hold = 0;

            for (int i = 0; i < keyboard.length(); i++) {
                double sample = guitar[i].sample();
                hold = hold + guitar[i].sample();

            }


            // compute the superposition of the samples


            StdAudio.play(hold);

            // advance the simulation of each guitar string by one step
            for (int i = 0; i < keyboard.length(); i++) {
                guitar[i].tic();
            }
        }

    }

}

