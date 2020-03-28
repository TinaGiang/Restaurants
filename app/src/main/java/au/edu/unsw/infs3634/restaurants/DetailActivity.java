package au.edu.unsw.infs3634.restaurants;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class DetailActivity extends AppCompatActivity {
    private TextView vName;
    private TextView vSymbol;
    private TextView vCuisine;
    private TextView vLocation;
    private TextView vDescription;
    private TextView vAverageCost;
    private TextView vRating;
    private Button vSearch;

    private static final String TAG = "DetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        vName = findViewById(R.id.restaurantName);
        //vSymbol = findViewById(R.id.symbol);
        vCuisine = findViewById(R.id.restaurantCuisine);
        vLocation = findViewById(R.id.restaurantLocation);
        vDescription = findViewById(R.id.descriptionText);
        vAverageCost = findViewById(R.id.averageCostAmount);
        vRating = findViewById(R.id.ratingScore);
        vSearch = findViewById(R.id.searchButton);

        Intent intent = getIntent();
        int position = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        final Restaurant restaurant = Restaurant.getRestaurants().get(position);

        vName.setText(restaurant.getName());
        vCuisine.setText(restaurant.getCuisine());
        vLocation.setText(restaurant.getLocation());
        vDescription.setText(restaurant.getDescription());
        vAverageCost.setText(formatter.format(restaurant.getAverageCost()));
        vRating.setText(formatter.format(restaurant.getRating()));

        vSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchRestaurant(restaurant.getName());
            }
        });

    }

    private void searchRestaurant(String name) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=" + name));
        startActivity(intent);
    }
}

    /*private TextView vName;
    private TextView vCuisine;
    private TextView vLocation;

    private static final String TAG = "DetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        vName = findViewById(R.id.restaurantName);
        vCuisine = findViewById(R.id.restaurantCuisine);
        vLocation = findViewById(R.id.restaurantLocation);

        Intent intent = getIntent();
        int position = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);

        final Restaurant restaurant = Restaurant.getRestaurants().get(position);

        vName.setText(restaurant.getName());
        vCuisine.setText(restaurant.getCuisine());
        vLocation.setText(restaurant.getLocation());*/

        /*mSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchCoin(coin.getName());
            }
        });*/









