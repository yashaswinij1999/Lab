import java.util.Scanner;

public class SimpleQ11 {

    static boolean isElementsDistinct = true;

    public static boolean uniqueValues(float[] values) {

        // loop over the elements by taking j as initial index and k as next index

        for (int j = 0; j < values.length; j++) {

            for (int k = j + 1; k < values.length; k++) {

                // if values in index j and index k are same we change default value to be
                // false;

                if (k != j && values[k] == values[j])
                    isElementsDistinct = false;

            }
        }

        return isElementsDistinct;

    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter size of array:  ");
        int size = input.nextInt();

        float[] floatArray = new float[size];
        System.out.println("enter " + size + " float values: ");
        
        for (int i = 0; i < floatArray.length; i++) {

            floatArray[i] = input.nextFloat();
        }

        // float[] values = new float[] { 2.5f, 7f, 32.8f, 89f, 0.09f, 3f, 6.3f };

        System.out.println("Are the elements distinct? " + uniqueValues(floatArray));

        input.close();

    }
}