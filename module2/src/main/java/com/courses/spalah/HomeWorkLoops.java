package com.courses.spalah;

/** ПРОВЕРОЧКА
 * Модифицируйте этот класс(файл)
 *
 * @author Ievgen Tararaka
 */
public class HomeWorkLoops {
    /**
     * Метод должен вернуть минимальное число
     * из заданного массива.
     * <p>Например:
     * вернуть число=3 при заданном массиве=[5, 4, 3, 4, 5]
     *
     * @param integers заданный массив типа int[]
     * @return минимальное число из массива
     */
    public static int min(int[] integers) {
        return 1;
    }

    /**
     * Метод должен вернуть максимальное число
     * из заданного массива.
     * <p>Например:
     * вернуть число=6.0 при заданном массиве=[5.1, 4.33, 3.0, 6.0, 5.999]
     *
     * @param doubles заданный массив типа double[]
     * @return максимальное число из массива
     */

    public static int max(double args[]) {
        double[] nums = new double[5];
        double max;
        nums[0] = 5.1;
        nums[1] = 4.33;
        nums[2] = 3.0;
        nums[3] = 6.0;
        nums[4] = 5.999;
        max = nums[0];
        for (int i = 1; i < 5; i++) {
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("Максимальный элемент массива: " + max);
        return 0;
    }



    /**
     * Метод должен вернуть среднее арифмитическое число
     * из заданного массива.
     * <p>Например:
     * вернуть число=8.0 при заданном массиве=[1, 3, 8, 10, 25, 1]
     *
     * @param shorts заданный массив типа short[]
     * @return среднее арифмитическое число из массива
     */


    public static int average(short args[]) {
        short sum = 0;
        int result;
        for (int i = 0; i < args.length; i++) sum += args[i];
        result = sum / args.length;
        System.out.println("Сумма массива = " + sum);
        System.out.println("Количество элементов массива = " + args.length);
        System.out.println("Среднее арифметическое массива = " + result);
        return result;
    }

    /**
     * Метод должен перевернуть массив.
     * <p>Например:
     * вернуть массив=[f, e, d, c, b, a] из заданного массива=[a, b, c, d, e, f]
     *
     * @param chars заданный массив типа char[]
     * @return перевернутый массив
     */
    public static char[] reverse(char[] chars) {

        char[] reverseCharArray = new char[chars.length];
        for (int i = 0, j = chars.length - 1; i < chars.length; i++, j--){
            reverseCharArray[i] = chars[j];
        }
        return reverseCharArray;
    }
}
