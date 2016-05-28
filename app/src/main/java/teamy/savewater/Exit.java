package teamy.savewater;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Reddy on 4/29/2015.
 */
public class Exit extends Fragment {


    View rootview;
    MainActivity m=new MainActivity();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview=inflater.inflate(R.layout.exit,container,false);
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(getActivity());
        alertDialogBuilder.setTitle("Exit");
        alertDialogBuilder.setMessage("Are sure want to Exit");
        alertDialogBuilder.setNeutralButton("Yes",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                getActivity().finish();
               // android.os.Process.killProcess(android.os.Process.myPid());
               // System.exit(0);
              //  m.exits();
   // deepaksnandihal@
            }
        });
        alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
        return rootview;
    }
}
