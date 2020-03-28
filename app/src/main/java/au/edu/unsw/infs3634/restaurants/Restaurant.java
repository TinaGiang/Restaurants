package au.edu.unsw.infs3634.restaurants;

import android.widget.ImageView;

import java.util.ArrayList;

public class Restaurant {

    private int picture;
    private String name;
    private String symbol;
    private String cuisine;
    private String location;
    private String description;
    private String averageCost;
    private String rating;
    private String thoughts;

    public Restaurant(){
    }

    public Restaurant(int picture, String name, String symbol, String cuisine, String location,
                      String description, String averageCost, String rating, String thoughts){
        this.picture = picture;
        this.name = name;
        this.symbol = symbol;
        this.cuisine = cuisine;
        this.location = location;
        this.description = description;
        this.averageCost = averageCost;
        this.rating = rating;
        this.thoughts = thoughts;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture (int picture) {
        this.picture = picture;
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

    public String getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(String averageCost) {
        this.averageCost = averageCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getThoughts() {
        return thoughts;
    }

    public void setThoughts(String thoughts) {
        this.thoughts = thoughts;
    }

       public static ArrayList<Restaurant> getRestaurants() {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant(R.drawable.pic_1, "Don Peppino's", "DP", "Italian", "Paddington",
                "Prepare to be amazed by the ever-changing menu ranging from trout to pasta to the best wines money can buy.",
                "$50 p/p", "4.4", "'Absolutely amazing.'"));
        restaurants.add(new Restaurant(R.drawable.pic_2,"Barzaari", "BZ", "Middle Eastern", "Marrickville", "Hi", "$40 p/p", "4.2", "'Simply superb!'"));
        restaurants.add(new Restaurant(R.drawable.pic_3,"La Vita Mediterranean", "LVM", "Italian, Middle Eastern", "Edensor Park", "Hi", "$30 p/p", "4.2", "'Truly the best in the West.'"));
        restaurants.add(new Restaurant(R.drawable.pic_4,"Guo's Noodle House", "GNH", "Chinese", "Hurstville", "Hi", "$15 p/p", "3.8", "'Best noodle house to ever exist!'"));
        restaurants.add(new Restaurant(R.drawable.pic_5,"Alexandra Hotel", "AH","Modern Australian", "Leura", "Hi", "$30 p/p", "3.9", "'Amazing, amazing steak!'"));
        restaurants.add(new Restaurant(R.drawable.pic_6,"Kittyhawk", "KK", "French", "Central Business District", "Hi", "$30 p/p", "4.0", "'Bonjour j'aime la nourriture ici!!'"));
        restaurants.add(new Restaurant(R.drawable.pic_7,"Fujiyama Restaurant", "FR", "Japanese", "Summer Hill", "Hi", "$25 p/p", "4.1", "'All I can say is wow. You won't be let down.'"));
        restaurants.add(new Restaurant(R.drawable.pic_8,"Gami Chicken & Beer", "GCB", "Korean", "Castle Hill", "Hi", "$35 p/p", "4.2", "'Scrumptious chicken & good beer! What are you waiting for?'"));
        restaurants.add(new Restaurant(R.drawable.pic_9,"Gyradiko Bexley", "GB", "Greek", "Bexley", "Hi", "$20 p/p", "4.3", "'Yummy!'"));
        restaurants.add(new Restaurant(R.drawable.pic_10,"Bambino Torino", "BT", "Italian, European", "Newtown", "Hi", "$35 p/p", "3.7", "'One of my absolutes faves! So so good.'"));
        return restaurants;
    }

}
