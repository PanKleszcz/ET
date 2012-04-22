package lpp.mpk.rozklad;

import android.app.Activity;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DoDomuActivity extends Activity {
	
    private EditText txtName;
    private Button btnName; 
    
    private LocationManager lm;
  private LocationListener locationListener;
    
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    
    txtName = (EditText) findViewById(R.id.txtName);  
    btnName = (Button) findViewById(R.id.btnName);   
    
    
   btnName.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {

              String str = "Hello, " + 
              txtName.getText().toString() + "!";
              Toast.makeText(getBaseContext(), str, 
                            Toast.LENGTH_LONG).show();              
        }
    });     
}

}




