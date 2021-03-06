package id.ac.polinema.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapters.ExerciseAdapter;
import id.ac.polinema.recyclerview.models.exercise;

public class ExerciseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<exercise> teams = new ArrayList<>();
        teams.add(new exercise("A City Living Under the Shadow", "RBC News", "https://www.commongood.org/wp-content/uploads/2019/06/cnn-logo-circle-icon-png-12.png"));
        teams.add(new exercise("One Problem for Democratic Leaders", "NY Times", "https://i0.wp.com/equator.co.id/wp-content/uploads/2018/09/nytimes-logo-png-the-new-york-times-international-weekly-brands-of-the-world-1320.png?fit=800%2C800&ssl=1"));
        teams.add(new exercise("The Golden Secret to Better Breakfast", "BBC World", "https://toppng.com/public/uploads/preview/bbc-news-logo-png-bbc-world-channel-logo-11563049882jqyf96g6u7.png"));
        teams.add(new exercise("How to Plan Your First Ski Vacation", "NBC Nightly", "https://upload.wikimedia.org/wikipedia/commons/9/9f/NBC_News_2013_logo.png"));
        teams.add(new exercise("How Social Isolaton is Killing Us", "RBC News", "https://upload.wikimedia.org/wikipedia/en/thumb/7/7f/RBC_Royal_Bank.svg/1200px-RBC_Royal_Bank.svg.png"));
        teams.add(new exercise("Use Labels to Sort Messages in Facebook", "BBC World", "https://toppng.com/public/uploads/preview/bbc-news-logo-png-bbc-world-channel-logo-11563049882jqyf96g6u7.png"));


       ExerciseAdapter adapter = new ExerciseAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}
