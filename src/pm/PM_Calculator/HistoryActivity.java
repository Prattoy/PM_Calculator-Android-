package pm.PM_Calculator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class HistoryActivity extends Activity {

	TextView tv;
	Button back,clr;
	Intent in;
	String s;
	//String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.history);
		tv = (TextView)findViewById(R.id.textView2);
		back = (Button) findViewById(R.id.btn_back);
		clr = (Button) findViewById(R.id.btn_clr);
		tv.setMovementMethod(new ScrollingMovementMethod());
		in= getIntent();
		
		String ret=readFromFile(getApplicationContext());
        tv.setText(ret);
	}
	
	public void delete(View v)
	{
        writeToFile("",getApplicationContext());
        String ret=readFromFile(getApplicationContext());
        tv.setText(ret);			
	}
	
	public void goBack(View v)
	{
		finish();
	}
	
	
	private String readFromFile(Context context) {

        String ret = "";

        try {
            InputStream inputStream = context.openFileInput("History.txt");

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";

                StringBuffer output = new StringBuffer();
                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    //output.append(currentDateTimeString+"\n"+receiveString+"\n\n");
                	output.append(receiveString+"\n");
                }

                inputStream.close();
                ret = output.toString();
            }
            else {ret="No History Found";}
        }
        catch (FileNotFoundException e) {
            Log.e("login activity", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("login activity", "Can not read file: " + e.toString());
        }

        return ret;
	}
	
    private void writeToFile(String data,Context context) {
        try {
            FileOutputStream fileout=openFileOutput("History.txt", 0); //false will set the append mode to false
            OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
            outputWriter.write(data);
            outputWriter.close();
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }
}
