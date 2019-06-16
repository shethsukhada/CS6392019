package com.example.menuproject1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_blank);
    }

    /** Called when the user taps the Send button */
    public void sendSMS(View view) {

        //Do something in response to button
        String number = "9148176366";
        String message = "Sukhada S Sheth";
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("smsto:"+ number));
        intent.putExtra("sms_body",message);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.first_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
       if(id == R.id.action_settings) {
           Toast t = Toast.makeText(this, "Settings Menu Clicked", Toast.LENGTH_SHORT);
           t.show();
           return true;
       }
       else if(id == R.id.action_help){
           Intent intent = new Intent(this, HelpActivity.class);
           startActivity(intent);
           return true;
       }
        return true;
    }




    /** Called when the user taps the Send button */
    public void dialNo(View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:9148176366"));
        startActivity(intent);
    }

    /** Called when the user taps the Send button */
    public void openWeb(View view) {

        Intent websiteIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://google.com"));
        startActivity(websiteIntent);
    }

    public void mapClick(View view){
        //Button button = (Button) view;
        //((Button) view).setText("adasda");
        String geoURI = String.format("geo:20.5936832, 78.962883");
        Uri geo = Uri.parse(geoURI);
        Intent geoMap = new Intent(Intent.ACTION_VIEW, geo);
        startActivity(geoMap);
    }


    /** Called when the user taps the Send button */
    public void startNewActivity(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void chooser(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT,"CS639");
        intent.putExtra(Intent.EXTRA_TEXT,"Join CS639");
        startActivity(Intent.createChooser(intent,"Share the love"));
    }
}
