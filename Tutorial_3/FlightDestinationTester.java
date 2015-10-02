package Tutorial_3;

import java.util.ArrayList;

class FlightDest {
    private String flightNo;
    private String destination;

    public FlightDest(String flightNo, String destination) {
        this.flightNo = flightNo;
        this.destination = destination;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }
}

class FlightInfo {
    ArrayList<FlightDest> flightDestList = new ArrayList<>();

    public FlightInfo() {}

    public void addFlightDestPair(String fNo, String dest) {
        FlightDest temp = new FlightDest(fNo, dest);
        flightDestList.add(temp);
    }

    public ArrayList<String> getFlightsDest(String dest) {
        ArrayList<String> list = new ArrayList<>();

        for (FlightDest i : flightDestList) {
            if (i.getDestination().equals(dest)) {
                list.add(i.getFlightNo());
            }
        }

        return list;
    }
}

public class FlightDestinationTester {
    public static void main(String[] args) {
        FlightInfo flightInfo = new FlightInfo();

        flightInfo.addFlightDestPair("123", "Dubai");
        flightInfo.addFlightDestPair("456", "Sharjah");
        flightInfo.addFlightDestPair("789", "Ajman");
        flightInfo.addFlightDestPair("012", "Dubai");

        ArrayList<String> res = flightInfo.getFlightsDest("Dubai");

        for (String s : res) {
            System.out.println("Flight No: " + s);
        }
    }
}
