package FlightControl.ui;

import FlightControl.domain.AirPlane;
import FlightControl.domain.Flight;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

public class TextUI {

    private FlightControl flightControl;
    private Scanner scan;

    public TextUI(FlightControl flightControl, Scanner scan) {
        this.flightControl = flightControl;
        this.scan = scan;
    }

    public void start() {
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();
    }

    public void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String choice = scan.nextLine();
            if (choice.equals("1")) {
                addAirplane();
            } else if (choice.equals("2")) {
                addFlight();
            } else if (choice.equals("x")) {
                break;
            }
        }
    }

    public void addAirplane() {
        System.out.println("Give the airplane id: ");
        String id = scan.nextLine();
        System.out.println("Give the airplane capacity: ");
        int capacity = Integer.valueOf(scan.nextLine());
        this.flightControl.addAirPlane(id, capacity);
    }

    public void addFlight() {
        System.out.println("Give the airplane id: ");
        String id = scan.nextLine();
        AirPlane plane = askForAirplane(id);
        System.out.println("Give the departure airport id: ");
        String departue = scan.nextLine();
        System.out.println("Give the target airport id: ");
        String target = scan.nextLine();
        this.flightControl.addFlight(plane, departue, target);
    }

    public void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println("");
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            
            System.out.print("> ");
            String choice = scan.nextLine();
            if(choice.equals("1")){
                printAirplanes();
            }
            else if(choice.equals("2")){
                printFlights();
            }
            else if(choice.equals("3")){
                printAirplaneDetails();
            }
            else if(choice.equals("x")){
                break;
            }
        }
    }
    
    public void printAirplanes(){
        for(AirPlane plane : this.flightControl.printAirplanes()){
            System.out.println(plane);
        }
    }
    
    public void printFlights(){
        for(Flight flight : this.flightControl.printFlights()){
            System.out.println(flight);
        }
        System.out.println("");
    }
    
    public void printAirplaneDetails(){
        System.out.println("Give the airplane id: ");
        String id = scan.nextLine();
        AirPlane plane = askForAirplane(id);
        System.out.println(plane);
        System.out.println("");
    }

    public AirPlane askForAirplane(String id) {
        AirPlane plane = null;
        while (plane == null) {
            plane = this.flightControl.getAirplane(id);
            if (plane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }
        return plane;
    }

}
