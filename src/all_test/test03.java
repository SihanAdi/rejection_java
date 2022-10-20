package all_test;

import java.awt.*;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test03 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("all_test.person");
//        System.out.printf(String.valueOf(c1.newInstance()));
//        Constructor constructor = c1.getDeclaredConstructor(String.class);
//        System.out.printf(String.valueOf(constructor.newInstance("adsh")));
        person o = (person)c1.newInstance();
//        Method method = c1.getMethod("setName", String.class);
//        method.invoke(o, "adsh");
//        System.out.println(o.getName());
        Field field = c1.getDeclaredField("name");
        field.setAccessible(true);
        field.set(o,"adsh");
        System.out.println(o.getName());


    }
}
