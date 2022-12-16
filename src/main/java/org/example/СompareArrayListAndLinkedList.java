package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Сlass used to measure the execution time of various methods ArrayList and LinkedList and compare them
 */
public class СompareArrayListAndLinkedList {
    /**
     * The method marks the time for the execution of the add to the end in List function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @param a the List that is being investigated
     * @return time spent on performing operations
     */
    public Long timeAdd(int n , List a)
    {
        Date startMethod = new Date();
        for(int i = 0; i < n; i++)
            a.add(i);
        Date finishMethod = new Date();
        long methodTime = finishMethod.getTime() - startMethod.getTime();
        a.clear();
        return methodTime;
    }
    /**
     * The method marks the time for the execution of the add to middle in List function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @param a the List that is being investigated
     * @return time spent on performing operations
     */
    public Long timeAddToMiddle(int n,List a)
    {
        Date startMethod = new Date();
        for(int i = 0; i < n; i++)
            a.add(a.size()/2,i);
        Date finishMethod = new Date();
        long methodTime = finishMethod.getTime() - startMethod.getTime();
        a.clear();
        return methodTime;
    }
    /**
     * The method marks the time for the execution of the get from middle in List function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @param a the List that is being investigated
     * @return time spent on performing operations
     */
    public Long timeGetFromMiddle(int n,List a)
    {
        for(int i = 0; i < n; i++)
            a.add(i);
        Date startMethod = new Date();
        for(int i = 0; i < n; i++)
            a.get(a.size()/2);
        Date finishMethod = new Date();
        long methodTime = finishMethod.getTime() - startMethod.getTime();
        a.clear();
        return methodTime;
    }
    /**
     * The method marks the time for the execution of the remove from middle in List function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @param a the List that is being investigated
     * @return time spent on performing operations
     */
    public Long timeRemoveFromMiddle(int n,List a)
    {
        for(int i = 0; i < 2*n; i++)
            a.add(i);
        Date startMethod = new Date();
        for(int i = 0; i < n; i++)
            a.remove(a.size()/2);
        Date finishMethod = new Date();
        long methodTime = finishMethod.getTime() - startMethod.getTime();
        a.clear();
        return methodTime;

    }
    /**
     * The method marks the time for the execution of the remove from begin in List function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @param a the List that is being investigated
     * @return time spent on performing operations
     */
    public Long timeRemoveFromBegin(int n,List a)
    {
        for(int i = 0; i < 2*n; i++)
            a.add(i);
        Date startMethod = new Date();
        for(int i = 0; i < n; i++)
            a.remove(0);
        Date finishMethod = new Date();
        long methodTime = finishMethod.getTime() - startMethod.getTime();
        a.clear();
        return methodTime;
    }
    /**
     * The method marks the time for the execution of the remove from end in List function,
     * which is executed a certain number of times
     * @param n number of operations performed
     * @param a the List that is being investigated
     * @return time spent on performing operations
     */
    public Long timeRemoveFromEnd(int n,List a)
    {
        for(int i = 0; i < 2*n; i++)
            a.add(i);
        Date startMethod = new Date();
        for(int i = 0; i < n; i++)
            a.remove(a.size()-1);
        Date finishMethod = new Date();
        long methodTime = finishMethod.getTime() - startMethod.getTime();
        a.clear();
        return methodTime;
    }


    /**
     * The method generates a table of comparisons of ArrayList and LinkedList
     * by the execution time of various operations
     * @param n number of operations performed
     */
    public void tableOfСompare (int n)
    {
        if (n<=0)
        {
            System.out.println("Error! The number of executions <=0!");
            return;
        }
        List arrayList = new ArrayList<Integer>();
        List linkedList = new LinkedList<Integer>();
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        System.out.format("%-20s%24s%16s%16s", "Methods", "Number of executions", "ArrayList", "LinkedList\n");
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        Long timeArrayList = timeAdd(n,arrayList);
        Long timeLinkedList = timeAdd(n,linkedList);
        System.out.format("%-20s%24s%16s%16s", "Add", n, timeArrayList+" ms", timeLinkedList+" ms\n");
        timeArrayList = timeAddToMiddle(n,arrayList);
        timeLinkedList = timeAddToMiddle(n,linkedList);
        System.out.format("%-20s%24s%16s%16s", "Add to middle", n, timeArrayList+" ms", timeLinkedList+" ms\n");
        timeArrayList = timeGetFromMiddle(n,arrayList);
        timeLinkedList = timeGetFromMiddle(n,linkedList);
        System.out.format("%-20s%24s%16s%16s", "Get from middle", n, timeArrayList+" ms", timeLinkedList+" ms\n");
        timeArrayList = timeRemoveFromBegin(n,arrayList);
        timeLinkedList = timeRemoveFromBegin(n,linkedList);
        System.out.format("%-20s%24s%16s%16s", "Remove from begin", n, timeArrayList+" ms", timeLinkedList+" ms\n");
        timeArrayList = timeRemoveFromMiddle(n,arrayList);
        timeLinkedList = timeRemoveFromMiddle(n,linkedList);
        System.out.format("%-20s%24s%16s%16s", "Remove from middle", n, timeArrayList+" ms", timeLinkedList+" ms\n");
        timeArrayList = timeRemoveFromEnd(n,arrayList);
        timeLinkedList = timeRemoveFromEnd(n,linkedList);
        System.out.format("%-20s%24s%16s%16s", "Remove from end", n, timeArrayList+" ms", timeLinkedList+" ms\n");
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
    }

    /**
     * The method generates a table of comparisons of ArrayList and LinkedList
     * by the execution time of various operations
     * @param n an array in which various values of the number of operations are stored
     * @param size size of the transmitted array
     */
    public void tableOfСompare (int size, int n[])
    {
        List arrayList = new ArrayList<Integer>();
        List linkedList = new LinkedList<Integer>();
        int i = -1;
        int j = 0;
        boolean t = false;
        while (j<size && i<0 && n!= null)
        {
            if (n[j] > 0)
                i = j;
            j++;
        }
        if (i == -1)
        {
            System.out.println("Error! The array is empty or all of its values <=0!");
            return;
        }
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        System.out.format("%-20s%24s%16s%16s", "Methods", "Number of executions", "ArrayList", "LinkedList\n");
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        Long timeArrayList = timeAdd(n[i],arrayList);
        Long timeLinkedList = timeAdd(n[i],linkedList);
        System.out.format("%-20s%24s%16s%16s", "Add", n[i], timeArrayList+" ms", timeLinkedList+" ms\n");
        for (j=i+1;j<size;j++)
            if (n[j]>0)
            {
                timeArrayList = timeAdd(n[j],arrayList);
                timeLinkedList = timeAdd(n[j],linkedList);
                System.out.format("%-20s%24s%16s%16s", "", n[j], timeArrayList+" ms", timeLinkedList+" ms\n");
            }
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        timeArrayList = timeAddToMiddle(n[i],arrayList);
        timeLinkedList = timeAddToMiddle(n[i],linkedList);
        System.out.format("%-20s%24s%16s%16s", "Add to middle", n[i], timeArrayList+" ms", timeLinkedList+" ms\n");
        for (j=i+1;j<size;j++)
            if (n[j]>0)
            {
                timeArrayList = timeAddToMiddle(n[j],arrayList);
                timeLinkedList = timeAddToMiddle(n[j],linkedList);
                System.out.format("%-20s%24s%16s%16s", "", n[j], timeArrayList+" ms", timeLinkedList+" ms\n");
            }
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        timeArrayList = timeGetFromMiddle(n[i],arrayList);
        timeLinkedList = timeGetFromMiddle(n[i],linkedList);
        System.out.format("%-20s%24s%16s%16s", "Get from middle", n[i], timeArrayList+" ms", timeLinkedList+" ms\n");
        for (j=i+1;j<size;j++)
            if (n[j]>0)
            {
                timeArrayList = timeGetFromMiddle(n[j],arrayList);
                timeLinkedList = timeGetFromMiddle(n[j],linkedList);
                System.out.format("%-20s%24s%16s%16s", "", n[j], timeArrayList+" ms", timeLinkedList+" ms\n");
            }
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        timeArrayList = timeRemoveFromBegin(n[i],arrayList);
        timeLinkedList = timeRemoveFromBegin(n[i],linkedList);
        System.out.format("%-20s%24s%16s%16s", "Remove from begin", n[i], timeArrayList+" ms", timeLinkedList+" ms\n");
        for (j=i+1;j<size;j++)
            if (n[j]>0)
            {
                timeArrayList = timeRemoveFromBegin(n[j],arrayList);
                timeLinkedList = timeRemoveFromBegin(n[j],linkedList);
                System.out.format("%-20s%24s%16s%16s", "", n[j], timeArrayList+" ms", timeLinkedList+" ms\n");
            }
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        timeArrayList = timeRemoveFromMiddle(n[i],arrayList);
        timeLinkedList = timeRemoveFromMiddle(n[i],linkedList);
        System.out.format("%-20s%24s%16s%16s", "Remove from middle", n[i], timeArrayList+" ms", timeLinkedList+" ms\n");
        for (j=i+1;j<size;j++)
            if (n[j]>0)
            {
                timeArrayList = timeRemoveFromMiddle(n[j],arrayList);
                timeLinkedList = timeRemoveFromMiddle(n[j],linkedList);
                System.out.format("%-20s%24s%16s%16s", "", n[j], timeArrayList+" ms", timeLinkedList+" ms\n");
            }
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
        timeArrayList = timeRemoveFromEnd(n[i],arrayList);
        timeLinkedList = timeRemoveFromEnd(n[i],linkedList);
        System.out.format("%-20s%24s%16s%16s", "Remove from end", n[i], timeArrayList+" ms", timeLinkedList+" ms\n");
        for (j=i+1;j<size;j++)
            if (n[j]>0)
            {
                timeArrayList = timeRemoveFromEnd(n[j],arrayList);
                timeLinkedList = timeRemoveFromEnd(n[j],linkedList);
                System.out.format("%-20s%24s%16s%16s", "", n[j], timeArrayList+" ms", timeLinkedList+" ms\n");
            }
        for (int k=1;k<76;k++)
            System.out.print("=");
        System.out.println();
    }
}
