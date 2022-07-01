package in.infoduniya.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtheightinin;
        EditText edtwight;
        TextView txtbmi;
        Button btncalculate;
        edtwight = findViewById(R.id.edtwight);
        edtheightinin = findViewById(R.id.edtheightinin);
        txtbmi = findViewById(R.id.txtbmi);
        btncalculate = findViewById(R.id.btncalculate);
        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int wt = Integer.parseInt( edtwight.getText().toString());
              int ht = Integer.parseInt( edtheightinin.getText().toString());
              double cm = ht*2.53;
              double tc = cm/100;
              double bmi = wt/(tc*tc);
              if(bmi>25){
                  txtbmi.setText("You are overweight"+bmi);
              }
              else if(bmi>18){
                  txtbmi.setText("You are healthy"+bmi);
                }
              else{
                  txtbmi.setText("you are underweight"+bmi);
              }
            }
        });



    }
}