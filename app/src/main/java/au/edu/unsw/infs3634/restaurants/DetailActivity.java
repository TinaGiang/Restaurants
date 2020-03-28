package au.edu.unsw.infs3634.restaurants;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class DetailActivity extends AppCompatActivity {

    private ImageView vPictureDetail;
    private TextView vResName;
    private TextView vDescription;
    private TextView vAverageCost;
    private TextView vThoughts;

    private static final String TAG = "DetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        vResName = findViewById(R.id.resName);
        vPictureDetail = findViewById(R.id.pictureDetail);
        vDescription = findViewById(R.id.descriptionText);
        vAverageCost = findViewById(R.id.averageCostAmount);
        vThoughts = findViewById(R.id.thoughtsText);

        Intent intent = getIntent();
        int position = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
        final Restaurant restaurant = Restaurant.getRestaurants().get(position);

        vPictureDetail.setImageResource(restaurant.getPicture());
        vResName.setText(restaurant.getName());
        vDescription.setText(restaurant.getDescription());
        vAverageCost.setText(restaurant.getAverageCost());
        vThoughts.setText(restaurant.getThoughts());
    }
}










