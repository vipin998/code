package tricky;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Mock {

    /* *  You can swap two values a and b without using any other variables as follows:
a = a + b;
b = a - b;
a = a - b;
    * */



/*
* What are static initializers and when would you use them?
* opportunity to run code during the initial loading of a class
* They are useful for performing initialization of complex static objects or to register a type with a static registry, as JDBC drivers do.
Suppose you want to create a static, immutable Map containing some feature flags. Java doesn’t have a good one-liner for initializing maps, so you can use static initializers instead:
 */


    public static Map<String, Boolean> FEATURE_FLAGS = null;

    static {
        Map<String, Boolean> flags = new HashMap<>();
        flags.put("frustrate-users", false);
        flags.put("reticulate-splines", true);

        FEATURE_FLAGS = Collections.unmodifiableMap(flags);
    }



}
