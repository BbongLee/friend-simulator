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
        switch (view.getId()){
            case R.id.button1:
                Toast.makeText(this, "썸바디 헬ㅍ믜~~~!!~!~!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "모해~? 지금은~?!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this, "여기는 지옥인걸까....?", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this, "하ㅣㅎ갛가학핳각학", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this, "지려따리~ 오져따리~ ! ! !", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "뭐라구여?!!?!?!?", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
