package bwei.com.bangb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import static bwei.com.bangb.R.id.iv;

public class MainActivity extends AppCompatActivity{

    /**
     * 平移加旋转
     */
    private Button mBtTrans;
    private ImageView mIv;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        set2();
        intents();
    }
//延时操作
    private void intents() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,ListActivity.class);
                    startActivity(intent);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }

    private void initView() {

        mIv = (ImageView) findViewById(iv);
    }
    //属性动画
    private void set2() {
        // TODO Auto-generated method stub
        animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.set);
        mIv.startAnimation(animation);

    }

}
