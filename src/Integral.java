public class Integral {

    private Double aInterval;
    private Double bInterval;
    Integral(Double a, Double b)
    {
        aInterval=a;
        bInterval=b;
    }
    Double getResult(){
        return Math.cos(aInterval)-Math.cos(bInterval);
    }
}
