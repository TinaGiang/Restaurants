package au.edu.unsw.infs3634.restaurants;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

// The Adapter connects the Restaurant data set to the RecyclerView

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {
    private ArrayList<Restaurant> vRestaurants;
    private RecyclerViewClickListener vListener;

    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }

    public RestaurantAdapter(ArrayList<Restaurant> restaurants, RecyclerViewClickListener listener) {
        vRestaurants = restaurants;
        vListener = listener;
    }

    // This shows how data is taken from the adapter view and used by the RecyclerView

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView picture;
        public TextView name, cuisine, location, ratingScore;
        private RecyclerViewClickListener vListener;

        public RestaurantViewHolder(View v, RecyclerViewClickListener listener) {
            super(v);
            vListener = listener;
            v.setOnClickListener(this);
            picture = v.findViewById(R.id.pictureList);
            name = v.findViewById(R.id.restaurantName);
            cuisine = v.findViewById(R.id.restaurantCuisine);
            location = v.findViewById(R.id.restaurantLocation);
            ratingScore = v.findViewById(R.id.ratingScore);
        }
        @Override
        public void onClick(View v) {
            vListener.onClick(v, getAdapterPosition());
        }
    }

    // This method inflates restaurant_list_row.xml for the data
    // It gets the XML and converts it into Java code

    @Override
    public RestaurantAdapter.RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_row, parent, false);
        return new RestaurantViewHolder(v, vListener);
    }

    // This method pulls data from Restaurant and fills in the contents on the screen
    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position) {
        Restaurant restaurant = vRestaurants.get(position);
        holder.picture.setImageResource(restaurant.getPicture());
        holder.name.setText(restaurant.getName());
        holder.cuisine.setText(restaurant.getCuisine());
        holder.location.setText(restaurant.getLocation());
        holder.ratingScore.setText(restaurant.getRating());
    }

    // This method returns the size of Restaurant
    @Override
    public int getItemCount() {
        return vRestaurants.size();
    }
}
