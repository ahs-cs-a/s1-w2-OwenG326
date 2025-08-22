public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Lake", 12);
        b.printState();
        BodyOfWater b1 = new BodyOfWater("Ocean", 10, 10, true);
        b1.printState();
        b.setName("Puddle");
        b.printState();
        b1.printState();
    }
}
