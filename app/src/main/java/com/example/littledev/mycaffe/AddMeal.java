package com.example.littledev.mycaffe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LittleDev on 4/24/2017.
 */

public class AddMeal extends AppCompatActivity {

    private Button add_2, add_3, add_4, add_5, add_6, add_7, add_8, add_9, add_10, minus_2, minus_3, minus_4, minus_5, minus_6, minus_7, minus_8, minus_9, minus_10;
    private EditText price, name, ingredient_1, ingredient_2, ingredient_3, ingredient_4, ingredient_5, ingredient_6, ingredient_7, ingredient_8, ingredient_9, ingredient_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_meal);
        price = (EditText) findViewById(R.id.meal_price);
        name = (EditText) findViewById(R.id.meal_name);
        add_2 = (Button) findViewById(R.id.add_2);
        add_3 = (Button) findViewById(R.id.add_3);
        add_4 = (Button) findViewById(R.id.add_4);
        add_5 = (Button) findViewById(R.id.add_5);
        add_6 = (Button) findViewById(R.id.add_6);
        add_7 = (Button) findViewById(R.id.add_7);
        add_8 = (Button) findViewById(R.id.add_8);
        add_9 = (Button) findViewById(R.id.add_9);
        add_10 = (Button) findViewById(R.id.add_10);
        minus_2 = (Button) findViewById(R.id.minus_2);
        minus_3 = (Button) findViewById(R.id.minus_3);
        minus_4 = (Button) findViewById(R.id.minus_4);
        minus_5 = (Button) findViewById(R.id.minus_5);
        minus_6 = (Button) findViewById(R.id.minus_6);
        minus_7 = (Button) findViewById(R.id.minus_7);
        minus_8 = (Button) findViewById(R.id.minus_8);
        minus_9 = (Button) findViewById(R.id.minus_9);
        minus_10 = (Button) findViewById(R.id.minus_10);
        ingredient_1 = (EditText) findViewById(R.id.ingredient_1);
        ingredient_2 = (EditText) findViewById(R.id.ingredient_2);
        ingredient_3 = (EditText) findViewById(R.id.ingredient_3);
        ingredient_4 = (EditText) findViewById(R.id.ingredient_4);
        ingredient_5 = (EditText) findViewById(R.id.ingredient_5);
        ingredient_6 = (EditText) findViewById(R.id.ingredient_6);
        ingredient_7 = (EditText) findViewById(R.id.ingredient_7);
        ingredient_8 = (EditText) findViewById(R.id.ingredient_8);
        ingredient_9 = (EditText) findViewById(R.id.ingredient_9);
        ingredient_10 = (EditText) findViewById(R.id.ingredient_10);
    }

    private List<String> getIngredientList(){
        List<String> ingredients = new ArrayList<>();
        if (!ingredient_1.getText().toString().equals(""))
            ingredients.add(ingredient_1.getText().toString());
        else if (!ingredient_3.getText().toString().equals(""))
            ingredients.add(ingredient_3.getText().toString());
        else if (!ingredient_4.getText().toString().equals(""))
            ingredients.add(ingredient_4.getText().toString());
        else if (!ingredient_5.getText().toString().equals(""))
            ingredients.add(ingredient_5.getText().toString());
        else if (!ingredient_6.getText().toString().equals(""))
            ingredients.add(ingredient_6.getText().toString());
        else if (!ingredient_7.getText().toString().equals(""))
            ingredients.add(ingredient_7.getText().toString());
        else if (!ingredient_8.getText().toString().equals(""))
            ingredients.add(ingredient_8.getText().toString());
        else if (!ingredient_9.getText().toString().equals(""))
            ingredients.add(ingredient_9.getText().toString());
        else if (!ingredient_10.getText().toString().equals(""))
            ingredients.add(ingredient_10.getText().toString());
        else
            Toast.makeText(this, R.string.cant_be_empty, Toast.LENGTH_LONG).show();
        return ingredients;
    }

    public void addField(View view){
        Log.i("test",view.getTag().toString());
        switch (view.getTag().toString()){
            case "add_2":
            {
                if (ingredient_1.getText().toString().equals("")) {
                    Toast.makeText(this, R.string.empty, Toast.LENGTH_LONG).show();
                    break;
                }
                add_3.setVisibility(View.VISIBLE);
                minus_2.setVisibility(View.VISIBLE);
                ingredient_2.setVisibility(View.VISIBLE);
                add_2.setVisibility(View.GONE);
                break;
            }
            case "add_3":
            {
                if (ingredient_2.getText().toString().equals("")) {
                    Toast.makeText(this, R.string.empty, Toast.LENGTH_LONG).show();
                    break;
                }
                add_4.setVisibility(View.VISIBLE);
                minus_3.setVisibility(View.VISIBLE);
                ingredient_3.setVisibility(View.VISIBLE);
                add_3.setVisibility(View.GONE);
                minus_2.setVisibility(View.GONE);
                break;
            }
            case "add_4":
            {
                if (ingredient_3.getText().toString().equals("")) {
                    Toast.makeText(this, R.string.empty, Toast.LENGTH_LONG).show();
                    break;
                }
                add_5.setVisibility(View.VISIBLE);
                minus_4.setVisibility(View.VISIBLE);
                ingredient_4.setVisibility(View.VISIBLE);
                add_4.setVisibility(View.GONE);
                minus_3.setVisibility(View.GONE);
                break;
            }
            case "add_5":
            {
                if (ingredient_4.getText().toString().equals("")) {
                    Toast.makeText(this, R.string.empty, Toast.LENGTH_LONG).show();
                    break;
                }
                add_6.setVisibility(View.VISIBLE);
                minus_5.setVisibility(View.VISIBLE);
                ingredient_5.setVisibility(View.VISIBLE);
                add_5.setVisibility(View.GONE);
                minus_4.setVisibility(View.GONE);
                break;
            }
            case "add_6":
            {
                if (ingredient_5.getText().toString().equals("")) {
                    Toast.makeText(this, R.string.empty, Toast.LENGTH_LONG).show();
                    break;
                }
                add_7.setVisibility(View.VISIBLE);
                minus_6.setVisibility(View.VISIBLE);
                ingredient_6.setVisibility(View.VISIBLE);
                add_6.setVisibility(View.GONE);
                minus_5.setVisibility(View.GONE);
                break;
            }
            case "add_7":
            {
                if (ingredient_6.getText().toString().equals("")) {
                    Toast.makeText(this, R.string.empty, Toast.LENGTH_LONG).show();
                    break;
                }
                add_8.setVisibility(View.VISIBLE);
                minus_7.setVisibility(View.VISIBLE);
                ingredient_7.setVisibility(View.VISIBLE);
                add_7.setVisibility(View.GONE);
                minus_6.setVisibility(View.GONE);
                break;
            }
            case "add_8":
            {
                if (ingredient_7.getText().toString().equals("")) {
                    Toast.makeText(this, R.string.empty, Toast.LENGTH_LONG).show();
                    break;
                }
                add_9.setVisibility(View.VISIBLE);
                minus_8.setVisibility(View.VISIBLE);
                ingredient_8.setVisibility(View.VISIBLE);
                add_8.setVisibility(View.GONE);
                minus_7.setVisibility(View.GONE);
                break;
            }
            case "add_9":
            {
                if (ingredient_8.getText().toString().equals("")) {
                    Toast.makeText(this, R.string.empty, Toast.LENGTH_LONG).show();
                    break;
                }
                add_10.setVisibility(View.VISIBLE);
                minus_9.setVisibility(View.VISIBLE);
                ingredient_9.setVisibility(View.VISIBLE);
                add_9.setVisibility(View.GONE);
                minus_8.setVisibility(View.GONE);
                break;
            }
            case "add_10":
            {
                if (ingredient_9.getText().toString().equals("")) {
                    Toast.makeText(this, R.string.empty, Toast.LENGTH_LONG).show();
                    break;
                }
                minus_10.setVisibility(View.VISIBLE);
                ingredient_10.setVisibility(View.VISIBLE);
                add_10.setVisibility(View.GONE);
                minus_9.setVisibility(View.GONE);
                break;
            }
            case "minus_2":
            {
                minus_2.setVisibility(View.GONE);
                ingredient_2.setVisibility(View.GONE);
                add_3.setVisibility(View.GONE);
                add_2.setVisibility(View.VISIBLE);
                break;
            }
            case "minus_3":
            {
                minus_3.setVisibility(View.GONE);
                ingredient_3.setVisibility(View.GONE);
                minus_2.setVisibility(View.VISIBLE);
                add_4.setVisibility(View.GONE);
                add_3.setVisibility(View.VISIBLE);
                break;
            }
            case "minus_4":
            {
                minus_4.setVisibility(View.GONE);
                ingredient_4.setVisibility(View.GONE);
                minus_3.setVisibility(View.VISIBLE);
                add_5.setVisibility(View.GONE);
                add_4.setVisibility(View.VISIBLE);
                break;
            }
            case "minus_5":
            {
                minus_5.setVisibility(View.GONE);
                ingredient_5.setVisibility(View.GONE);
                minus_4.setVisibility(View.VISIBLE);
                add_6.setVisibility(View.GONE);
                add_5.setVisibility(View.VISIBLE);
                break;
            }
            case "minus_6":
            {
                minus_6.setVisibility(View.GONE);
                ingredient_6.setVisibility(View.GONE);
                minus_5.setVisibility(View.VISIBLE);
                add_7.setVisibility(View.GONE);
                add_6.setVisibility(View.VISIBLE);
                break;
            }
            case "minus_7":
            {
                minus_7.setVisibility(View.GONE);
                ingredient_7.setVisibility(View.GONE);
                minus_6.setVisibility(View.VISIBLE);
                add_8.setVisibility(View.GONE);
                add_7.setVisibility(View.VISIBLE);
                break;
            }
            case "minus_8":
            {
                minus_8.setVisibility(View.GONE);
                ingredient_8.setVisibility(View.GONE);
                minus_7.setVisibility(View.VISIBLE);
                add_9.setVisibility(View.GONE);
                add_8.setVisibility(View.VISIBLE);
                break;
            }
            case "minus_9":
            {
                minus_9.setVisibility(View.GONE);
                ingredient_9.setVisibility(View.GONE);
                minus_8.setVisibility(View.VISIBLE);
                add_10.setVisibility(View.GONE);
                add_9.setVisibility(View.VISIBLE);
                break;
            }
            case "minus_10":
            {
                minus_10.setVisibility(View.GONE);
                ingredient_10.setVisibility(View.GONE);
                minus_9.setVisibility(View.VISIBLE);
                add_10.setVisibility(View.VISIBLE);
                break;
            }
        }
    }

    public void onFinish(View view){
        if (name.getText().toString().equals("")) {
            Toast.makeText(this, R.string.empty_name, Toast.LENGTH_LONG).show();
            return;
        }
        if (price.getText().toString().equals("")) {
            Toast.makeText(this, R.string.empty_price, Toast.LENGTH_LONG).show();
            return;
        }
        List<String> list = getIngredientList();
        DBM database = new DBM(this);
        database.onAddMeal(name.getText().toString(), list, price.getText().toString());
    }
}
