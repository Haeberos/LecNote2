package Week4;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {
        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        System.out.println(classNames);

        classNames.remove("Programming Logic");
        System.out.println(classNames);

        classNames.remove(0);
        System.out.println(classNames);

    }
}
