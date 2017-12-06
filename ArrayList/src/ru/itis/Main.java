package ru.itis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Меню:");
        System.out.println("1. Создать массив из N элементов");
        System.out.println("2. Добавить число в конец массива");
        System.out.println("3. Удалить число");
        System.out.println("4. Вставить число");
        System.out.println("5. Вывести массив");
        System.out.println("6. Выход");

        int m = 0;
        while (m != 6) {
            m = scanner.nextInt();
            if (m == 1) {
                System.out.println("Введите N");
                int n = scanner.nextInt();
                arrayList.create(n);
            }
            if (m == 2) {
                System.out.println("Введите число");
                int n = scanner.nextInt();
                arrayList.add(n);
            }
            if (m == 3) {
                System.out.println("Введите номер числа");
                int i = scanner.nextInt();
                arrayList.delete(i);
            }
            if (m == 4) {
                System.out.println("Введите число и индекс ячейки");
                int i = scanner.nextInt();
                int n = scanner.nextInt();
                arrayList.insert(i, n);
            }
            if (m == 5) {
                arrayList.show();
            }
        }
    }
}
