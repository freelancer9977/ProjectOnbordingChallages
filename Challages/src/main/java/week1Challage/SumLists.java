package week1Challage;

/*
* Sum Lists: You have two numbers represented by a linked list, where each node contains a single
* digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
* function that adds the two numbers and returns the sum as a linked list.
* */

import java.util.LinkedList;

public class SumLists {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list.add(6);
        list.add(0);
        list.add(1);
        list2.add(5);
        list2.add(9);
        list2.add(2);
        LinkedList<Integer> sum = Sum(list,list2);
        System.out.println(sum);
    }

    public static LinkedList<Integer> Sum(LinkedList<Integer> list1,LinkedList<Integer> list2){
        Double num1 = 0.0,num2 = 0.0;
        Integer x,y,sum;
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i< list1.size(); i++){
            num1 = num1 + (list1.get(i)*(Math.pow(10,i)));
        }
        for (int i = 0; i< list2.size(); i++) {
            num2 = num2 + (list2.get(i) * (Math.pow(10, i)));
        }
        x = (Integer) num1.intValue();
        y = (Integer) num2.intValue();
        sum = x+y;
        while (sum>0){
            list.add(sum%10);
            sum = sum/10;
        }
        return list;
    }

}
