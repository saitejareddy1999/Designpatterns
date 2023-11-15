package Strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googlemaps = new GoogleMaps();
        googlemaps.findPath("Hyderabad","Nalgonda","car");
    }
}
