package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,btelia,bpi,bison,bplus,bmion,bepi,bdiv,binv,briza,btetr,bf,bln,blog,btan,bcos,bsin,bb1,bb2,bc,bac;
    TextView othoni1,othoni2;
    String pi = "3.14159265";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bpi = findViewById(R.id.bpi);
        btelia = findViewById(R.id.btelia);
        bison = findViewById(R.id.bison);
        bplus = findViewById(R.id.biplus);
        bmion = findViewById(R.id.bmion);
        bepi = findViewById(R.id.bepi);
        bdiv = findViewById(R.id.bdiv);
        binv = findViewById(R.id.binv);
        briza = findViewById(R.id.briza);
        btetr = findViewById(R.id.btetr);
        bf = findViewById(R.id.bf);
        bln = findViewById(R.id.bln);
        blog = findViewById(R.id.blog);
        btan = findViewById(R.id.btan);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bc = findViewById(R.id.bc);
        bac = findViewById(R.id.bac);

        othoni1 = findViewById(R.id.othoni1);
        othoni2 = findViewById(R.id.othoni2);
        //onclick listeners
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText()+"0");
            }
        });
        btelia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText()+".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText("");
                othoni2.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = othoni1.getText().toString();
                val = val.substring(0, val.length() - 1);
                othoni1.setText(val);
            }
        });
        bmion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText() + "-");
            }
        });
        bepi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText()+"×");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText()+"÷");
            }
        });
        briza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = othoni1.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                othoni1.setText(String.valueOf(r));
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText()+"(");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText()+")");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni2.setText(bpi.getText());
                othoni1.setText(othoni1.getText()+pi);
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othoni1.setText(othoni1.getText()+"sin");
            }
        });

    }
}