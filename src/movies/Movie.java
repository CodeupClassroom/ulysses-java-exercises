package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String toString() { // override
        return name + ", Category: " + category;
    }

    public boolean isInCategory(String category) {
        return this.category.equals(category);
    }
}
