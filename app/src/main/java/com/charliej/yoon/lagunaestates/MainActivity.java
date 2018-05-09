package com.charliej.yoon.lagunaestates;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dialNumber(View v) {
        String number = getString(R.string.tel_number);

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(number));

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // method to open website on a browser
    public void webClick(View v) {
        String url = getString(R.string.web_url);
        openBrowser(url);
    }

    // method that defines intent to open web address.
    private void openBrowser(String address) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(address));

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    // method to display location on map
    public void getMap(View v) {
        String location = getString(R.string.address_url);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(location));

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // method to email community manager
    public void emailClick(View v) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setType("*/*");
        intent.setData(Uri.parse(getResources().getString(R.string.email_address)));

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}



