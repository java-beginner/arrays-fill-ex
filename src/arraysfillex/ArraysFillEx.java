package arraysfillex;

import java.util.Arrays;

public class ArraysFillEx {

    public static void fill(Object object, Object value) {
        String typeName = object.getClass().getTypeName();
        if (typeName.contains("[][]")) {
            for (Object array : (Object[])object) {
                fill(array, value);
            }
        } else {
            if (typeName.contains("boolean")) {
                Arrays.fill((boolean[])object, (boolean)value);
            } else if (typeName.contains("char")) {
                Arrays.fill((char[])object, (char)value);
            } else if (typeName.contains("byte")) {
                Arrays.fill((byte[])object, (byte)value);
            } else if (typeName.contains("short")) {
                Arrays.fill((short[])object, (short)value);
            } else if (typeName.contains("int")) {
                Arrays.fill((int[])object, (int)value);
            } else if (typeName.contains("long")) {
                Arrays.fill((long[])object, (long)value);
            } else if (typeName.contains("float")) {
                Arrays.fill((float[])object, (float)value);
            } else if (typeName.contains("double")) {
                Arrays.fill((double[])object, (double)value);
            } else {
                Arrays.fill((Object[])object, value);
            }
        }
    }

}
