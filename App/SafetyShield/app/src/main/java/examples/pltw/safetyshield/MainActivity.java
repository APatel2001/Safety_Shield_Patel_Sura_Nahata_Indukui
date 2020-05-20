package examples.pltw.safetyshield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.editText2);
        Password = (EditText) findViewById((R.id.editText));
        Login = (Button) findViewById((R.id.button));

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Validate(Name.getText().toString(), Password.getText().toString());
            }
        });



    }

    private void Validate(String userName, String userPassword) {
        if ((userName.equals("avidpatel1@gmail.com")) && (userPassword.equals("1234"))) {
            Intent intent =  new Intent(MainActivity.this, MainScreen.class);
            startActivity(intent);
        }
    }
}
