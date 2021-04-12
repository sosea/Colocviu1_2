package ro.pub.cs.systems.eim.Colocviu1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class Colocviu1_2SecondaryActivity extends AppCompatActivity {
    int totalSum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("[secondary]", "on create");
        super.onCreate(savedInstanceState);
        totalSum = 0;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String allTerms = extras.getString("ALL_TERMS");
            Log.i("[secondary]", allTerms);

            String numbers[] = allTerms.split("\\+");
            int currentNumber;
            for(String token : numbers) {
                totalSum += Integer.valueOf(token);
            }
        }
        Intent intentToParent = new Intent();
        intentToParent.putExtra("RESULT", totalSum);
        Log.i("[secondary]", String.valueOf(totalSum));
        setResult(RESULT_OK, intentToParent);
        finish();
    }
}