package lpp.mpk.rozklad;

import android.app.Activity;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class DoDomuActivity extends Activity {
	
	private Button button;
	 
	 
    private OnClickListener listener = new OnClickListener(){
 
        public void onClick(View v){
            EditText tekst = (EditText)findViewById(R.id.entry);
             
            CharSequence text = (CharSequence)tekst.getText();
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
             
            Toast toast = Toast.makeText(context,text,duration);
            toast.show();
        }
    };
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        // ToDo add your GUI initialization code here
        setContentView(R.layout.main);   
         
        button = (Button)findViewById(R.id.dodomu);       
        button.setOnClickListener(listener);
 
    }   

}




