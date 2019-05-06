package com.company;
import java.util.*;

public class HeapSort {
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] array,int x,int y){
        Comparable z = array[x];
        array[x] = array[y];
        array[y] = z;
    }

    public static void sink(int pos, int N,Comparable[] array) {
        int lastIndex = N;
        while ((pos <= ((lastIndex-1) / 3)) && lastIndex > 0) {
            int left = 3 * pos + 1;
            int greater = left;
            if (left < lastIndex) {
                int middle = left + 1;
                if (array[middle].compareTo(array[left]) >= 0) {
                    greater = middle;
                }
                    if (middle < lastIndex) {
                        int right = middle + 1;
                        if (array[right].compareTo(array[greater]) >= 0) {
                            greater = right;
                        }
                    } //check if children nodes are greater
            }
            if (less(array[pos],array[greater])){
            exch(array,pos,greater);
            pos = greater;
            }
            else{
                break;
            }
        }
    }

    public static void hSort(Comparable[] array)
    {
        int N = array.length - 1;
        for (int k = N/3; k >= 0; k--)
            sink(k,N,array);
        while (N > 0)
        {
            exch(array, 0, N--);
            sink(0,N,array);
        } //sort using sink function
    }
    public static void main(String args[]) {
        Comparable[] test = new Comparable[100];
        Random rand = new Random();
        for (int i = 0; i < test.length;i++){
            test[i] = rand.nextInt(1000);
        }
        for (int i=0;i<test.length;i++){
            System.out.println(test[i]);
        }
        System.out.println("Sorted array: ");
        hSort(test);
        for (int i=0;i<test.length;i++){
            System.out.println(test[i]);
        }

}
}
//324
//571
//695
//14
//494
//338
//853
//520
//912
//881
//14
//692
//880
//858
//235
//332
//220
//249
//539
//627
//551
//308
//584
//194
//701
//804
//560
//160
//455
//868
//60
//862
//435
//325
//393
//391
//899
//916
//144
//735
//624
//875
//196
//763
//435
//588
//600
//382
//919
//829
//58
//404
//799
//876
//504
//238
//248
//228
//437
//966
//858
//896
//928
//757
//808
//732
//114
//208
//649
//419
//714
//745
//475
//938
//566
//138
//268
//732
//640
//932
//500
//631
//499
//589
//122
//619
//520
//600
//529
//931
//137
//711
//774
//620
//818
//515
//785
//842
//775
//564
//Sorted array:
//14
//14
//58
//60
//114
//122
//137
//138
//144
//160
//194
//196
//208
//220
//228
//235
//238
//248
//249
//268
//308
//324
//325
//332
//338
//382
//391
//393
//404
//419
//435
//435
//437
//455
//475
//494
//499
//500
//504
//515
//520
//520
//529
//539
//551
//560
//564
//566
//571
//584
//588
//589
//600
//600
//619
//620
//624
//627
//631
//640
//649
//692
//695
//701
//711
//714
//732
//732
//735
//745
//757
//763
//774
//775
//785
//799
//804
//808
//818
//829
//842
//853
//858
//858
//862
//868
//875
//876
//880
//881
//896
//899
//912
//916
//919
//928
//931
//932
//938
//966