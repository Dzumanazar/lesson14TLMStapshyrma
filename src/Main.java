public class Main {
    public static void main(String[] args) {
        Programmer programmer =new Programmer("Dalvet", "devaloper", "Paeksoft");
        System.out.println(programmer);
        programmer.learn();
        programmer.eat();
        programmer.walk();
        programmer.coding();
        System.out.println("~~~~~~~~~~~~~~");

        Dancer dancer=new Dancer("Dastan", "biychi", "Calam");
        System.out.println(dancer);
        dancer.learn();
        dancer.eat();
        dancer.walk();
        dancer.dancing();
        System.out.println("----------------");

        Singer singer=new Singer("Kanat", "Singer", "NO name");
        System.out.println(singer);
        singer.learn();
        singer.eat();
        singer.walk();
        singer.singing();
        singer.playGitar();
    }
}