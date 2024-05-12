package annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainClass {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat("Sarah");

        if (cat.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This thing is very important");
        } else {
            System.out.println("This thing is not important");
        }

        for (Method method : cat.getClass().getDeclaredMethods()) {
            if(method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for(int i=0;i<annotation.times();i++)
                    method.invoke(cat);
            }
        }

        for(Field field : cat.getClass().getDeclaredFields()) {
            if(field.isAnnotationPresent(ImportantString.class)) {
                Object o = field.get(cat);
                if(o instanceof String) {
                    String value = (String) o;
                    System.out.println(value.toUpperCase());
                }
            }
        }
    }
}
