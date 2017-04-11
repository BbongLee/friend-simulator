package kr.hs.emirim.friendsimulatorbbonglee.imchung;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "Blue:Main";
    private ImageView mImageViewFriendsVisual;
    private MediaPlayer mMediaPlayer; //m : 멤버변수

    @Override
    protected void onCreate(Bundle savedInstanceState) { //activity를 처음 생성할때!
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate 메소드 호출!");
        setContentView(R.layout.activity_main);
        mImageViewFriendsVisual = (ImageView) findViewById(R.id.friend_visual);
        Log.d(TAG, "activity_main 레이아웃 세팅!");
        mMediaPlayer = MediaPlayer.create(this, R.raw.a01);
        mMediaPlayer.setLooping(false);
        mMediaPlayer.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMediaPlayer.pause(); //멈추기
        mMediaPlayer.stop(); //빼기
    }

    void onClick(View view){
        Log.d(TAG, "onClick 메소드 호출!");
        Log.d(TAG, "클릭된 뷰아이디!"+ view.getId());

        if(mMediaPlayer.isPlaying()){
            mMediaPlayer.pause();
        }
        switch (view.getId()){
            case R.id.button1:
                Log.d(TAG, "버튼1클릭");
                mImageViewFriendsVisual.setImageResource(R.drawable.chu_1);
                Toast.makeText(this, "썸바디 헬ㅍ믜~~~!!~!~!", Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(this, R.raw.a01);
                mMediaPlayer.start();
                break;
            case R.id.button2:
                Log.d(TAG, "버튼2클릭");
                mImageViewFriendsVisual.setImageResource(R.drawable.chu_2);
                Toast.makeText(this, "모해~? 지금은~?!", Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(this, R.raw.a02);
                mMediaPlayer.start();
                break;
            case R.id.button3:
                Log.d(TAG, "버튼3클릭");
                mImageViewFriendsVisual.setImageResource(R.drawable.chu_3);
                Toast.makeText(this, "여기는 지옥인걸까....?", Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(this, R.raw.a03);
                mMediaPlayer.start();
                break;
            case R.id.button4:
                Log.d(TAG, "버튼4클릭");
                mImageViewFriendsVisual.setImageResource(R.drawable.chu_4);
                Toast.makeText(this, "하ㅣㅎ갛가학핳각학", Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(this, R.raw.a04);
                mMediaPlayer.start();
                break;
            case R.id.button5:
                Log.d(TAG, "버튼5클릭");
                mImageViewFriendsVisual.setImageResource(R.drawable.chu_5);
                Toast.makeText(this, "지려따리~ 오져따리~ ! ! !", Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(this, R.raw.a05);
                mMediaPlayer.start();
                break;
            default:
                Log.d(TAG, "모르는버튼클릭");
                Toast.makeText(this, "뭐라구여?!!?!?!?", Toast.LENGTH_SHORT).show();
                break;
        }
        Log.d(TAG, "onClick메소드 무사히종료!");
    }
}
