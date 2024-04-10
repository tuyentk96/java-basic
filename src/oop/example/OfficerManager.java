package oop.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OfficerManager {
    List<Officer> officers;



    public OfficerManager() {
        this.officers = new ArrayList<>();
    }

    public void addOfficer(Officer officer) {
        this.officers.add(officer);
    }

    public List<Officer> searchOfficerByName(String name) {
        return this.officers.stream().filter(officer -> officer.getName().contains(name))
                .collect(Collectors.toList());
    }

    public void printOfficers() {
        for (Officer officer : officers) {
            System.out.println(officer);
        }
    }
}
