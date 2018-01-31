package com.umesh_reddy.hp.tables4rkids;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {
TextView t;
    EditText e;
    ListView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=(EditText) findViewById(R.id.editText);
       // t=(TextView) findViewById(R.id.textView);
        result=(ListView) findViewById(R.id.listview);
     final String out[]=new String[100];
Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                long n=0;
                try{
                 n=Integer.parseInt(e.getText().toString());

                    for(int i=1;i<=100;i++) {
                        String s = String.format("%d * %3d = %d \n", n, i, n * i);
                    out[i-1]=s;
                    }
                    ArrayAdapter adapter=new ArrayAdapter<String>(MainActivity.this,R.layout.textview,out);
                    result.setAdapter(adapter);

                    Toast.makeText(MainActivity.this,"Scrolldown for more values",Toast.LENGTH_LONG).show();

                    }
                catch(Exception e){
                    Toast.makeText(MainActivity.this,"Please enter a number",Toast.LENGTH_LONG).show();
                }




            }
        });
    }
}
