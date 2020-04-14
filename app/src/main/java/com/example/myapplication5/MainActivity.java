package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.zopim.android.sdk.api.ChatApi;
import com.zopim.android.sdk.api.ZopimChat;
import com.zopim.android.sdk.prechat.ZopimChatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ZopimChat.init("a950d4c1-7634-4de1-b2a4-7c5d30e39b1e");

        Button mChatButton;
        mChatButton = (Button) findViewById(R.id.chat_button);

        mChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), ZopimChatActivity.class));
            }
        });
    }
}
