package arraysfillex;

import java.util.Arrays;

public class ArraysFillExTest {

    public static void main(String[] args) {

        // 配列定義で初期化後にfill
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
        System.out.println();

        // 配列定義のみでfill
        testIntegerInit();
        System.out.println();
        testStringInit();
        System.out.println();

        // 他のクラス
        System.out.println("他のクラス");
        testHint();
        System.out.println();

        // 配列以外を渡す
        System.out.println("配列以外を渡す");
        try {
            ArraysFillEx.fill(1, 2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // クラスが異なる
        System.out.println("クラスが異なる");
        try {
            ArraysFillEx.fill(new String[3], new Hint(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void testBoolean() {

        boolean[][][] array = {
                { {true, true, true}, {true, true} },
                { {true, true, true}, {true} }
            };

        System.out.println("boolean初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, false);

        System.out.println("boolean初期化後");
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

        System.out.println("char初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, 'z');

        System.out.println("char初期化後");
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

        System.out.println("byte初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, Byte.MAX_VALUE);

        System.out.println("byte初期化後");
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

        System.out.println("short初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, Short.MAX_VALUE);

        System.out.println("short初期化後");
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

        System.out.println("int初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, Integer.MAX_VALUE);

        System.out.println("int初期化後");
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

        System.out.println("long初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, Long.MAX_VALUE);

        System.out.println("long初期化後");
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

        System.out.println("float初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, Float.MAX_VALUE);

        System.out.println("float初期化後");
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

        System.out.println("double初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, 3.14);

        System.out.println("double初期化後");
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

        System.out.println("String初期化前");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));

        ArraysFillEx.fill(array, "zzzz");

        System.out.println("String初期化後");
        System.out.println(Arrays.toString(array[0][0]));
        System.out.println(Arrays.toString(array[0][1]));
        System.out.println(Arrays.toString(array[1][0]));
        System.out.println(Arrays.toString(array[1][1]));
    }

    private static void testIntegerInit() {

        int[][][] array = new int[3][2][4];

        System.out.println("int初期化前");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d, %d, %s", i, j, Arrays.toString(array[i][j]));
                System.out.println();
            }
        }

        ArraysFillEx.fill(array, -1);

        System.out.println("int初期化後");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d, %d, %s", i, j, Arrays.toString(array[i][j]));
                System.out.println();
            }
        }

    }

    private static void testStringInit() {

        String[][][] array = new String[3][2][4];

        System.out.println("String初期化前");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d, %d, %s", i, j, Arrays.toString(array[i][j]));
                System.out.println();
            }
        }

        ArraysFillEx.fill(array, "Dummy");

        System.out.println("String初期化後");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d, %d, %s", i, j, Arrays.toString(array[i][j]));
                System.out.println();
            }
        }

    }

    private static void testHint() {
        Hint[][][] array = new Hint[2][3][4];

        System.out.println("Hint初期化前");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d, %d, %s", i, j, Arrays.toString(array[i][j]));
                System.out.println();
            }
        }

        ArraysFillEx.fill(array, new Hint(3));

        System.out.println("Hint初期化後");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d, %d, %s", i, j, Arrays.toString(array[i][j]));
                System.out.println();
            }
        }
    }

}
