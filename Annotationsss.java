// through annotations we pass the information about the code not only at compile time but also at run time too
//custom annotations are created through the mechanism of interface
//we also have to specify the target.....we can apply annotations every where to local variables, parameters based on the target they specified
// we use target to specify the metadata of annotation like where we can use it
//we can use as many targets as possible
//Through Rentention we can specify till where we want the information to be convied
// we can pass argument to the annotations too

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface GayathrisFriends {
    String name() default "Shalu";
}

class Friends {
    @GayathrisFriends(name = "Shalu")
    public void customMessage() {
        System.out.println("Hey! Hi Shalu");
    }

    @GayathrisFriends(name = "Renu")
    public void customMessage1() {
        System.out.println("Hey! Hi Renu");
    }

    @GayathrisFriends(name = "Yash")
    public void customMessage2() {
        System.out.println("Hey! Hi Yash");
    }
}

public class Annotationsss {

    public static void ifAuthorized(Object obj, String methodName, String FriendName)
            throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
        Method method = obj.getClass().getMethod(methodName);
        if (method.isAnnotationPresent(GayathrisFriends.class)) {
            GayathrisFriends gf = method.getAnnotation(GayathrisFriends.class);
            if (gf.name().equalsIgnoreCase(FriendName)) {
                method.invoke(obj);
            } else {
                System.out.println("Access Denied: Requires role ");
            }
        }

    }

}

class Main10 {
    public static void main(String[] args)
            throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
        Friends f = new Friends();

        Annotationsss.ifAuthorized(f, "customMessage", "Shalu");
        Annotationsss.ifAuthorized(f, "customMessage1", "Renu");
        Annotationsss.ifAuthorized(f, "customMessage2", "Yash");
    }
}
