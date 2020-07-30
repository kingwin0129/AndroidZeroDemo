package com.kingwin.zero.ui;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.kingwin.zero.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 主界面
 */
public class MainActivity extends Activity {

    /**
     * TextView文本控件
     */
    TextView tv_info;

    /**
     *  Button按钮控件
     */
    Button btn_execute;

    /**
     * 统计点击次数
     */
    int mClickIdx;


    /**
     * 在Activity创建时调用，通常做一些初始化设置。
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//加载布局文件
        tv_info = (TextView) findViewById(R.id.tv_info);//声明tv_info控件
        btn_execute = (Button) findViewById(R.id.btn_execute);//声明btn_execute控件
        mClickIdx = 0;//初始化点击次数
        btn_execute.setOnClickListener(new View.OnClickListener() {//注册点击事件
            @Override
            public void onClick(View v) {
                if(mClickIdx == 0){
                    tv_info.setText("准备好开启大门了吗？");//修改显示文案
                }else if(mClickIdx == 1){
                    tv_info.setText("看到前面的坑了吗？跳吧！");//修改显示文案
                }else{
                    tv_info.setText("欢迎入坑！");//修改显示文案
                    mClickIdx = 0;//重置点击统计
                    btn_execute.setVisibility(View.GONE);//隐藏按钮
                }
                mClickIdx++;
            }
        });
    }


    /**
     *  在Activity获取焦点开始与用户交互时调用
     */
    @Override
    protected void onResume() {
        if(null != tv_info){//当恢复界面时初始化
            tv_info.setText("Hello World! Android");
            mClickIdx = 0;
            btn_execute.setVisibility(View.VISIBLE);
        }
        super.onResume();
    }

    /**
     *  在当前Activity被其他Activity覆盖或锁屏时调用
     */
    @Override
    protected void onPause() {
        super.onPause();
    }


    /**
     *  在Activity即将可见时调用
     */
    @Override
    protected void onStart() {
        super.onStart();
    }

    /**
     *  在Activity对用户不可见时调用
     */
    @Override
    protected void onStop() {
        super.onStop();
    }


    /**
     *  在Activity销毁时调用
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /**
     *  在Activity从停止状态再次启动时调用
     */
    @Override
    protected void onRestart() {
        super.onRestart();
    }



}
