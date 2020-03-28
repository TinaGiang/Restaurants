package au.edu.unsw.infs3634.restaurants;

import java.util.ArrayList;

public class Restaurant {

    private String name;
    private String symbol;
    private String cuisine;
    private String location;
    private String description;
    private double averageCost;
    private double rating;

    public Restaurant(){
    }

    public Restaurant(String name, String symbol, String cuisine, String location,
                      String description, double averageCost, double rating){
        this.name = name;
        this.symbol = symbol;
        this.cuisine = cuisine;
        this.location = location;
        this.description = description;
        this.averageCost = averageCost;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(double averageCost) {
        this.averageCost = averageCost;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

       public static ArrayList<Restaurant> getRestaurants() {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Don Peppino's", "DP", "Italian", "Paddington", "Hi", 70, 3.7));
        restaurants.add(new Restaurant("Barzaari", "BZ", "Middle Eastern", "Marrickville", "Hi", 40, 3.6));
        restaurants.add(new Restaurant("La Vita Mediterranean", "LVM", "Italian, Middle Eastern", "Edensor Park", "Hi", 30, 3.9));
        restaurants.add(new Restaurant("Guo's Noodle House", "GNH", "Chinese", "Hurstville", "Hi", 15, 3.8));
        restaurants.add(new Restaurant("Alexandra Hotel", "AH","Modern Australian", "Leura", "Hi", 30, 3.7));
        restaurants.add(new Restaurant("Kittyhawk", "KK", "French", "Central Business District", "Hi", 30, 4.0));
        restaurants.add(new Restaurant("Fujiyama Restaurant", "FR", "Japanese", "Summer Hill", "Hi", 25, 3.8));
        restaurants.add(new Restaurant("Gami Chicken & Beer", "GCB", "Korean", "Castle Hill", "Hi", 35, 3.8));
        restaurants.add(new Restaurant("Gyradiko Bexley", "GB", "Greek", "Bexley", "Hi", 20, 4.3));
        restaurants.add(new Restaurant("Bambino Torino", "BT", "Italian, European", "Newtown", "Hi", 35, 3.7));
        return restaurants;
    }

    public static Restaurant searchRestaurant(String search) {

        for (int x = 0; x < Restaurant.getRestaurants().size(); x++) {
            if (Restaurant.getRestaurants().get(x).name.toLowerCase().equals(search.toLowerCase())) {
                return Restaurant.getRestaurants().get(x);
            }
        }
        return null;
    }

}
