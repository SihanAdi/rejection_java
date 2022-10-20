package all_test;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class Annotation_rejection_ORC {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("all_test.student10");
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        type_annotation Type = (type_annotation) c1.getAnnotation(type_annotation.class);
        String value = Type.value();
        System.out.println(value);
        Field id = c1.getDeclaredField("id");
        field_annotation annotations1 = id.getAnnotation(field_annotation.class);
        System.out.println(annotations1.col_name());
        System.out.println(annotations1.length());
        System.out.println(annotations1.type());

    }
}
@type_annotation("db_student")
class student10{
    @field_annotation(col_name = "db_id", type = "int", length = 10)
    private int id;
    @field_annotation(col_name = "db_id", type = "int", length = 10)
    private int age;
    @field_annotation(col_name = "db_id", type = "varchar", length = 3)
    private String name;

    public student10() {
    }

    public student10(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
//类注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface type_annotation{
    String value();
}
//属性注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface field_annotation{
    String col_name();
    String type();
    int length();
}
