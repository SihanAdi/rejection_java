package all_test;

import java.lang.annotation.ElementType;

public class test2 {
    public static void main(String[] args) throws ClassNotFoundException {
//        person p = new student();
//        System.out.println("name is " + p.name);
//
//        Class c1 = p.getClass();
//        Class c2 = Class.forName("all_test.student");
//        Class c3 = student.class;
//        Class c4 = Integer.TYPE;
//        Class c5 = c2.getSuperclass();
//        System.out.println(c1.hashCode());
//        System.out.println(c2.hashCode());
//        System.out.println(c3.hashCode());
//        System.out.println(c4.hashCode());
//        System.out.println(c5);
//        Class c6 = Object.class;
//        Class c7 = Runnable.class;
//        Class c8 = Override.class;
//        Class c9 = String[].class;
//        Class c10 = String[][].class;
//        Class c11 = ElementType.class;
//        Class c12 = void.class;
//        Class C13 = Class.class;
//        System.out.println(c6 );
//        System.out.println(c7 );
//        System.out.println(c8 );
//        System.out.println(c9 );
//        System.out.println(c10);
//        System.out.println(c11);
//        System.out.println(c12);
//        System.out.println(C13);
        System.out.println(System.getProperty("java.class.path"));
    }
}
class person{


    private String name;

    public person() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                '}';
    }
}
//class student extends person{
//    public student(){
//        this.name = "student";
//    }
//}
//class teacher extends person{
//    public teacher(){
//        this.name = "teacher";
//    }
//}
