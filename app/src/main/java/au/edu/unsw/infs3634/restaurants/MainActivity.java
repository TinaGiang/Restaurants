package au.edu.unsw.infs3634.restaurants;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    public static final String EXTRA_MESSAGE = "au.edu.unsw.infs3624.beers.MESSAGE";
    private RecyclerView vRecyclerView;
    private RecyclerView.Adapter vAdapter;
    private RecyclerView.LayoutManager vLayoutManager;

    // This method is where the activity is initialised
    // The RecyclerView is instantiated and it declares what happens when an item in the RecyclerView is clicked on

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate Called");
        setContentView(R.layout.activity_main);

        vRecyclerView = findViewById(R.id.restaurantsList);
        vRecyclerView.setHasFixedSize(true);
        vLayoutManager = new LinearLayoutManager(this);
        vRecyclerView.setLayoutManager(vLayoutManager);
        RestaurantAdapter.RecyclerViewClickListener listener = new RestaurantAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                launchDetailActivity(position);
            }
        };

        vAdapter = new RestaurantAdapter(Restaurant.getRestaurants(), listener);
        vRecyclerView.setAdapter(vAdapter);
    }

    // This method starts a new instance of an activity by passing the intent to start the activity
    // It links to the DetailActivity class

    private void launchDetailActivity(int position) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(EXTRA_MESSAGE, position);
        startActivity(intent);
    }
}

