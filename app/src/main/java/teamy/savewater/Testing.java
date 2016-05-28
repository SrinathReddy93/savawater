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
public class Testing extends Fragment {


    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview=inflater.inflate(R.layout.testing,container,false);
        SmsManager smsManager=SmsManager.getDefault();
        smsManager.sendTextMessage("9916242893",null,"CHECK",null,null);
        Toast.makeText(getActivity(), "Please wait it's testing", Toast.LENGTH_LONG).show();
        Toast.makeText(getActivity(),"It take some time",Toast.LENGTH_LONG).show();

        return rootview;
    }
}
