package methods.level3;

public class NumberChecker {
    //count digits in a number
    public static int countDigits(int number){
        int count = 0;
        while (number > 0){
            count++;
            number /= 10;
        }
        return count;
    }
    //store digits on array
    public static int[] getDigits(int numbers){
        int count = countDigits(numbers);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--){
            digits[i] = numbers%10;
            numbers /= 10;
        }
        return digits;
    }
    //check duck number
    public static boolean isDuckNumber(int[] digits){
        for(int d : digits){
            if(d == 0) {
                return true;
            }
        }
        return false;
    }
    //Armstrong Number
    public static boolean isArmstrong(int number, int[] digits){
        int power = digits.length;
        int sum = 0;
        for(int d : digits){
            sum += Math.pow(d, power);
        }
        return sum == number;
    }
    //check Largsest Number
    public static int[] largestTwo(int[] digits){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int d : digits){
            if(d > max){
                secondMax = max;
                max = d;
            } else if (d > secondMax  && d != max) {
                secondMax = d;
            }
        }
        return new int[]{max, secondMax};
    }
    //find smallest and second smallest
    public static int[] smallestTwo(int[] digits){
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int d :digits){
            if(d < min){
                secondMin = min;
                min = d;
            }else if(d < secondMin && d != min){
                secondMin = d;
            }
        }
        return new int[]{min, secondMin};
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = getDigits(number);
        System.out.println("Duck Numbers : " + isDuckNumber(digits));
        System.out.println("Armstrong Number : " +isArmstrong(number, digits));

        int[] largest = largestTwo(digits);
        int[] smallest = smallestTwo(digits);

        System.out.println("Largest : " + largest[0] + "Second Largest " +largest[1]);
        System.out.println("Smallest : " + smallest[0] + "Second Smallest " + smallestTwo(digits));
    }
}
