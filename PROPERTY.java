// Property.java
public class PROPERTY {
    private String propertyID;
    private String description;
    private String propertyOwnerId;

    // Constructor
    public PROPERTY(String propertyID, String description, String propertyOwnerId) {
        this.propertyID = propertyID;
        this.description = description;
        this.propertyOwnerId = propertyOwnerId;
    }

    // Getters and setters
    public String getPropertyID() { return propertyID; }
    public String getDescription() { return description; }
    public String getPropertyOwnerId() { return propertyOwnerId; }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPropertyOwnerId(String propertyOwnerId) {
        this.propertyOwnerId = propertyOwnerId;
    }
}
