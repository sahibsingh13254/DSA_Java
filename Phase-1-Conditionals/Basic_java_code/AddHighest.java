package Basic_java_code;

public class AddHighest {
        public static void main(String[] args) {
            int[] arr = {10, 25, 7, 40, 15};

            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > max1) {
                    max2 = max1;
                    max1 = num;
                } else if (num > max2) {
                    max2 = num;
                }
            }

            int sum = max1 + max2;
            System.out.println("Sum of two highest numbers: " + sum);
        }
    }

