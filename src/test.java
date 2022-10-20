import java.util.Arrays;

public class test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("entity");
        System.out.println(c1);
        Class c2 = Class.forName("entity");
        Class c3 = Class.forName("entity");
        Class c4 = Class.forName("entity");
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());

    }
}
class entity{

}
