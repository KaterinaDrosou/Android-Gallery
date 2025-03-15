package com.unipi.katerina.androidgallery;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //    Drop down list items
    String[] item = {"Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso", "Salvador Dalí", "Michelangelo"};

    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItems;

    //    Save user's choice
    String selectedPainter = "" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        autoCompleteTextView = findViewById(R.id.auto_complete_txt);
        adapterItems = new ArrayAdapter<String>(this, R.layout.list_item, item);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selectedPainter = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this, "Item: "+ selectedPainter, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void go2(View view){
        Intent intent;
        switch (selectedPainter) {
            case "Leonardo da Vinci":
                intent =new Intent(this, LeonardoDaVinci.class);
                break;
            case "Vincent van Gogh":
                intent =new Intent(this, VincentVanGogh.class);
                break;
            case "Pablo Picasso":
                intent =new Intent(this, PabloPicasso.class);
                break;
            case "Salvador Dalí":
                intent =new Intent(this, SalvadorDalí.class);
                break;
            case "Michelangelo":
                intent =new Intent(this, Michelangelo.class);
                break;
            default:
                showMessage("Warning", "Empty selection");
                return;
        }

        startActivity(intent);
    }

    private void showMessage(String title, String message){
        new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(message)
                .show();
    }
}