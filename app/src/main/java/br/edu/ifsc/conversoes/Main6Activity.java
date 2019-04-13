package br.edu.ifsc.conversoes;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {

    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        textView = findViewById(R.id.Resultado6);
        editText = findViewById(R.id.fahrenheit2);

        Switch switch1 = findViewById(R.id.switch6);

        final TextView textView = findViewById(R.id.Resultado6);
        final ColorStateList oldColor = textView.getTextColors();

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean Checked) {
                if(Checked){
                    textView.setTextColor(Color.RED);
                }else{
                    textView.setTextColor(oldColor);
                }
            }
        });

    }
    public void VoltaTela(View view){
        ImageButton imageButton = (ImageButton) view;

        Intent i = new Intent(this, Main5Activity.class);
        startActivity(i);

    }

    public void Calcular(View view){

        Button button = (Button) view;

        float F = Float.parseFloat(this.editText.getText().toString());
        float K = (F - 32) * 5/9 + 273;
        textView.setText(F + "°F = " + K + "K");
    }
}
