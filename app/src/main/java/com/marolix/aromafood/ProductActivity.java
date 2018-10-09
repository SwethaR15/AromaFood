package com.marolix.aromafood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {

    LinearLayout bottom_cart_layout;
    TextView text_cart;
    private int total;
    String[] prod_name = {"Idly", "Dosa", "Uthappa", "Naan", "Roti", "Bajji", "Puri"};
    String[] prod_price = {"20", "40", "30", "25", "30", "20", "30"};
    int[] images = {R.drawable.idly, R.drawable.dosa, R.drawable.dosa, R.drawable.naan, R.drawable.naan,
            R.drawable.idly, R.drawable.puri};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);


        bottom_cart_layout = findViewById(R.id.bottom_cart_layout);
        text_cart = findViewById(R.id.cart_text);
        String product_name = getIntent().getStringExtra("PRODUCT_NAME");

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(product_name);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter adapter = new RecyclerAdapter(this, prod_name, prod_price, images, new ClickListener() {
            @Override
            public void itemClick(View view, int pos) {
                if (view.getId() == R.id.img_add) {
                    Log.e("Click ", "cart " + pos);
                    total = total + Integer.parseInt(prod_price[pos]);

                    bottom_cart_layout.setVisibility(View.VISIBLE);
                    text_cart.setText("Add to cart items " + total);
                    if (total == 0){
                        bottom_cart_layout.setVisibility(View.GONE);
                    }
                } else if (view.getId() == R.id.img_sub) {
                    Log.e("Click ", "cart " + pos);

                    total = total - Integer.parseInt(prod_price[pos]);
                    bottom_cart_layout.setVisibility(View.VISIBLE);
                    text_cart.setText("Add to cart items " + total);
                    if (total == 0){
                        bottom_cart_layout.setVisibility(View.GONE);
                    }
                }
            }
        });
        recyclerView.setAdapter(adapter);
        bottom_cart_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductActivity.this, PaymentActivity.class);
                intent.putExtra("CART", String.valueOf(total));
                startActivity(intent);

            }
        });
        text_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductActivity.this, PaymentActivity.class);
                intent.putExtra("CART", String.valueOf(total));
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                return true;
        }
        return (super.onOptionsItemSelected(menuItem));
    }
}
