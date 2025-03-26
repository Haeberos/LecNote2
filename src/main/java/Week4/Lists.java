package Week4;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Hello");
        arrayList.add("World");

        for (String str : arrayList) {
            System.out.println(str);
        }

        System.out.println(arrayList);
    }
}
