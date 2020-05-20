package examples.pltw.safetyshield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Leaderboard extends AppCompatActivity {

    private Button Login;
    private Button Main;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        Login = (Button) findViewById(R.id.button);
        Main = (Button) findViewById(R.id.button10);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Leaderboard.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Leaderboard.this, MainScreen.class);
                startActivity((intent2));
            }
        });

    }
}
