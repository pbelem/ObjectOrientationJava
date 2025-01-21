package util;

import java.util.Scanner;

import entities.Elevator;

public class ElevatorOperations {

    static Scanner sc = new Scanner(System.in);
    static Elevator elevator;

    public static void CreateElevator() {

        int totalFloors;
        int totalElevatorCapacity;

        System.out.println("How many floors there in the building?");
        totalFloors = sc.nextInt();
        System.out.println("What is the total capacity of the elevator?");
        totalElevatorCapacity = sc.nextInt();

        elevator = new Elevator(totalFloors, totalElevatorCapacity);
    }

    public static void ElevatorWorking() {

        byte operationChoosen, checkRepeatOperation;
        boolean working = true;

        while (working) {

            System.out.println(
                    "Insert operation\n(1)Get in the elevator\n(2)Exit the elevator\n(3)Go up the elevator\n(4)Go down the elevator\n(5)Exit Program");
            operationChoosen = sc.nextByte();

            switch (operationChoosen) {
            case 1:
                GetInTheElevator();
                break;
            case 2:
                ExitTheElevator();
                break;
            case 3:
                GoUpElevator();
                break;
            case 4:
                GoDownElevator();
                break;
            case 5:
                working = false;
                break;
            default:
                System.out.println("Invalid Operation, try again");
            }

            System.out.print(elevator);
            
            if (working) {
                System.out.println("\nDid you need one more operation?\n(1)Yes\n(2)No");
                checkRepeatOperation = sc.nextByte();
                if (checkRepeatOperation == 2) {
                    working = false;
                } else if(checkRepeatOperation != 1 && checkRepeatOperation != 2) {
                	System.out.println("invalid response, restarting!");
                }
            }
        }
    }

    public static void GetInTheElevator() {

        if (elevator.getCurrentElevatorCapacity() < elevator.getTotalElevatorCapacity()) {
            elevator.setCurrentElevatorCapacity(elevator.getCurrentElevatorCapacity() + 1);

            System.out.println("A person entered the elevator");
        } else {
            System.out.println("The elevator is full");
        }

    }

    public static void ExitTheElevator() {

        if (elevator.getCurrentElevatorCapacity() > 0) {
            elevator.setCurrentElevatorCapacity(elevator.getCurrentElevatorCapacity() - 1);

            System.out.println("A person got off the elevator");
        } else {
            System.out.println("The elevator is empty");
        }

    }

    public static void GoUpElevator() {

        if (elevator.getCurrentFloor() < elevator.getTotalFloors()) {
            elevator.setCurrentFloor(elevator.getCurrentFloor() + 1);

            System.out.println("The elevator went up one floor");
        } else {
            System.out.println("The elevator is at the top floor");
        }

    }

    public static void GoDownElevator() {

        if (elevator.getCurrentFloor() > 0) {
            elevator.setCurrentFloor(elevator.getCurrentFloor() - 1);

            System.out.println("The elevator went down one floor");
        } else {
            System.out.println("The elevator is at the ground floor");
        }
    }
}
