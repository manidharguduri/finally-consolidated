package org.m.g.sort;

public class InsertionSort {

    public void sort(int[] array)
    {
        int length = array.length;

        if(length<=1)
            return;

        for(int index = 1;index<array.length;index++)
        {
            int counter = 0;
            while(counter<index)
            {
                if(array[counter]>array[index])
                {
                    int temp = array[counter];
                    array[counter]=array[index];
                    array[index]=temp;
                }
                else
                {
                    counter++;
                }
            }
        }

    }

}
