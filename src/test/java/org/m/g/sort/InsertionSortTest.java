package org.m.g.sort;

import org.junit.Assert;
import org.junit.Test;
import org.m.g.utils.ArrayUtils;

import java.util.Arrays;

public class InsertionSortTest {

    InsertionSort insertionSort  = new InsertionSort();

    @Test
    public void testingArrayLength5()
    {
        int[] array = ArrayUtils.getIntArrayLen5();
        int[] inputArr = ArrayUtils.getIntArrayLen5();
        Arrays.sort(inputArr);
        insertionSort.sort(array);
        Assert.assertEquals(array.length,inputArr.length);
        for(int index = 0;index<array.length;index++)
        {
            Assert.assertEquals(array[index],inputArr[index]);
        }
    }

    @Test
    public void testingArrayLength10()
    {
        int[] array = ArrayUtils.getIntArrayLen10();
        int[] inputArr = ArrayUtils.getIntArrayLen10();
        Arrays.sort(inputArr);
        insertionSort.sort(array);
        Assert.assertEquals(array.length,inputArr.length);
        for(int index = 0;index<array.length;index++)
        {
            Assert.assertEquals(array[index],inputArr[index]);
        }
    }
}
