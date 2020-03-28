package au.edu.unsw.infs3634.restaurants;

import android.widget.ImageView;

import java.util.ArrayList;

public class Restaurant {

    private int picture;
    private String name;
    private String cuisine;
    private String location;
    private String description;
    private String averageCost;
    private String rating;
    private String thoughts;

    public Restaurant(){
    }

    public Restaurant(int picture, String name, String cuisine, String location,
                      String description, String averageCost, String rating, String thoughts){
        this.picture = picture;
        this.name = name;
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
        restaurants.add(new Restaurant(R.drawable.pic_1, "Don Peppino's", "Italian", "Paddington",
                "Prepare to be amazed by the ever-changing menu ranging from trout to pasta to the best wine money can buy. Don Peppino’s may be a pop up but it is definitely worth a try.",
                "$50 p/p", "4.4", "'Absolutely amazing.'"));
        restaurants.add(new Restaurant(R.drawable.pic_2,"Barzaari", "Middle Eastern", "Marrickville",
                "Eastern Mediterranean food right at your doorstep. This is your chance to discover some truly hearty and healthy flavours. You name it, they got it.",
                "$40 p/p", "4.2", "'Simply superb!'"));
        restaurants.add(new Restaurant(R.drawable.pic_3,"La Vita Mediterranean", "Italian, Middle Eastern", "Edensor Park",
                "Up for some carbs? This place will certainly not disappoint. Nice, creamy pasta. Fresh pizza straight from the oven. Beware of falling into a food coma.",
                "$30 p/p", "4.2", "'Truly the best in the West.'"));
        restaurants.add(new Restaurant(R.drawable.pic_4,"Guo's Noodle House", "Chinese", "Hurstville",
                "Feeling a little cold inside and need something to warm you up? Look no further. Guo’s Noodle House offers noodles and soups so divine you’ll simply melt into your seat.",
                "$15 p/p", "3.8", "'Best noodle house to ever exist!'"));
        restaurants.add(new Restaurant(R.drawable.pic_5,"Alexandra Hotel","Modern Australian", "Leura",
                "Want to have a try of that classic Australian food that everyone is raving about? Look no further. Alexandra Hotel is sure to satisfy your cravings.",
                "$30 p/p", "3.9", "'Food coma alert!'"));
        restaurants.add(new Restaurant(R.drawable.pic_6,"Kittyhawk", "French", "Central Business District",
                "Prepare to be amazed. This bar/restaurant is thriving on drinks that are so unique and creative they will simply blow your mind. Classic French dishes offered will surely meet your satisfaction. ",
                "$30 p/p", "4.0", "'Bonjour j'aime la nourriture ici!!'"));
        restaurants.add(new Restaurant(R.drawable.pic_7,"Fujiyama Restaurant", "Japanese", "Summer Hill",
                "Craving some fresh sushi and sashimi? This is your place! A lovely Japanese hotspot right in the heart of Summer Hill. The ambience and warmth offered at Fujiyama Restaurant can simply not be beaten.",
                "$25 p/p", "4.1", "'All I can say is wow. You won't be let down.'"));
        restaurants.add(new Restaurant(R.drawable.pic_8,"Gami Chicken & Beer", "Korean", "Castle Hill",
                "Keen for some chicken, beer and a good time? Try one of the best fried chicken and beer joints in Sydney! The chicken is so succulent you’ll want to scream of pure joy and satisfaction.",
                "$35 p/p", "4.2", "'Scrumptious! What are you waiting for?'"));
        restaurants.add(new Restaurant(R.drawable.pic_9,"Gyradiko Bexley", "Greek", "Bexley",
                "This authentic Greek spot will have you jumping with joy. Pita so fluffy and filled with juicy chicken or pork; you will be left wanting more. Gyradiko will definitely hit that sweet spot.",
                "$20 p/p", "4.3", "'Yummy!'"));
        restaurants.add(new Restaurant(R.drawable.pic_10,"Bambino Torino", "Italian, European", "Newtown",
                "Up for some classic gourmet pizzas, pastas and steaks? It’s a date. Food so good you’ll be left reeling from the experience. Bambino Torino will not let you down.",
                "$35 p/p", "3.7", "'One of my absolutes faves! So so good.'"));
        return restaurants;
    }

}
