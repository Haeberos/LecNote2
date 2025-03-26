package Week4;

public @interface Week4Notes {
    // Reminder: Arrays are defined according to the data type using String[] or Int[] etc
    // Example: String [] name = new String[4] gives four string places
    // But you cant resize, search or rearrange items in an array
    // This is where lists come in

    // List: Ordered collection of items that can be searched, has an index size based on items,
    // -and can be reorganized as needed

    // 3 Kinds of Array Lists:
        // ArrayList : uses an array list to store data. with a set size and null values when not in use
        // LinkedList : a chain of nodes, linking on to another. The first an last values are easy to access,
            // but a middle value cant be accessed without running through the entire thing.
        // Vector : Is a slower ArrayList, but can have multiple input threads happening at the same time

    // Array list is generally the fastest choice unless you need to change lots of data from the start/middle.
    // In that case, used LinkedList

    // TODO Syntax for a list:
        // TODO List<String> cities = new ArrayList<>()
        // TODO <> is for generic data type (BAD PRACTICE)
        // TODO Specify Boolean, String, Int, or Double

        // Example:
            // List<Integer> numbers = new ArrayList<>();
            // numbers.add(100);     - this will add an int value 100, 'boxed' into index position 0
            // int first = numbers.get(0);     - this will return whatever integer is at position 0, in this case, 100.

    // TODO numbers.remove can remove a specified number, but you have to use this syntax:
        // TODO: numbers.remove( Integer.valueOf(1000) );

    // TODO The boolean data type can be leveraged here to check if something was removed
        // TODO: boolean wasRemoved = classNames.remove("Programming Logic");
        // This will return true if the list contains that string or element

    // TODO You can also use classNames.contains to find the string you're looking for

    // Use classNames.clear to empty the list
    // Use classNames.set(0, ""); to change an element at position 0

    // If you're trying to modify a list, try not to do it in a for loop, java gets mad
    // You can use a while loop for removing items
    // Syntax for find position in the array and each item attached:
        // TODO: For (int i = 0 ; i < classNames.size() ; i++)
        // TODO: System.out.println(classNames.get(i));

    // Syntax for using the while loop
        // TODO: While (!classNames.isEmpty()) {
        // TODO: String name = classNames.remove(0);
        // TODO: sout(name)

    // You can utilize user input to check these Lists (see ToDoList Project)

    // And you can use:
        // TODO: IF (containsIgnoreCase(""))
}
