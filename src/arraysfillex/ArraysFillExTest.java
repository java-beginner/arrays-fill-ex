package arraysfillex;

import java.util.Arrays;

public class ArraysFillExTest {

    public static void main(String[] args) {

        testBoolean();
        System.out.println();
        testChar();
        System.out.println();
        testByte();
        System.out.println();
        testShort();
        System.out.println();
        testInt();
        System.out.println();
        testLong();
        System.out.println();
        testFloat();
        System.out.println();
        testDouble();
        System.out.println();
        testString();

    }

    private static void testBoolean() {

        boolean[][][] array = {
                { {true, true, true}, {true, true} },
                { {true, true, true}, {true} }
            };

        System.out.println("初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, false);

        System.out.println("初期化後");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));
    }

    private static void testChar() {

        char[][][] array = {
                { {'a', 'b', 'c'}, {'d', 'e'} },
                { {'f', 'g', 'h'}, {'i'} }
            };

        System.out.println("初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, 'z');

        System.out.println("初期化後");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));
    }

    private static void testByte() {

        byte[][][] array = {
                { {0, 1, 2}, {3, 4} },
                { {5, 6, 7}, {8} }
            };

        System.out.println("初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, Byte.MAX_VALUE);

        System.out.println("初期化後");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));
    }

    private static void testShort() {

        short[][][] array = {
                { {1, 2, 3}, {4, 5} },
                { {6, 7, 8}, {9} }
            };

        System.out.println("初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, Short.MAX_VALUE);

        System.out.println("初期化後");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));
    }

    private static void testInt() {

        int[][][] array = {
                { {1, 2, 3}, {4, 5} },
                { {6, 7, 8}, {9} }
            };

        System.out.println("初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, Integer.MAX_VALUE);

        System.out.println("初期化後");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));
    }

    private static void testLong() {

        long[][][] array = {
                { {1, 2, 3}, {4, 5} },
                { {6, 7, 8}, {9} }
            };

        System.out.println("初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, Long.MAX_VALUE);

        System.out.println("初期化後");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));
    }

    private static void testFloat() {

        float[][][] array = {
                { {1f, 2f, 3f}, {4f, 5f} },
                { {6f, 7f, 8f}, {9f} }
            };

        System.out.println("初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, Float.MAX_VALUE);

        System.out.println("初期化後");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));
    }

    private static void testDouble() {

        double[][][] array = {
                { {1d, 2d, 3d}, {4d, 5d, 6d} },
                { {7d, 8d, 9d}, {10d, 11d, 12d} }
            };

        System.out.println("初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, 3.14);

        System.out.println("初期化後");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));
    }

    private static void testString() {

        String[][][] array = {
                { {"a", "b", "c"}, {"d", "e", "f"} },
                { {"g", "h", "i"}, {"j", "k", "l"} }
            };

        System.out.println("初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, "zzzz");

        System.out.println("初期化後");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));
    }

}
