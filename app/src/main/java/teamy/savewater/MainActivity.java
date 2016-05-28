package teamy.savewater;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button login;
    TextView UserName,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(Button) findViewById(R.id.button);
        UserName=(TextView) findViewById(R.id.editText);
        Password=(TextView) findViewById(R.id.editText2);
    }
    public void Process(View v)
    {
        String Name=UserName.getText().toString();
        String Pass=Password.getText().toString();

        //UserName.setText("");
        //Password.setText("");
        if(Name.contentEquals("Team Y")&&Pass.contentEquals("hod")){
            Intent intent=new Intent(this,MainActivity2Activity.class);
           startActivity(intent);
            finish();
           // Toast.makeText(this,"Welcome",Toast.LENGTH_LONG).show();
        }else Toast.makeText(this, "User name or Password are wrong", Toast.LENGTH_LONG).show();

    }

}
