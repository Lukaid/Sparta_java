public class Main_Human {
    public static void main(String[] args) {
        Human grandParent = new GrandParent("할아버지", 70);
        Human parent = new Parent("엄마", 50);
        Human child = new Children("나", 20);

        Human[] humans = {grandParent, parent, child};
        for (Human human: humans){
            System.out.println(human.name + human.age + human.speed + human.getLocation());
        }
        System.out.println("<활동시작>");
        for (Human human: humans){
            if(human instanceof Walkable) {
                ((Walkable) human).walk(1, 1);
                System.out.println(" ------- ");
            }
            if(human instanceof Runnable) {
                ((Runnable) human).run(2, 2);
                System.out.println(" ------- ");
            }
            if(human instanceof Swimmable) {
                ((Swimmable) human).swim(3, -1);
                System.out.println(" ------- ");
            }
        }
    }
}
