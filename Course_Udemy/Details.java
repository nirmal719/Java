class Base {
    public String name = "Base";
}
class Derived extends Base {
    private final String name = "Derived";
    public String getName() {
        return name;
    }
}
public class Details {
    public static void main(String[] args) {
        /* System.out.println(new Derived().getName());
        System.out.println(new Derived().name); */
		System.out.println(new Derived().getName());
		// System.out.println(new Derived().name);
		Derived d = new Derived();
		System.out.println(d.getName());
    }
}