package Week5;

import java.util.Map;

public record Week5Notes() {
    // A Hashmap is a map type that stores key-value pairs. Keys mapped to values
    // Keys are unique in a hashmap
    // They can be added, looked up, replace, deleted, and looped over (the keys or their values)

    // TODO Syntax for a Hashmap
    // TODO: HashMap<String, String> stateAbbreviations = new HashMap<>();
    // TODO: StateAbbreviations.put("Minnesota", "MN");

        // TODO Type of Key, Type of Value, Name of the Hashmap
        // Can also use Map instead of HashMap

    // Can print the whole hashmap
    // Can store the value of a key pair in a variable String example = otherexample.get();
    // If you search for a value to a key that doesn't exist you get null

    // TODO For loop syntax for a hashmap:
        // TODO: For (String month: snowfall.keySet()) {}

    // TODO If statement syntax using a hashmap
        // TODO: IF (snowfall.containsKey()) {}

    // TODO For loop syntax only looping over the values
        // TODO: For (Double snow: snowfall.values()) {}

    // Im ignoring the entrySet method because it's a more complicated version of the keySet() loop
    // Both can grab both the keys and the values

    // TODO Other useful operations on hashmaps
        // TODO: exampleHashMap.size()
            // The pairs count as singular data entries, so the size is the pairs, not the values and keys
        // TODO: Map<String, Integer> distances = Map.of("StringExample1", IntExample1, "StringExample2", IntExample2);
            // This is used to create a hashmap with the key-values arranged sequentially
            // Rather than repeating lines for each new insertion
            // Keep in mind the maximum of 10
            // TODO You CANNOT change or use .put on Maps created with Map.of()
        // TODO: updateExample()


    // TAKEAWAY: Research other data types if your data isn't fitting the types explored
    // e.g: Arrays, Lists, HashMaps
    // Also consider combining data types
        // Store arrays as values in a hashmap
        // Create a list of hashmaps
        // Hashmap of arrays
        // Hashmap of hashmaps
        // etc

}
