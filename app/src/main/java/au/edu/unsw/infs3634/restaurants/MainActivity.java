package au.edu.unsw.infs3634.restaurants;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    public static final String EXTRA_MESSAGE = "au.edu.unsw.infs3624.beers.MESSAGE";
    private RecyclerView vRecyclerView;
    private RecyclerView.Adapter vAdapter;
    private RecyclerView.LayoutManager vLayoutManager;

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

    private void launchDetailActivity(int position) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(EXTRA_MESSAGE, position);
        startActivity(intent);
    }

    private void launchDetailActivity(String message) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}

/*RestaurantAdapter.RecyclerViewClickListener listener = new RestaurantAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Restaurant item = Restaurant.getRestaurants().get(position);
                Intent intent = new Intent(MainActivity.this, DetailActivity.class); //need to specify parent view group
                intent.putExtra(DetailFragment.ID_DESC, item.getDescription());
                intent.putExtra(DetailFragment.ID_AVG, item.getAverageCost());
                intent.putExtra(DetailFragment.ID_RATING, item.getRating());
                startActivity(intent);
            }
        };*/

//RecyclerView recyclerView = findViewById(R.id.resList);
//recyclerView.setAdapter(new RestaurantAdapter(Restaurant.getRestaurants(), listener));

        /*RecyclerView mRecyclerView = findViewById(R.id.resList);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager vLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(vLayoutManager);
        RecyclerView.Adapter mAdapter = new RestaurantAdapter(this, Restaurant.getRestaurants());
        mRecyclerView.setAdapter(mAdapter);*/