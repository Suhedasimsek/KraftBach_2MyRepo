package day_51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class soru2 {
    public static void main(String[] args) {
        Integer arr2[] = {1, 2, 3, 4, 5};
        List<Integer> list=new ArrayList<>(Arrays.asList(arr2));
        System.out.println(soru2(list, 5));

    }

    //içerisine bir list ve data kabul eden ve bu datayı tüm listeden silen
    // sonucunda bir Integer list döndüren metodu yazınız?
    // clearAllList(List<Integer>, Integer data)

    public static List<Integer> soru2(List<Integer> list, Integer data) {
        Iterator<Integer> myIter = list.iterator();
        while (myIter.hasNext()){
            if(myIter.next().equals(data)){
                myIter.remove(); }
        }return list;
    }

}
