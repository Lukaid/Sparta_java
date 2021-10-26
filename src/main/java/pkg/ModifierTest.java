package pkg;

public class ModifierTest {
    private void messageInside() {
        System.out.println("This is private modifier");
    }

    public void messageOutside() {
        System.out.println("This is public modifier");
        messageInside(); // class 안의 public 을 통해 private에 접근 할 수 있다.
    }

    protected void messageProtected() {
        System.out.println("This is protected modifier");
    }

    void messagePackagePrivate() {
        System.out.println("This is package private modifier");
    }
}