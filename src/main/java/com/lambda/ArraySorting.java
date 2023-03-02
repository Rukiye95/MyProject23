package com.lambda;
public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
       // as.sort();

        QuickSort qs= new QuickSort();
        as.sort(qs);
        BubleSort bs = new BubleSort();
        as.sort(bs);


    }

    private void sort(Sorting sorting){
       sorting.sort();
    }
}
