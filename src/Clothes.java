public class Clothes {
    public static void main(String[] args) {
        Blouse blouse1 = new Blouse("green", "wool", 40);

        System.out.println("Blouse: color " + blouse1.color + ", " + "made of " + blouse1.madeOf + ", " + "size "
                + blouse1.size);

        Blouse blouse2 = new Blouse("gray", "cotton", 38);

        System.out.println("Blouse: color " + blouse2.color + ", " + "made of " + blouse2.madeOf + ", " + "size "
                + blouse2.size);
    }

}
