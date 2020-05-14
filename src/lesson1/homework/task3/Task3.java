package lesson1.homework.task3;

public class Task3 {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());

        System.out.println("appleBox1 weight: " + appleBox1.getBoxWeight());
        System.out.println("appleBox2 weight: " + appleBox2.getBoxWeight());
        System.out.println("orangeBox1 weight: " + orangeBox1.getBoxWeight());
        System.out.println("orangeBox2 weight: " + orangeBox2.getBoxWeight());
        System.out.println("----------------------------");
        System.out.println("appleBox1 weight is equal to appleBox2 weight: " + appleBox1.compare(appleBox2));
        System.out.println("appleBox2 weight is equal to orangeBox1 weight: " + appleBox2.compare(orangeBox1));
        System.out.println("orangeBox1 weight is equal to orangeBox2 weight: " + orangeBox1.compare(orangeBox2));
        System.out.println("----------------------------");

        appleBox1.moveToAnotherBox(appleBox2);
        orangeBox1.moveToAnotherBox(orangeBox2);

        System.out.println("appleBox1 weight: " + appleBox1.getBoxWeight());
        System.out.println("appleBox2 weight: " + appleBox2.getBoxWeight());
        System.out.println("orangeBox1 weight: " + orangeBox1.getBoxWeight());
        System.out.println("orangeBox2 weight: " + orangeBox2.getBoxWeight());
        System.out.println("----------------------------");
        System.out.println("appleBox1 weight is equal to orangeBox1 weight: " + appleBox1.compare(orangeBox1));
        System.out.println("appleBox2 weight is equal to orangeBox2 weight: " + appleBox2.compare(orangeBox2));

    }
}
