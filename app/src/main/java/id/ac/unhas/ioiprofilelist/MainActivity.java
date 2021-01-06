package id.ac.unhas.ioiprofilelist;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import id.ac.unhas.ioiprofilelist.adapter.CardViewMemberAdapter;
import id.ac.unhas.ioiprofilelist.adapter.GridMemberAdapter;
import id.ac.unhas.ioiprofilelist.adapter.ListMemberAdapter;
import id.ac.unhas.ioiprofilelist.model.Member;
import id.ac.unhas.ioiprofilelist.model.MemberData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //deklarasi recycler view
    private RecyclerView rvMembers;
    private ArrayList<Member> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMembers = findViewById(R.id.rv_list_item);
        rvMembers.setHasFixedSize(true);

        list.addAll(MemberData.getListData());
        showRecyclerCardView();

    }

    private void showRecyclerList() {
        rvMembers.setLayoutManager(new LinearLayoutManager(this));
        ListMemberAdapter ListMemberAdapter = new ListMemberAdapter(list);
        rvMembers.setAdapter(ListMemberAdapter);

        ListMemberAdapter.setOnItemClickCallback(new ListMemberAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Member data) {
                showSelectedMember(data);
            }
        });
    }

    private void showRecyclerGrid() {
        rvMembers.setLayoutManager(new GridLayoutManager(this, 2));
        GridMemberAdapter gridHeroAdapter = new GridMemberAdapter(list);
        rvMembers.setAdapter(gridHeroAdapter);

        gridHeroAdapter.setOnItemClickCallback(new GridMemberAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Member data) {
                showSelectedMember(data);
            }
        });
    }

    private void showRecyclerCardView() {
        rvMembers.setLayoutManager(new LinearLayoutManager(this));
        CardViewMemberAdapter cardViewMemberAdapter = new CardViewMemberAdapter(list);
        rvMembers.setAdapter(cardViewMemberAdapter);

        cardViewMemberAdapter.setOnItemClickCallback(new CardViewMemberAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Member data) {
                showSelectedMember(data);
            }
        });
    }

    private void showSelectedMember(Member Member) {
        Toast.makeText(this, "You choose " + Member.getNamaMember(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.menu_about:
                Intent goToAbout = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(goToAbout);
                break;
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