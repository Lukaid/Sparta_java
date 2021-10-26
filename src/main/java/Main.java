import pkg.ModifierTest;

class Phone {
    String model;
    String color;
    int price;
    // alt + ins (mac: command + n)
    public Phone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}

class Calculation {
    int add(int x, int y) {
        return x + y;
    }

    int subtract(int x, int y) {
        return x - y;
    }
}

public class Main {
    public static void main(String[] args) {
        Phone galaxy = new Phone("Galaxy10", "Black", 100);

        Phone iphone = new Phone("iPhoneX", "Black",200);

        System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " + 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("영희는 이번에 " + iphone.model + iphone.color + " + 색상을 " + iphone.price + "만원에 샀다.");

        Calculation calculation = new Calculation();
        int addResult = calculation.add(1, 2);
        int subResult = calculation.subtract(5, 3);
        System.out.println(addResult);
        System.out.println(subResult);
    }
}

class DefaultValueTest {
    byte byteDefaultValue;
    int intDefaultValue;
    short shortDefaultValue;
    long longDefaultValue;
    float floatDefaultValue;
    double doubleDefaultValue;
    boolean booleanDefaultValue;
    String referenceDefaultValue;
}

class Main_default {
    public static void main(String[] args) {
        DefaultValueTest defaultValueTest = new DefaultValueTest();
        System.out.println("byte default: " + defaultValueTest.byteDefaultValue);
        System.out.println("short default: " + defaultValueTest.shortDefaultValue);
        System.out.println("int default: " + defaultValueTest.intDefaultValue);
        System.out.println("long default: " + defaultValueTest.longDefaultValue);
        System.out.println("float default: " + defaultValueTest.floatDefaultValue);
        System.out.println("double default: " + defaultValueTest.doubleDefaultValue);
        System.out.println("boolean default: " + defaultValueTest.booleanDefaultValue);
        System.out.println("reference default: " + defaultValueTest.referenceDefaultValue);
    }
}

class Animal {
    String name;

    public void cry() {
        System.out.println(name + " is crying.");
    }
}

class Dog extends Animal {

    Dog(String name) {
        this.name = name;
    }

    @Override
    public void cry() {
        System.out.println(name + " is barking!");
    }

    public void swim() {
        System.out.println(name + " is swimming!");
    }
}

class Main_inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("코코");
        dog.cry();
        dog.swim();

        Animal dog2 = dog;
        dog2.cry();
//        dog2.swim(); // compile error

        Animal dog3 = new Dog("미미");
        dog3.cry();

    }
}

class Main_overloading {
    public static void main(String[] args) {

    }

    int add(int x, int y, int z) {
        int result = x + y + z;
        return result;
    }

    long add(int a, int b, long c) {
        long result = a + b + c;
        return result;
    }

    int add(int a, int b) {
        int result = a + b;
        return result;
    }
// 오버로딩의 조건에 부합하는 예제입니다.
}

class Child extends ModifierTest {
    void callParentProtected() {
        System.out.println("call my parent's protected method");
        super.messageProtected();
    }
}

class Main_modifier {
    public static void main(String[] args) {
        ModifierTest modifierTest = new ModifierTest();
        modifierTest.messageOutside();
//        modifierTest.messageInside();
//        modifierTest.messageProtected();
//        modifierTest.messagePackagePrivate();

        Child child = new Child();
        child.callParentProtected();
    }
}

abstract class Bird {
    private int x, y, z;

    void fly (int x, int y, int z) {
        printLocation();
        System.out.println("이동합니다");
        this.x = x;
        this.y = y;
        if (flyable(z)){
            this.z = z;
        } else {
            System.out.println("그 높이로는 날 수 없습니다");
        }

        printLocation();
    }

    abstract boolean flyable(int z);

    public void printLocation() {
        System.out.println("현재위치 (" + x + ", " + y + ", " + z + ")");
    }
}

class Pigeon extends Bird {

    @Override
    boolean flyable(int z) {
        return z < 10000;
    }
}

class Peacock extends Bird {

    @Override
    boolean flyable(int z) {
        return false;
    }
}

class Main_abstract {
    public static void main(String[] args) {
        Bird pigeon = new Pigeon();
        Bird peacock = new Peacock();
        System.out.println("--- 구구구 ---");
        pigeon.fly(1, 1, 3);
        System.out.println("--- 공작새 ---");
        peacock.fly(1, 1, 3);
        System.out.println("--- 구구구 ---");
        pigeon.fly(3, 3, 30000);
    }
}

interface Flyable {
    void fly (int x, int y, int z);
}

class Pigeon2 implements Flyable {
    private int x, y, z;

    @Override
    public void fly(int x, int y, int z) {
        printLocation();
        System.out.println("이동합니다");
        this.x = x;
        this.y = y;
        this.z = z;
        printLocation();
    }

    public void printLocation() {
        System.out.println("현재위치 (" + x + ", " + y + ", " + z + ")");
    }
}

class Main_interface {
    public static void main(String[] args) {
        Flyable pigeon2 = new Pigeon2();
        pigeon2.fly(1, 2, 3);
    }
}