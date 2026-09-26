/**
 *
 * @author gladysarias
 */
public class tester {
    public static void main(String[] args) {
        linkedPositionalList itinerary = new linkedPositionalList();

        // First Places
        System.out.println("Travel itinerary: ");
        position stop1 = itinerary.addLast("Canada");
        position stop2 = itinerary.addLast("Mexico");
        position stop3 = itinerary.addLast("Tokyo");
        position stop4 = itinerary.addLast("Italy");

        // Insert a stop between two others
        System.out.println("Addding Paris after Tokyo");
        itinerary.addAfter(stop3, "Paris");

        // prinintg out the stops
        System.out.println("\n Final Stops");
        for (Object stop : itinerary) {
            System.out.println("Stop: " + stop);
        }
    }
}
