package teamy.savewater;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

//import android.telephony.SmsManager;

/**
 * Created by Reddy on 4/19/2015.
 */
public class Recive extends BroadcastReceiver {
    /**
     * This method is called when the BroadcastReceiver is receiving an Intent
     * broadcast.  During this time you can use the other methods on
     * BroadcastReceiver to view/modify the current result values.  This method
     * is always called within the main thread of its process, unless you
     * explicitly asked for it to be scheduled on a different thread using
     * {@link android.content.Context#registerReceiver(android.content.BroadcastReceiver,
     * IntentFilter, String, android.os.Handler)}. When it runs on the main
     * thread you should
     * never perform long-running operations in it (there is a timeout of
     * 10 seconds that the system allows before considering the receiver to
     * be blocked and a candidate to be killed). You cannot launch a popup dialog
     * in your implementation of onReceive().
     * <p/>
     * <p><b>If this BroadcastReceiver was launched through a &lt;receiver&gt; tag,
     * then the object is no longer alive after returning from this
     * function.</b>  This means you should not perform any operations that
     * return a result to you asynchronously -- in particular, for interacting
     * with services, you should use
     * {@link android.content.Context#startService(android.content.Intent)} instead of
     * {@link android.content.Context#bindService(android.content.Intent, ServiceConnection, int)}.  If you wish
     * to interact with a service that is already running, you can use
     * {@link #peekService}.
     * <p/>
     * <p>The Intent filters used in {@link android.content.Context#registerReceiver}
     * and in application manifests are <em>not</em> guaranteed to be exclusive. They
     * are hints to the operating system about how to find suitable recipients. It is
     * possible for senders to force delivery to specific recipients, bypassing filter
     * resolution.  For this reason, {@link #onReceive(android.content.Context, android.content.Intent) onReceive()}
     * implementations should respond only to known actions, ignoring any unexpected
     * Intents that they may receive.
     *
     * @param context The Context in which the receiver is running.
     * @param intent  The Intent being received.
     */
    private static final String TAG="Message recived";
    @Override
    public void onReceive(Context context, Intent intent) {
        //Toast.makeText(context,"In Recive",Toast.LENGTH_LONG).show();
        Bundle pudsBundle=intent.getExtras();
        Object[] pdus=(Object[]) pudsBundle.get("pdus");
        SmsMessage message=SmsMessage.createFromPdu((byte[])pdus[0]);
        String number=message.getDisplayOriginatingAddress();
       // Toast.makeText(context,"SMS Recived :"+message.getMessageBody()+number,Toast.LENGTH_LONG).show();
        switch (message.getMessageBody())
        {
            case "LEAK":// Toast.makeText(context,message.getMessageBody(),Toast.LENGTH_LONG).show();
                                           //Toast.makeText(context,"It Emegrence water leaking Temporary stop the leak",Toast.LENGTH_LONG).show();
                                           Intent intent1 = new Intent(context, Exm.class);
                                           intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                           context.startActivity(intent1);
                                         // SmsManager smsManager=SmsManager.getDefault();
                                          //smsManager.sendTextMessage("7829720439",null,"CLOSE",null,null);
                                       break;
            case "LEAK IN INNER PIPE"://Toast.makeText(context,message.getMessageBody(),Toast.LENGTH_LONG).show();
                //Toast.makeText(context,"It Emegrence water leaking Temporary stop the leak",Toast.LENGTH_LONG).show();
                //SmsManager smsManager1=SmsManager.getDefault();
                //smsManager1.sendTextMessage("7829720439",null,"CLOSE",null,null);
                Intent intent11 = new Intent(context, Exm.class);
                intent11.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent11);


                break;
            case "NO LEAK":Toast.makeText(context,message.getMessageBody(),Toast.LENGTH_LONG).show();
                            break;

        }

    }
}
