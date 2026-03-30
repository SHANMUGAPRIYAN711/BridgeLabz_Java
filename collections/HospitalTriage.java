package BridgeLabz_Java.collections;

import java.util.*;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriage {
    public static void main(String[] args) {

        // Max Heap → higher severity first
        PriorityQueue<Patient> pq = new PriorityQueue<>(
                (a, b) -> b.severity - a.severity
        );

        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        System.out.println("Treatment Order:");

        while (!pq.isEmpty()) {
            Patient p = pq.remove();
            System.out.println(p.name + " (Severity: " + p.severity + ")");
        }
    }
}