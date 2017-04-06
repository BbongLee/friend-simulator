package kr.hs.emirim.friendsimulatorbbonglee.imchung;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void onClick(View view){
        Toast.makeText(this, "작동해요!", Toast.LENGTH_SHORT).show();
        //show 안하면 안보인댜! Toast.LENGTH_SHORT도 1000 대신 간지나게?^^호호
    }
}
