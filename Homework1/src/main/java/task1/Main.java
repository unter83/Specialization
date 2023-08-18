package task1;

import task1.data.Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа принимает массив из строк и формирует на основе него новый массив строк, состоящий не более чем 3 символа длинной \n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строчные значения массива, разделяя их пробелом: ");
        String str = sc.nextLine();
        Array array = new Array(str.split(" "));
        Array new_array = new Array(array.size());
        int k = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.getVal(i).toString().length() < 4) {
                new_array.setVal(i, array.getVal(i));
                k++;
            }
        }
        Array resultArray = new_array.sliceArray(k);

        System.out.println("Результат: " + resultArray.toString());
        sc.close();
    }
}