public class Q54_largestRectangularArea {
    public static void main(String[] args){

        int[] histogram = new int[]{2, 1, 4, 5, 1, 3, 3};
        int output = largestRectangularArea(histogram);
        System.out.println(output); // --> 8

        System.out.println("--------------------------");

        histogram = new int[]{6, 2, 5, 4, 5, 1, 6};
        output = largestRectangularArea(histogram);
        System.out.println(output); // --> 12

    }

    public static int largestRectangularArea(int[] histogram) {

        int maxVal = 0;
        for(int i = 0; i < histogram.length; i++){
            int minHeight = histogram[i];
            int length = 0;
            for(int j = i; j >= 0; j--){
                length++;
                minHeight = Math.min(minHeight, histogram[j]);
//                System.out.println(minHeight + " \\ " + length);
                maxVal = Math.max(minHeight*length, maxVal);
            }
//            System.out.println("!!!!");
        }

        return maxVal;
    }
}
