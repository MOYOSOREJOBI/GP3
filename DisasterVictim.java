import java.util.ArrayList;
import java.util.List;
import edu.ucalgary.oop.MedicalRecord;
import edu.ucalgary.oop.FamilyRelation;
import edu.ucalgary.oop.Supply;


public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private static int ASSIGNED_SOCIAL_ID = 0;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
    private String gender;
    private static int counter = 0;

    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.familyConnections = new FamilyRelation[0];
        this.medicalRecords = new MedicalRecord[0];
        this.personalBelongings = new Supply[0];
        this.ASSIGNED_SOCIAL_ID = ++counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getComments() {
        return comments;
    }

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }

    public String getEntryDate() {
        return ENTRY_DATE;
    }

    public int getAssignedSocialID() {
        return ASSIGNED_SOCIAL_ID;
    }

    public Supply[] getPersonalBelongings() {
        return personalBelongings;
    }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnections;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        if (dateOfBirth == null || dateOfBirth.trim().isEmpty()) {
            throw new IllegalArgumentException("Date of birth cannot be null or empty");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public void setPersonalBelongings(Supply[] supplies) {
        this.personalBelongings = supplies;
    }

    public void setFamilyConnections(FamilyRelation[] relations) {
        this.familyConnections = relations;
    }

    public void setGender(String gender) {
        if (gender == null || (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female"))) {
            throw new IllegalArgumentException("Gender must be either 'male' or 'female'");
        }
        this.gender = gender;
    }

    public void addPersonalBelonging(Supply supply) {
        Supply[] newSupplies = new Supply[personalBelongings.length + 1];
        System.arraycopy(personalBelongings, 0, newSupplies, 0, personalBelongings.length);
        newSupplies[personalBelongings.length] = supply;
        personalBelongings = newSupplies;
    }

    public void removePersonalBelonging(Supply supply) {
        List<Supply> supplyList = new ArrayList<>();
        for (Supply s : personalBelongings) {
            if (!s.equals(supply)) {
                supplyList.add(s);
            }
        }
        personalBelongings = supplyList.toArray(new Supply[0]);
    }

    public void addFamilyConnection(FamilyRelation familyRelation) {
        FamilyRelation[] newRelations = new FamilyRelation[familyConnections.length + 1];
        System.arraycopy(familyConnections, 0, newRelations, 0, familyConnections.length);
        newRelations[familyConnections.length] = familyRelation;
        familyConnections = newRelations;
    }

    public void removeFamilyConnection(FamilyRelation familyRelation) {
        List<FamilyRelation> relationList = new ArrayList<>();
        for (FamilyRelation relation : familyConnections) {
            if (!relation.equals(familyRelation)) {
                relationList.add(relation);
            }
        }
        familyConnections = relationList.toArray(new FamilyRelation[0]);
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        MedicalRecord[] newRecords = new MedicalRecord[medicalRecords.length + 1];
        System.arraycopy(medicalRecords, 0, newRecords, 0, medicalRecords.length);
        newRecords[medicalRecords.length] = medicalRecord;
        medicalRecords = newRecords;
    }
}
