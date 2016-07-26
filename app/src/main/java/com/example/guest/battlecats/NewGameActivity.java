package com.example.guest.battlecats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;

public class NewGameActivity extends AppCompatActivity {
    private String mCellId;
    @Bind(R.id.tableLayout1)
    TableLayout mTableLayout1;
    ArrayList ships = new ArrayList();
    HashMap<String, String> grid = new HashMap<>();
    grid.add("","");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        ButterKnife.bind(this);
        Ship ship1 = new Ship(3, "Submarine");
        Ship ship2 = new Ship(2, "Destroyer");
        Ship ship3 = new Ship(4, "Cruiser");
        Ship ship4 = new Ship(3, "Troller");
        Ship ship5 = new Ship(5, "God of War");
        ships.add(ship1);
        ships.add(ship2);
        ships.add(ship3);
        ships.add(ship4);
        ships.add(ship5);
        shipSetter(ships);
    }

    public void shipSetter(ArrayList ships){
        for(int i = 0; i<ships.size(); i++) {
            Random r = new Random();
            int n = r.nextInt(2);
            if (n == 0) {
                //Lay Horizontal
                Random rand = new Random();
                int m = rand.nextInt(100);
                for(int j =0; j<grid.size(); j++){
                 grid(j).setShip(i);
                }
            } else if (n == 1) {
                //Lay Vertical
                Toast.makeText(NewGameActivity.this, "Vertical", Toast.LENGTH_SHORT).show();
            }
        }
}

    public void boxSelect(View v) {
        String gridId = this.mCellId;
//        if (areThereShips(gridId)) {
////            mark with red;
////            toast "hit";
//        } else {
////            mark with white;
////            toast "miss"
//        }
        Log.d("Something", "happened");
    }
//
////    public boolean areThereShips(String gridId) {
////        if(gridId.shipPresent()){
////            return true;
////        }else{
////            return false;
////        }
////    }

}

