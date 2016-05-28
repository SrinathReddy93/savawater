package teamy.savewater;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//*149#
/**
 * Created by Reddy on 4/29/2015.
 */
public class howToUse extends Fragment {


    View rootview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview=inflater.inflate(R.layout.howtouse,container,false);
      // StringBuffer buf=new StringBuffer();
       // InputStream is = this.getResources().openRawResource(R.drawable.gasNumber);
       // TextView tv=(TextView)findViewById(R.id.textView16);
        //AssetManager
        return rootview;
    }
}
