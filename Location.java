package edu.ucalgary.oop;

import java.util.ArrayList; 

public class Location {
    private String name;
    private String address;
    private ArrayList<DisasterVictim> occupants; 

    public Location(String name, String address) {
        this.name = name;
        this.address = address;
        this.occupants = new ArrayList<>();
        this.supplies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DisasterVictim[] getOccupants() {
        return occupants.toArray(new DisasterVictim[0]);
    }

    public void setOccupants(DisasterVictim[] occupants) {
        this.occupants = new ArrayList<>(List.of(occupants));
    }

    public Supply[] getSupplies() {
        return supplies.toArray(new Supply[0]);
    }

    public void setSupplies(Supply[] supplies) {
        this.supplies = new ArrayList<>(List.of(supplies));
    }

    public void addOccupant(DisasterVictim occupant) {
        occupants.add(occupant);
    }

    public void removeOccupant(DisasterVictim occupant) {
        occupants.remove(occupant);
    }

    public void addSupply(Supply supply) {
        supplies.add(supply);
    }

    public void removeSupply(Supply supply) {
        supplies.remove(supply);
    }
}
