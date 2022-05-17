package week1Challage;

/*
* Sum Lists: You have two numbers represented by a linked list, where each node contains a single
* digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
* function that adds the two numbers and returns the sum as a linked list.
* */

import java.util.LinkedList;

public class SumLists {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list1.add(7);
        list1.add(1);
        list1.add(6);
        list2.add(5);
        list2.add(9);
        list2.add(2);
        LinkedList<Integer> sum1 = new LinkedList<Integer>();
        sum1 = sum(list1,list2);
        System.out.println(sum1);

        list1 = new LinkedList<Integer>();
        list2 = new LinkedList<Integer>();
        list1.add(6);
        list1.add(1);
        list1.add(7);
        list2.add(2);
        list2.add(9);
        list2.add(5);
        LinkedList<Integer> sum2 = new LinkedList<Integer>();
        sum2 = sumReverse(list1,list2);
        System.out.println(sum2);


    }

    public static LinkedList<Integer> sum(LinkedList<Integer> list1,LinkedList<Integer> list2){
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

    public  static LinkedList<Integer> sumReverse(LinkedList<Integer> list1,LinkedList<Integer> list2){
        LinkedList<Integer> list = new LinkedList<Integer>();
        String num1="",num2="",sumS="";
        Integer x,y,sum;
        for (int i = 0; i<list1.size() ; i++){
            num1 = num1 + list1.get(i).toString();
        }
        for (int i = 0; i<list2.size() ; i++) {
            num2 = num2 + list2.get(i).toString();
        }
        x = Integer.parseInt(num1);
        y = Integer.parseInt(num2);
        sum = (x+y);
        sumS = sum.toString();
        for (int i = 0; i<sumS.length();i++){
            list.add(Integer.parseInt(String.valueOf(sumS.charAt(i))));
        }

        return list;
    }

}
