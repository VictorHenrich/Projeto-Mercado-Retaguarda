
package models.people;


public class Sex {
    private final String description;
    private final char initials;

    public Sex(String description, char initials) {
        this.description = description;
        this.initials = initials;
    }
    
    public String getDescription() {
        return description;
    }

    public char getInitials() {
        return initials;
    }

    
    
}
