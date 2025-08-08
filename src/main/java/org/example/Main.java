package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Exercise 1: Creating an ArrayList and Adding Elements (add)
        ArrayList<String> missionTasks = new ArrayList<>();

        System.out.println("Is the list empty initially? " + missionTasks.isEmpty());

        missionTasks.add("Secure the perimeter");
        missionTasks.add("Establish communication");
        missionTasks.add("Report status");
        System.out.println("Current tasks: " + missionTasks);
        System.out.println("Number of tasks: " + missionTasks.size());
        //Exercise 2: Accessing and Modifying Elements (get and set)
        ArrayList<String> equipment = new ArrayList<>();
        equipment.add("Compass");
        equipment.add("Map");
        equipment.add("Radio");
        String secondItem = equipment.get(1);
        System.out.println("Item at index 1: " + secondItem);
        System.out.println("List before modification: " + equipment);
        equipment.set(0, "GPS");

        System.out.println("List after modification: " + equipment);
        //Exercise 3: Inserting and Removing Elements (add at index and remove)

        ArrayList<String> objectives = new ArrayList<>();
        objectives.add("Primary Objective");
        objectives.add("Tertiary Objective");
        objectives.add(1, "Secondary Objective");
        System.out.println("List after insertion: " + objectives);
        String removedObjective = objectives.remove(2);
        System.out.println("Removed objective: " + removedObjective);
        System.out.println("List after removing by index: " + objectives);
        objectives.remove("Primary Objective");
        System.out.println("List after removing by object: " + objectives);


        //Exercise 4: Searching the List (contains and indexOf)
        ArrayList<String> waypoints = new ArrayList<>();
        waypoints.add("Alpha");
        waypoints.add("Bravo");
        waypoints.add("Charlie");

        boolean hasBravo = waypoints.contains("Bravo");
        System.out.println("Does the list contain 'Bravo'? " + hasBravo);

        int indexOfCharlie = waypoints.indexOf("Charlie");
        System.out.println("Index of 'Charlie': " + indexOfCharlie);

        int indexOfDelta = waypoints.indexOf("Delta");
        System.out.println("Index of 'Delta': " + indexOfDelta);

        //Exercise 5: Iterating Through the List

        ArrayList<String> squad = new ArrayList<>();
        squad.add("Leader");
        squad.add("Medic");
        squad.add("Engineer");
        squad.add("Scout");

        System.out.println("--- Using an Enhanced For-Loop ---");
        for (String role : squad) {
            System.out.println("Role: " + role);
        }

        System.out.println("\n--- Using a Standard For-Loop with index ---");
        for (int i = 0; i < squad.size(); i++) {
            System.out.println("Role at index " + i + ": " + squad.get(i));
        }
        System.out.println();
        //Exercise 6: Clearing the List (clear)
        ArrayList<String> intel = new ArrayList<>();
        intel.add("Enemy position: Sector 4");
        intel.add("Weakness: Power generator");
        System.out.println("Intel count before mission: " + intel.size());
        System.out.println("Intel list: " + intel);
        intel.clear();
        System.out.println("\nIntel count after mission: " + intel.size());
        System.out.println("Is the intel list empty now? " + intel.isEmpty());
        System.out.println("Intel list: " + intel);


    }
}