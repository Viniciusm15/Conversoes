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

public class Main4Activity extends AppCompatActivity {

    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textView = findViewById(R.id.Resultado4);
        editText = findViewById(R.id.Kelvin2);

        Switch switch1 = findViewById(R.id.switch4);

        final TextView textView = findViewById(R.id.Resultado4);
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

        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);

    }

    public void TrocaTela(View view){
        ImageButton imageButton = (ImageButton) view;

        Intent i = new Intent(this, Main5Activity.class);
        startActivity(i);
    }

    public void Calcular(View view){

        Button button = (Button) view;

        float K = Float.parseFloat(this.editText.getText().toString());
        float F = (K - 273) * 9/5 + 32;

        textView.setText(K + "K = " + F + "°F");
    }
}
