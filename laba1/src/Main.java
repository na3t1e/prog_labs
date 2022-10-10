public class Main {

    public static void main(String[] args) {
        long[] a = createLongArray();
        double[] x = createDoubleArray();
        double[][] b = createArray(a, x);
        printArray(b);
    }

    private static long[] createLongArray() {
        int elementFrom = 3;
        int elementTo = 15;
        int j = 0;
        for (int i = elementFrom; i <= elementTo; i++) {
            if (i % 2 != 0) {
                j++;
            }
        }
        long[] newArray = new long[j];
        j--;
        for (int i = elementFrom; i <= elementTo; i++) {
            if (i % 2 != 0) {
                newArray[j] = i;
                j--;
            }
        }
        return newArray;
    }

    private static double[] createDoubleArray() {
        int length = 13;
        double max = 8.0;
        double min = -9.0;
        double[] newArray = new double[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = (Math.random() * ((max - min) + 1)) + min;
        }
        return newArray;
    }

    private static double[][] createArray(long[] a, double[] x) {
        int lengthFist = 7;
        int lengthSecond = 13;
        double[][] newArray = new double[lengthFist][lengthSecond];
        for (int i = 0; i < lengthFist; i++) {
            for (int j = 0; j < lengthSecond; j++) {
                double division = (x[j] - 0.5) / 17;
                if (a[i] == 15) {
                    newArray[i][j] = Math.asin(Math.pow((0.2 * division), 2));
                } else if (a[i] == 3 || a[i] == 5 || a[i] == 7) {
                    newArray[i][j] = Math.pow(1 - Math.sin(Math.asin(division)), 2);
                } else {
                    newArray[i][j] = Math.pow(Math.E, Math.asin(Math.sin(Math.pow(Math.pow(x[j], 2), Math.atan(division)))));
                }
            }
        }
        return newArray;
    }

    private static void printArray(double[][] array) {
        System.out.println("Массив а[7][13]");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.printf("%.2f ", array[i][j]);
            }
            System.out.println();
        }
    }
}