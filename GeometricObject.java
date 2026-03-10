import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    // Default constructor
    public GeometricObject() {
        color = "white";
        filled = false;
        dateCreated = new Date();
    }

    // Constructor with color and filled parameters
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for filled
    public boolean isFilled() {
        return filled;
    }

    // Setter for filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Getter for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    // You can add more methods as needed, such as a toString method
}