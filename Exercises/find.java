public class find {
    public static int find(int needle, int[] haystack) {
        int n = haystack.length;
        for (int i = 0; i < n; i++) {
            // check if this element of haystack equals needle
            if (haystack[i] == needle)
                // quit immediately with this index
                return i;
        }
        // if we get this far, the needle was not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 6 };
        System.out.println("index of 1 in arr: " + find(1, arr)); // should be 0
        System.out.println("index of 2 in arr: " + find(2, arr)); // should be 1
        System.out.println("index of 6 in arr: " + find(6, arr)); // should be 2
        System.out.println("index of 4 in arr: " + find(4, arr)); // should be -1
    }
}
