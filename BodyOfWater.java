public class BodyOfWater{
    private String name;
    private int largestDiameter;
    private int avgDepth;
    private boolean isSaltWater;
public BodyOfWater(String n, int l, int a, boolean i){
    name = n;
    largestDiameter = l;
    avgDepth = a;
    isSaltWater = i;
}
public BodyOfWater(String n, int a){
    name = n;
    avgDepth = a;
}
}
