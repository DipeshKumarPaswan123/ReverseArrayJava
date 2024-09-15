package com.anonymous.p1;

import java.util.Arrays;

/**
 * Description of the class or purpose.
 * Reversing an given array
 *
 * @author ASUS
 * @date 9/15/2024
 */
public class ArrayReverse {
    public static void arrayReverse(int numbers[]){
        int first = 0; int last = numbers.length-1;
        while(first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,9,10};
        arrayReverse(numbers);
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}