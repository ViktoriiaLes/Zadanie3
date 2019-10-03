public class Clothes {
    public static void main(String[] args) {
        Blouse blouse1 = new Blouse();
        blouse1.color = "green";
        blouse1.madeOf = "wool";
        blouse1.size = 40;

        System.out.println("Blouse: color " + blouse1.color + ", " + "made of " + blouse1.madeOf + ", " + "size " + blouse1.size);

        Blouse blouse2 = new Blouse();
        blouse2.color = "grey";
        blouse2.madeOf = "cotton";
        blouse2.size = 38;

        System.out.println("Blouse: color " + blouse2.color + ", " + "made of " + blouse2.madeOf + ", " + "size " + blouse2.size);
    }

}
