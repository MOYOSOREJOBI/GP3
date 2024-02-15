package edu.ucalgary.oop;

// Import the DisasterVictim class
import edu.ucalgary.oop.DisasterVictim;

public class FamilyRelation {
    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;

    public FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo) {
        this.personOne = personOne;
        this.relationshipTo = relationshipTo;
        this.personTwo = personTwo;
    }

    public DisasterVictim getPersonOne() {
        return personOne;
    }

    public void setPersonOne(DisasterVictim personOne) {
        if (personOne == null) {
            throw new IllegalArgumentException("Person one cannot be null");
        }
        this.personOne = personOne;
    }

    public String getRelationshipTo() {
        return relationshipTo;
    }

    public void setRelationshipTo(String relationshipTo) {
        if (relationshipTo == null || relationshipTo.trim().isEmpty()) {
            throw new IllegalArgumentException("Relationship to cannot be null or empty");
        }
        this.relationshipTo = relationshipTo;
    }

    public DisasterVictim getPersonTwo() {
        return personTwo;
    }

    public void setPersonTwo(DisasterVictim personTwo) {
        if (personTwo == null) {
            throw new IllegalArgumentException("Person two cannot be null");
        }
        this.personTwo = personTwo;
    }
}
