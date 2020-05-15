package tugas.uas.ngodingyuks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

import tugas.uas.ngodingyuks.adapter.CardViewBahasaAdapter;
import tugas.uas.ngodingyuks.adapter.GridBahasaAdapter;
import tugas.uas.ngodingyuks.adapter.ListBahasaAdapter;
import tugas.uas.ngodingyuks.adapter.OnItemClickCallback;

public class MainActivity extends AppCompatActivity {
    private RecyclerView r_bahasa;
    private ArrayList<Bahasa> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r_bahasa = findViewById(R.id.r_bahasa);
        r_bahasa.setHasFixedSize(true);

        list.addAll(DataBahasa.getListData());
        showRecyclerList();
    }

    //Menampilkan ListView
    private void showRecyclerList(){
        r_bahasa.setLayoutManager(new LinearLayoutManager(this));
        ListBahasaAdapter listBahasaAdapter = new ListBahasaAdapter(list);
        r_bahasa.setAdapter(listBahasaAdapter);

        listBahasaAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Bahasa bahasa) {
                Intent moveIntent1 = new Intent(MainActivity.this, DetailBahasa.class);
                moveIntent1.putExtra(DetailBahasa.ITEM_EXTRA, bahasa);
                startActivity(moveIntent1);
            }
        });
    }

    //Menampilkan GridView
    private void showRecyclerGrid(){
        r_bahasa.setLayoutManager(new GridLayoutManager(this, 2));
        GridBahasaAdapter gridBahasaAdapter = new GridBahasaAdapter(list);
        r_bahasa.setAdapter(gridBahasaAdapter);

        gridBahasaAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Bahasa bahasa) {
                Intent moveIntent1 = new Intent(MainActivity.this, DetailBahasa.class);
                moveIntent1.putExtra(DetailBahasa.ITEM_EXTRA, bahasa);
                startActivity(moveIntent1);
            }
        });
    }

    //Menampilkan CardView
    private void showRecyclerCardView(){
        r_bahasa.setLayoutManager(new LinearLayoutManager(this));
        CardViewBahasaAdapter cardViewBahasaAdapter = new CardViewBahasaAdapter(list);
        r_bahasa.setAdapter(cardViewBahasaAdapter);

        cardViewBahasaAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Bahasa bahasa) {
                Intent moveIntent1 = new Intent(MainActivity.this, DetailBahasa.class);
                moveIntent1.putExtra(DetailBahasa.ITEM_EXTRA, bahasa);
                startActivity(moveIntent1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.kontak_id) {
            Intent moveIntent = new Intent(MainActivity.this, ActivityTentang.class);
            startActivity(moveIntent);
        } else {
            setMode(item.getItemId());
        }
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                showRecyclerCardView();
                break;
        }
    }
}
