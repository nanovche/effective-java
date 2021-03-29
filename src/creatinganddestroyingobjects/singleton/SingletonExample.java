package creatinganddestroyingobjects.singleton;

public class SingletonExample {

    public static void main(String[] args) {
        Elvis elvis = Elvis.SINGLE_INSTANCE;
        Elvis2 elvis2 = Elvis2.getInstance();
    }

}
/* private constructor is accessible via reflection
* throw exception/assertion error to defend */
//instance var
class Elvis {
    public static final Elvis SINGLE_INSTANCE = new Elvis();
    private Elvis() {}
}

//static factory
class Elvis2 {
    private static final Elvis2 SINGLE_INSTANCE = new Elvis2();
    private Elvis2(){}

    public static Elvis2 getInstance() {
        return SINGLE_INSTANCE;
    }
}

// defended against reflection, and is serializable
enum Elvis3 {
    INSTANCE;
}
