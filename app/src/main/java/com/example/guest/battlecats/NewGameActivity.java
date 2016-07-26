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
    @Bind(R.id.tableLayout1) TableLayout mTableLayout1;
    ArrayList<Ship> ships = new ArrayList();
    int[] ship2numbers = {09,19,29,39,49,59,69,79,89,99};


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

    public void shipSetter(ArrayList<Ship> ships){
        for (Ship ship : ships) {
            Random r = new Random();
            int n = r.nextInt(2);
            if (n == 0) { //Lay Horizontal
                if (ship.getLength() == 2) {
                    int rando = getRandomStart();
                        if (!(ship2numbers.equals(rando))) {
                            System.out.println("hELLO");
                    }
//                    start over;
                }
//                if (ship.getLength() == 3) {
//                    Integer rando = getRandomStart();
//                    startingPosition.charAt(1) != 8,9;
//                    start over;
//                }
//                if (ship.getLength() == 4) {
//                    Integer rando = getRandomStart();
//                    startingPosition.charAt(1) != 7,8,9;
//                    start over;
//                }
//                if (ship.getLength() == 5) {
//                    Integer rando = getRandomStart();
//                    startingPosition.charAt(1) != 6,7,8,9,10;
//                    start over;
//                }

            }

//
//            else if (n == 1) { //Lay vertical
//                if (ships(i).getLength == 2) {
//                    startingPosition.charAt(0) != 9;
//                    start over;
//
//                } else if (ships(i).getLength == 3) {
//                    startingPosition.charAt(0) != 8,9;
//                    start over;
//
//                } else if (ships(i).getLength == 4) {
//                    startingPosition.charAt(0) != 7,8,9;
//                    start over;
//
//                } else if (ships(i).getLength == 5) {
//                    startingPosition.charAt(0) != 6,7,8,9;
//                    start over;
//
//                } else {
//                    run actual method;
//                }
//            }
        }
}
    public int getRandomStart() {
        Random r = new Random();
        int n = r.nextInt(100);
        return n;
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

};

