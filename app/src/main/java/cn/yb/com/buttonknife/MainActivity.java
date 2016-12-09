package cn.yb.com.buttonknife;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @BindView(R.id.tv_text1) TextView tv_text1;

    @BindView(R.id.tv_text2)
    TextView tv_text2;

    @BindView(R.id.tv_text3)
    TextView tv_text3;

    @BindView(R.id.tv_text4)
    TextView tv_text4;

    @BindView(R.id.tv_text5)
    TextView tv_text5;

    @BindView(R.id.tv_text6)
    TextView tv_text6;

    @BindView(R.id.tv_text7)
    TextView tv_text7;

    @BindView(R.id.tv_text8)
    TextView tv_text8;

    @BindString(R.string.hello_world) // 设置sting
            String title;

    @BindDrawable(R.mipmap.ic_launcher) // 设置资源
            Drawable graphic;

    @BindColor(R.color.color_bule) // 设置颜色
            int red;

    @BindDimen(R.dimen.text_size) // 设置dimen值
            float spacers;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        tv_text1.setText("1231");
        tv_text2.setText("1024");
        tv_text3.setText("5454");
        tv_text4.setText("7865");
        tv_text5.setText("9630");
        tv_text6.setText("wertw");

    }

    @OnClick(R.id.tv_text1)
    public void sayHi(TextView button) {
        button.setText("你按到我了啦!");
    }

    @SuppressLint("NewApi")
    @OnClick(R.id.tv_text2)
    public void sayHi2(TextView button) {
        button.setBackground(graphic);
    }

    @OnClick(R.id.tv_text3)
    public void sayHi3(TextView button) {
        button.setTextColor(red);
    }

    @OnClick(R.id.tv_text4)
    public void sayHi4(TextView button) {
        button.setTextSize(spacers);
    }

}