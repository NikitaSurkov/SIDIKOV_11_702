package ru.itis;

public class ArrayList {
    int a[];
    int count = 0;

    void create(int length){
        a = new int[length];
    }

    void add(int num){
        if (count + 1 > a.length){
            increaseArray();
        }
        a[count] = num;
        count++;
    }

    void delete(int index){
        a[index] = 0;
        int c = 0;
        for (int i = index; i < count; i++){
            c = a[i];
            a[i] = a[i + 1];
            a[i + 1] = c;
        }
        count--;
    }

    void insert(int index, int num){
        if (a.length-1 < count){
            increaseArray();
        }
        for (int i = count-1; i >= index; i--){
            a[i+1] = a[i];
        }
        a[index] = num;
        count++;
    }

    void show() {
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }

    void increaseArray(){
        int a2[] = new int[a.length];
        for (int i = 0; i < a.length; i++){
            a2[i] = a[i];
        }
        a = new int[a.length * 2];
        for (int i = 0; i < a2.length; i++){
            a[i] = a2[i];
        }
    }
}
