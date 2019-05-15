package cz.zelgadiss.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProgressActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    FirebaseAuth mAuth;
    FirebaseUser currentUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.DarkAppTheme);
        }
        else
            setTheme(R.style.AppTheme);

        setContentView(R.layout.activity_progress);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Прогресс");
        setSupportActionBar(toolbar);

        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();




    }

    public void onClick(View view) {

        switch (view.getId()){

            case R.id.button_progress_1:
                button1 = findViewById(R.id.button_progress_1);
                Intent intent1 = new Intent(ProgressActivity.this, EncyActivity.class);
                intent1.putExtra("trickname", button1.getText().toString());
                startActivity(intent1);

            case R.id.button_progress_2:
                button2 = findViewById(R.id.button_progress_2);
                Intent intent2 = new Intent(ProgressActivity.this, EncyActivity.class);
                intent2.putExtra("trickname", button2.getText().toString());
                startActivity(intent2);

            case R.id.button_progress_3:
                button3 = findViewById(R.id.button_progress_3);
                Intent intent3 = new Intent(ProgressActivity.this, EncyActivity.class);
                intent3.putExtra("trickname", button3.getText().toString());
                startActivity(intent3);

            case R.id.button_progress_4:
                button4 = findViewById(R.id.button_progress_4);
                Intent intent4 = new Intent(ProgressActivity.this, EncyActivity.class);
                intent4.putExtra("trickname", button4.getText().toString());
                startActivity(intent4);

            case R.id.button_progress_5:
                button5 = findViewById(R.id.button_progress_5);
                Intent intent5 = new Intent(ProgressActivity.this, EncyActivity.class);
                intent5.putExtra("trickname", button5.getText().toString());
                startActivity(intent5);

            case R.id.button_progress_6:
                button6 = findViewById(R.id.button_progress_6);
                Intent intent6 = new Intent(ProgressActivity.this, EncyActivity.class);
                intent6.putExtra("trickname", button6.getText().toString());
                startActivity(intent6);

            case R.id.button_progress_7:
                button7 = findViewById(R.id.button_progress_7);
                Intent intent7 = new Intent(ProgressActivity.this, EncyActivity.class);
                intent7.putExtra("trickname", button7.getText().toString());
                startActivity(intent7);

            case R.id.button_progress_8:
                button8 = findViewById(R.id.button_progress_8);
                Intent intent8 = new Intent(ProgressActivity.this, EncyActivity.class);
                intent8.putExtra("trickname", button8.getText().toString());
                startActivity(intent8);

            case R.id.button_progress_9:
                button9 = findViewById(R.id.button_progress_9);
                Intent intent9 = new Intent(ProgressActivity.this, EncyActivity.class);
                intent9.putExtra("trickname", button9.getText().toString());
                startActivity(intent9);

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        MenuItem mi_profile = menu.findItem(R.id.menuProfile);
        MenuItem mi_home = menu.findItem(R.id.menuHome);
        if (currentUser == null){

            mi_profile.setVisible(false);
        }
        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            mi_profile.setIcon(R.drawable.ic_person_white_24dp);
            mi_home.setIcon(R.drawable.ic_home_white_24dp);

        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.menuAbout:
                Intent intent_about = new Intent(ProgressActivity.this, Menu_About_Activity.class);
                startActivity(intent_about);

                break;

            case R.id.menuSettings:
                Intent intent_settings = new Intent(ProgressActivity.this, Menu_Settings_Activity.class);
                startActivity(intent_settings);

                break;

            case R.id.menuProfile:
                Intent intent_profile = new Intent(ProgressActivity.this, ProfileActivity.class);
                startActivity(intent_profile);

                break;

            case R.id.menuHome:
                Intent intent_home = new Intent(ProgressActivity.this, MainActivity.class);
                startActivity(intent_home);

                break;


        }
        return true;

    }
}
