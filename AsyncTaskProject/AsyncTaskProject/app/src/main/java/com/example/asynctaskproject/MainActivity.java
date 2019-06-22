package com.example.asynctaskproject;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    Bitmap bitmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_blank);

        ImageWeb img = new ImageWeb();
        img.execute();

    }


    public class ImageWeb extends AsyncTask<Void, Void, Void>
    {

        @Override
        protected Void doInBackground(Void... params) {
            try {
                bitmp = BitmapFactory.decodeStream((InputStream) new URL("https://tourism.hccg.org.tw/english/images/about_01_pic06.jpg").getContent());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            im1.setImageBitmap(bit);
        }
    }
}


