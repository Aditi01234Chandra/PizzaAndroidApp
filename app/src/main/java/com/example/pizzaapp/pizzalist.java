package com.example.pizzaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class pizzalist extends AppCompatActivity {
    ListView list;
    String data[]={"Paneer Tikka Pizza","Chicken Tikka Pizza","Paneer Pizza","Cheese Pizza","Double Cheese Pizza","Cheese Burst Pizza","Chilli Paneer Pizza","Chilli Mushroom Pizza","Chicken Tandoor Pizza","Barbeque Chicken Pizza"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizzalist);
        list=(ListView)findViewById(R.id.list_item);
        ArrayAdapter adapter=new ArrayAdapter(pizzalist.this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Toast.makeText(pizzalist.this,"Rs. 250", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(pizzalist.this,"Rs. 300", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(pizzalist.this,"Rs. 165", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(pizzalist.this,"Rs. 170", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(pizzalist.this,"Rs. 200", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(pizzalist.this,"Rs. 290", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(pizzalist.this,"Rs. 280", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(pizzalist.this,"Rs. 320", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(pizzalist.this,"Rs. 360", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Toast.makeText(pizzalist.this,"Rs. 310", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
