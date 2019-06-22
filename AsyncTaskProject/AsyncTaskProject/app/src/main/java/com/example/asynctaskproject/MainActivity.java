package com.example.asynctaskproject;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    Bitmap bitmp;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_blank);

        ImageWeb img = new ImageWeb();
        img.execute();

    }


    public class ImageWeb extends AsyncTask<Void, Void, Bitmap>
    {

        @Override
        protected Bitmap doInBackground(Void... params) {

            //String birthLoc = "https://images.outlookindia.com/public/uploads/gallery/20160406/mahad_pond_1_20160418_630_630.jpg";
            String birthLoc = "https://raw.githubusercontent.com/shethsukhada/CS6392019/master/AsyncTaskProject/Mahad.jpg";

            try {
                bitmp = BitmapFactory.decodeStream((InputStream) new URL(birthLoc).getContent());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return bitmp;
        }

        protected void onPostExecute(Bitmap aVoid) {
            super.onPostExecute(aVoid);
            ImageView mainImage = (ImageView) findViewById(R.id.imageView);
            mainImage.setImageBitmap(bitmp);

        }
    }
}


