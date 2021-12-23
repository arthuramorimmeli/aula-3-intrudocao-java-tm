package utils;

import utils.interfaces.Precedent;

import java.util.List;

public class SortUtils {

    public static <T> void sort(List<Precedent<T>> listGeneric) {
        for (int i = 0; i < listGeneric.size(); i++) {
            for(int j = 0; j < i; j++) {
                Precedent<T> actual = listGeneric.get(j);
                Precedent<T> next = listGeneric.get(j + 1);
                if (next.precedeA((T) actual) < 0) {
                    System.out.println(1);
                    Precedent<T> changeToActualPosition = listGeneric.get(j + 1);
                    listGeneric.remove(j+1);
                    listGeneric.add(j, changeToActualPosition);
                }
            }
        }
    }
}
