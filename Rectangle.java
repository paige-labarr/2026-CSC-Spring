public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    /**
     * Default constructor.
     * Creates a rectangle with default width and height of 1.0,
     * and default color "white" and not filled.
     */
    public Rectangle() {
        super(); // Calls the default constructor of GeometricObject
        this.width = 1.0;
        this.height = 1.0;
    }

    /**
     * Constructs a rectangle with the specified width and height.
     * Uses default color "white" and not filled.
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public Rectangle(double width, double height) {
        super(); // Calls the default constructor of GeometricObject
        this.width = width;
        this.height = height;
    }

    /**
     * Constructs a rectangle with the specified width, height, color, and filled status.
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     * @param color The color of the rectangle.
     * @param filled Whether the rectangle is filled or not.
     */
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled); // Calls the constructor of GeometricObject with color and filled
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the width of the rectangle.
     * @return The width.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the rectangle.
     * @param width The new width.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Returns the height of the rectangle.
     * @return The height.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the rectangle.
     * @param height The new height.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates and returns the area of the rectangle.
     * @return The area.
     */
    public double getArea() {
        return width * height;
    }

    /**
     * Calculates and returns the perimeter of the rectangle.
     * @return The perimeter.
     */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // You might also want to override the toString method from GeometricObject
    // to include rectangle-specific details.
    @Override
    public String toString() {
        return "Rectangle object -> width = " + width + ", height = " + height + ", color = " + getColor() + 
               ", filled = " + isFilled() + ", dateCreated = " + getDateCreated();
    }
}