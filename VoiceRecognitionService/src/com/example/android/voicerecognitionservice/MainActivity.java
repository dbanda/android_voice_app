package com.example.android.voicerecognitionservice;

import android.net.sip.SipAudioCall.Listener;
import android.os.Bundle;
import com.example.android.voicerecognitionservice.VoiceRecognitionService;
import com.example.holidaycards.CardMakerActivity;

import android.app.Activity;
import android.content.Intent;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.speech.RecognitionService.*;
import android.speech.RecognitionService.Callback;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button ListenButton = (Button) findViewById(R.id.Listen_Button);
		ListenButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(v.getContext(), MainActivity.class);
				Callback cBacCallback(){};
				VoiceRecognitionService.onStartListening(i, );
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
