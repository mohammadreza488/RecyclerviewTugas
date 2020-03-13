package id.ac.polinema.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.adapters.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.models.TeamLogo;
import id.ac.polinema.recyclerview.models.teamitem;

public class FastAdapterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fastadapter);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        ItemAdapter itemAdapter = new ItemAdapter<>();
        FastAdapter fastAdapter = FastAdapter.with(itemAdapter);

        List teams = new ArrayList<>();
        teams.add(new teamitem("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool"));
        teams.add(new teamitem("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City"));
        teams.add(new teamitem("https://upload.wikimedia.org/wikipedia/en/thumb/c/c2/Arema_FC_2017_logo.svg/800px-Arema_FC_2017_logo.svg.png", "Arema FC"));
        teams.add(new teamitem("https://upload.wikimedia.org/wikipedia/en/thumb/5/5e/Bali_United_logo.svg/800px-Bali_United_logo.svg.png", "Bali United"));
        itemAdapter.add(teams);
        teamsView.setAdapter(fastAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);


    }
}
