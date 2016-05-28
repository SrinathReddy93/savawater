package teamy.savewater;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Reddy on 4/29/2015.
 */
public class STOP extends Fragment {


    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview=inflater.inflate(R.layout.stop,container,false);
      // StringBuffer buf=new StringBuffer();
       // InputStream is = this.getResources().openRawResource(R.drawable.gasNumber);
        SmsManager smsManager=SmsManager.getDefault();
        smsManager.sendTextMessage("9916242893",null,"CLOSE",null,null);

        return rootview;
    }

    public void open(View view) {
        Toast.makeText(getActivity(),"In OPEN",Toast.LENGTH_LONG).show();
        SmsManager smsManager=SmsManager.getDefault();
        smsManager.sendTextMessage("9916242893",null,"OPEN",null,null);
    }
}
