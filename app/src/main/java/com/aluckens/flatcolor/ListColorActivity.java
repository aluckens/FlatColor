package com.aluckens.flatcolor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Comparator;

public class ListColorActivity extends AppCompatActivity {
    ListView listColor;
    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_color);
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        listColor = findViewById(R.id.MyList);
        listColors();
        arrayAdapter = new MyAdapter(this, R.layout.my_item, DataColors.colors);
        listColor.setAdapter(arrayAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem m1 = menu.add("About");
        m1.setShowAsAction(m1.SHOW_AS_ACTION_ALWAYS);
        m1.setIcon(R.drawable.ic_info_outline);
        m1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                new InfoDialog().showDialog(ListColorActivity.this);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }


    private void listColors() {
        DataColors.colors.clear();
        DataColors.colors.add(new Color("Peach-colored", "#F47983"));
        DataColors.colors.add(new Color("Red plum colored", "#DB5A6B"));
        DataColors.colors.add(new Color("Medium crimson", "#C93756"));
        DataColors.colors.add(new Color("Cherry blossom color", "#FCC9B9"));
        DataColors.colors.add(new Color("Washed-out crimson", "#FFB3A7"));
        DataColors.colors.add(new Color("RADICAL RED", "#F62459"));
        DataColors.colors.add(new Color("Ibis wing color", "#F58F84"));
        DataColors.colors.add(new Color("Foreign crimson", "#C91F37"));
        DataColors.colors.add(new Color("Red orange", "#DC3023"));
        DataColors.colors.add(new Color("Cochineal red", "#9D2933"));
        DataColors.colors.add(new Color("Monza", "#CF000F"));
        DataColors.colors.add(new Color("Brewed mustard-brown", "#E68364"));
        DataColors.colors.add(new Color("Pomegranate", "#F22613"));
        DataColors.colors.add(new Color("Scarlet", "#CF3A24"));
        DataColors.colors.add(new Color("Pure crimson", "#C3272B"));
        DataColors.colors.add(new Color("True red", "#8F1D21"));
        DataColors.colors.add(new Color("Chestnut Rose", "#D24D57"));
        DataColors.colors.add(new Color("One kin dye", "#F08F90"));
        DataColors.colors.add(new Color("Wisteria purple", "#875F9A"));
        DataColors.colors.add(new Color("Bellflower color", "#5D3F6A"));
        DataColors.colors.add(new Color("Wisteria color", "#89729E"));
        DataColors.colors.add(new Color("Iris color", "#763568"));
        DataColors.colors.add(new Color("Tatarian aster color", "#8D608C"));
        DataColors.colors.add(new Color("Thin color", "#A87CA0"));
        DataColors.colors.add(new Color("Violet color", "#5B3256"));
        DataColors.colors.add(new Color("MEDIUM PURPLE", "#BF55EC"));
        DataColors.colors.add(new Color("STUDIO", "#8E44AD"));
        DataColors.colors.add(new Color("WISTERIA", "#9B59B6"));
        DataColors.colors.add(new Color("LIGHT WISTERIA", "#BE90D4"));
        DataColors.colors.add(new Color("Sky color", "#4D8FAC"));
        DataColors.colors.add(new Color("Ultramarine color", "#5D8CAE"));
        DataColors.colors.add(new Color("PICTON BLUE", "#22A7F0"));
        DataColors.colors.add(new Color("DODGER BLUE", "#19B5FE"));
        DataColors.colors.add(new Color("PICTON BLUE", "#59ABE3"));
        DataColors.colors.add(new Color("Light blue color", "#48929B"));
        DataColors.colors.add(new Color("Thousand herb", "#317589"));
        DataColors.colors.add(new Color("JORDY BLUE", "#89C4F4"));
        DataColors.colors.add(new Color("STEEL BLUE", "#4B77BE"));
        DataColors.colors.add(new Color("Lapis lazuli color", "#1F4788"));
        DataColors.colors.add(new Color("Navy blue color", "#003171"));
        DataColors.colors.add(new Color("Hanada", "#044F67"));
        DataColors.colors.add(new Color("Indigo color", "#264348"));
        DataColors.colors.add(new Color("Siskin sprout yellow", "#7A942E"));
        DataColors.colors.add(new Color("young green onion", "#8DB255"));
        DataColors.colors.add(new Color("Fresh onion", "#5B8930"));
        DataColors.colors.add(new Color("Young bamboo color", "#6B9362"));
        DataColors.colors.add(new Color("Patina", "#407A52"));
        DataColors.colors.add(new Color("Green bamboo", "#006442"));
        DataColors.colors.add(new Color("GOSSIP", "#87D37C"));
        DataColors.colors.add(new Color("EUCALYPTUS", "#26A65B"));
        DataColors.colors.add(new Color("JUNGLE GREEN", "#26C281"));
        DataColors.colors.add(new Color("OBSERVATORY", "#049372"));
        DataColors.colors.add(new Color("JUNGLE GREEN", "#2ABB9B"));
        DataColors.colors.add(new Color("MOUNTAIN MEADOW", "#16A085"));
        DataColors.colors.add(new Color("TURQUOISE", "#36D7B7"));
        DataColors.colors.add(new Color("FREE SPEECH AQUAMARINE", "#03A678"));
        DataColors.colors.add(new Color("OCEAN GREEN", "#4DAF7C"));
        DataColors.colors.add(new Color("Patrinia flowers", "#D9B611"));
        DataColors.colors.add(new Color("Amur cork tree", "#F3C13A"));
        DataColors.colors.add(new Color("RIPE LEMON", "#F7CA18"));
        DataColors.colors.add(new Color("Japanese triandra grass", "#E2B13C"));
        DataColors.colors.add(new Color("Rapeseed oil-colored", "#A17917"));
        DataColors.colors.add(new Color("CREAM CAN", "#F5D76E"));
        DataColors.colors.add(new Color("SAFFRON", "#F4D03F"));
        DataColors.colors.add(new Color("Bright golden yellow", "#FFA400"));
        DataColors.colors.add(new Color("Sumac-dyed", "#E08A1E"));
        DataColors.colors.add(new Color("Gamboge", "#FFB61E"));
        DataColors.colors.add(new Color("Corn-colored", "#FAA945"));
        DataColors.colors.add(new Color("Egg-colored", "#FFA631"));
        DataColors.colors.add(new Color("Floral leaf-colored", "#FFB94E"));
        DataColors.colors.add(new Color("Golden fallen leaves", "#E29C45"));
        DataColors.colors.add(new Color("ECSTASY", "#F9690E"));
        DataColors.colors.add(new Color("Amber", "#CA6924"));
        DataColors.colors.add(new Color("LIGHTNING YELLOW", "#F5AB35"));
        DataColors.colors.add(new Color("SILVER", "#BFBFBF"));
        DataColors.colors.add(new Color("CARARRA", "#F2F1EF"));
        DataColors.colors.add(new Color("SILVER SAND", "#BDC3C7"));
        DataColors.colors.add(new Color("PORCELAIN", "#ECF0F1"));
        DataColors.colors.add(new Color("PUMICE", "#D2D7D3"));
        DataColors.colors.add(new Color("Harbor rat", "#757D75"));
        DataColors.colors.add(new Color("GALLERY", "#EEEEEE"));
        DataColors.colors.add(new Color("EDWARD", "#ABB7B7"));
        DataColors.colors.add(new Color("LYNCH", "#6C7A89"));
        DataColors.colors.add(new Color("CASCADE", "#95A5A6"));
    }
}
