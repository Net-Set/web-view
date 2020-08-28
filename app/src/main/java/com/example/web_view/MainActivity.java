package com.example.web_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {
    private Button button;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button = (Button) findViewById(R.id.button1);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,html.class);
                    startActivity(intent);
                }
            });
            button = (Button) findViewById(R.id.button2);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,css.class);
                    startActivity(intent);
                }
            });
            button = (Button) findViewById(R.id.button3);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,javascript.class);
                    startActivity(intent);
                }
            });
            button = (Button) findViewById(R.id.button4);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,php.class);
                    startActivity(intent);
                }
            });
            button = (Button) findViewById(R.id.button5);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,sql.class);
                    startActivity(intent);
                }
            });
            button = (Button) findViewById(R.id.button6);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,python.class);
                    startActivity(intent);
                }
            });
            button = (Button) findViewById(R.id.button7);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,jquery.class);
                    startActivity(intent);
                }
            });
            button = (Button) findViewById(R.id.button8);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,java.class);
                    startActivity(intent);
                }
            });
            button = (Button) findViewById(R.id.button9);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,cpp.class);
                    startActivity(intent);
                }
            });
            button = (Button) findViewById(R.id.button10);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,c_sharp.class);
                    startActivity(intent);
                }
            });
            button = (Button) findViewById(R.id.button11);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,ract.class);
                    startActivity(intent);
                }
            });
            button = (Button) findViewById(R.id.button12);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,node_js.class);
                    startActivity(intent);
                }
            });
            button = (Button) findViewById(R.id.button13);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,xml.class);
                    startActivity(intent);
                }
            });
            button = (Button) findViewById(R.id.button14);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,w3_css.class);
                    startActivity(intent);
                }
            });
            button = (Button) findViewById(R.id.button15);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,Bootstrap.class);
                    startActivity(intent);
                }
            });
        }
        public boolean onCreateOptionsMenu(Menu menu){
            getMenuInflater().inflate(R.menu.main_menu,menu);
            return true;

        }
        public boolean onOptionsItemSelected(MenuItem item){
            int id = item.getItemId();
            if(id == R.id.home){
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
                return  true;
            }
            else if(id == R.id.Signup){

                Intent intent = new Intent(MainActivity.this,Signup.class);
                startActivity(intent);
                return  true;
            }

            else if(id == R.id.help){

                Intent intent = new Intent(MainActivity.this, help.class);
                startActivity(intent);
                return  true;
            }
            return super.onOptionsItemSelected(item);

        }
}
