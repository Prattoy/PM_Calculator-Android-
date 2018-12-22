package pm.PM_Calculator;


import java.io.IOException;

import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PM_CalculatorActivity extends Activity {
	 /** Called when the activity is first created. */
		public Button btn_0, btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_add,btn_sub,btn_mul,btn_div,btn_calc,btn_per,btn_dec,btn_c,btn_clear,btn_mc,btn_mr,btn_mp,btn_mm,btn_his;
	    float Value1, Value2,rep,value,percent,result;
	    boolean mAddition,mSubtract,mMultiplication,mDivision,mCalc,mOperator,add,sub,div,mul;
	    SharedPreferences sharedPref;
	    String data,op1,op2;
	    String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());

	    public TextView textViewShowPoint;
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.main);
	        
	        btn_0 = (Button) findViewById(R.id.btn_0);
	        btn_1 = (Button) findViewById(R.id.btn_1);
	        btn_2 = (Button) findViewById(R.id.btn_2);
	        btn_3 = (Button) findViewById(R.id.btn_3);
	        btn_4 = (Button) findViewById(R.id.btn_4);
	        btn_5 = (Button) findViewById(R.id.btn_5);
	        btn_6 = (Button) findViewById(R.id.btn_6);
	        btn_7 = (Button) findViewById(R.id.btn_7);
	        btn_8 = (Button) findViewById(R.id.btn_8);
	        btn_9 = (Button) findViewById(R.id.btn_9);
	        btn_add = (Button) findViewById(R.id.btn_add);
	        btn_sub = (Button) findViewById(R.id.btn_sub);
	        btn_mul = (Button) findViewById(R.id.btn_mul);
	        btn_div = (Button) findViewById(R.id.btn_div);        
	        btn_calc = (Button) findViewById(R.id.btn_calc);
	        btn_per = (Button) findViewById(R.id.btn_per);
	        btn_dec = (Button) findViewById(R.id.btn_dec);
	        btn_c = (Button) findViewById(R.id.btn_c);
	        btn_clear = (Button) findViewById(R.id.btn_clear);
	        btn_mc = (Button) findViewById(R.id.btn_mc);
	        btn_mr = (Button) findViewById(R.id.btn_mr);
	        btn_mp = (Button) findViewById(R.id.btn_mp);
	        btn_mm = (Button) findViewById(R.id.btn_mm);
	        btn_his = (Button) findViewById(R.id.btn_his);
	        textViewShowPoint = (TextView) findViewById(R.id.textView);
	        value=0.0f;
	        result=0.0f;
	        rep=0.0f;
	        
	        btn_0.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	if(mOperator==true)
	            	{
	        			textViewShowPoint.setText(null);
	            	}
	            	if(textViewShowPoint.getText().length()<10)
	            	{
	            		textViewShowPoint.setText(textViewShowPoint.getText()+"0");
	            	}
	                mOperator=false;
	            }
	        });

	        btn_1.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	if(mOperator==true)
	            	{
	        			textViewShowPoint.setText(null);
	            	}
	            	if(textViewShowPoint.getText().length()<10)
	            	{
	            		textViewShowPoint.setText(textViewShowPoint.getText()+"1");
	            	}
	                mOperator=false;
	            }
	        });

	        btn_2.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	if(mOperator==true)
	            	{
	        			textViewShowPoint.setText(null);
	            	}
	            	if(textViewShowPoint.getText().length()<10)
	            	{
	            		textViewShowPoint.setText(textViewShowPoint.getText()+"2");
	            	}
	                mOperator=false;
	            }
	        });

	        btn_3.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	if(mOperator==true)
	            	{
	        			textViewShowPoint.setText(null);
	            	}
	            	if(textViewShowPoint.getText().length()<10)
	            	{
	            		textViewShowPoint.setText(textViewShowPoint.getText()+"3");
	            	}
	                mOperator=false;
	            }
	        });

	        btn_4.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	if(mOperator==true)
	            	{
	        			textViewShowPoint.setText(null);
	            	}
	            	if(textViewShowPoint.getText().length()<10)
	            	{
	            		textViewShowPoint.setText(textViewShowPoint.getText()+"4");
	            	}
	                mOperator=false;
	            }
	        });

	        btn_5.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	if(mOperator==true)
	            	{
	        			textViewShowPoint.setText(null);
	            	}
	            	if(textViewShowPoint.getText().length()<10)
	            	{
	            		textViewShowPoint.setText(textViewShowPoint.getText()+"5");
	            	}
	                mOperator=false;
	            }
	        });

	        btn_6.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	if(mOperator==true)
	            	{
	        			textViewShowPoint.setText(null);
	            	}
	            	if(textViewShowPoint.getText().length()<10)
	            	{
	            		textViewShowPoint.setText(textViewShowPoint.getText()+"6");
	            	}
	                mOperator=false;
	            }
	        });

	        btn_7.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	if(mOperator==true)
	            	{
	        			textViewShowPoint.setText(null);
	            	}
	            	if(textViewShowPoint.getText().length()<10)
	            	{
	            		textViewShowPoint.setText(textViewShowPoint.getText()+"7");
	            	}
	                mOperator=false;
	            }
	        });

	        btn_8.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	if(mOperator==true)
	            	{
	        			textViewShowPoint.setText(null);
	            	}
	            	if(textViewShowPoint.getText().length()<10)
	            	{
	            		textViewShowPoint.setText(textViewShowPoint.getText()+"8");
	            	}
	                mOperator=false;
	            }
	        });

	        btn_9.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	if(mOperator==true)
	            	{
	        			textViewShowPoint.setText(null);
	            	}
	            	if(textViewShowPoint.getText().length()<10)
	            	{
	            		textViewShowPoint.setText(textViewShowPoint.getText()+"9");
	            	}
	                mOperator=false;
	            }
	        });

	        btn_dec.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	int dec=0;
	            	if(mOperator==true)
	            	{
	        			textViewShowPoint.setText(null);
	            	}
	            	
	            	for(int i=0;i<textViewShowPoint.getText().length();i++)
	            	{
	            		if(textViewShowPoint.getText().charAt(i)=='.')
	            		{
	            			dec++;
	            		}
	            	}
	            	if(dec==0)
	            	{
	            		if(textViewShowPoint.getText().toString().equals(""))
	                	{
	                		textViewShowPoint.setText(textViewShowPoint.getText()+"0.");
	                	}
	            		else
	            		{
	            			if(textViewShowPoint.getText().length()<10)
	                    	{
	                    		textViewShowPoint.setText(textViewShowPoint.getText()+".");
	                    	}
	            		}
	            	}
	            	mOperator=false;
	            }
	        });
	        btn_add.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	try
	            	{
	            	op1 = "+";
	                if (textViewShowPoint == null){
	                    textViewShowPoint.setText("");
	                }else {
	                	if((mAddition==true)||(mSubtract==true)||(mMultiplication==true)||(mDivision==true))
	                	{
	                		seqCal();
	                		mAddition = true;
	                	}
	                	else
	                	{
	                		Value1 = Float.parseFloat(textViewShowPoint.getText() + "");
	                        mAddition = true;
	                	}    
	                }
	                mOperator=true;
	                mSubtract=false;
	                mMultiplication=false;
	                mDivision=false;
	                add=false;
	                sub=false;
	                mul=false;
	                div=false;
	            	}catch(Exception e){}
	            }
	        });

	        btn_sub.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	try
	            	{
	            	op1 = "-";
	                if (textViewShowPoint == null){
	                    textViewShowPoint.setText("");
	                }else {
	                	if((mAddition==true)||(mSubtract==true)||(mMultiplication==true)||(mDivision==true))
	                	{
	                		seqCal();
	                		mSubtract = true;
	                	}
	                	else
	                	{
	                		Value1 = Float.parseFloat(textViewShowPoint.getText() + "");
	                        mSubtract = true;
	                	}
	                }
	                mOperator=true;
	                mAddition=false;
	                mMultiplication=false;
	                mDivision=false;
	                add=false;
	                sub=false;
	                mul=false;
	                div=false;
	            	}catch(Exception e){}
	            }
	        });

	        btn_mul.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	try
	            	{
	            	op1 = "X";
	                if (textViewShowPoint == null){
	                    textViewShowPoint.setText("");
	                }else {
	                	if((mAddition==true)||(mSubtract==true)||(mMultiplication==true)||(mDivision==true))
	                	{
	                		seqCal();
	                		mMultiplication = true;
	                	}
	                	else
	                	{
	                		Value1 = Float.parseFloat(textViewShowPoint.getText() + "");
	                        mMultiplication = true;
	                	}
	                }
	                mOperator=true;
	                mAddition=false;
	                mSubtract=false;
	                mDivision=false;
	                add=false;
	                sub=false;
	                mul=false;
	                div=false;
	            	}catch(Exception e){}
	            }
	        });

	        btn_div.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	try
	            	{
	            	op1 = "÷";
	                if (textViewShowPoint == null){
	                    textViewShowPoint.setText("");
	                }else {
	                	if((mAddition==true)||(mSubtract==true)||(mMultiplication==true)||(mDivision==true))
	                	{
	                		seqCal();
	                		mDivision = true;
	                	}
	                	else
	                	{
	                		Value1 = Float.parseFloat(textViewShowPoint.getText() + "");
	                        mDivision = true;
	                	}
	                }
	                mOperator=true;
	                mAddition=false;
	                mSubtract=false;
	                mMultiplication=false;                
	                add=false;
	                sub=false;
	                mul=false;
	                div=false;
	            	}catch(Exception e){}
	            }
	        });
	        
	        btn_per.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					try{
					op1 = "%";
					Value2 = Float.parseFloat(textViewShowPoint.getText() + "");
					if((mAddition==true)||(mSubtract==true)||(mMultiplication==true)||(mDivision==true))
					{
						percent = (Value1 * (Value2 / 100));
					}
					else
					{
						if(result==0.0)
						{
							percent = Value2;
						}
						else
						{
							percent = result * (Value2 / 100);
						}
					}
					textViewShowPoint.setText(percent + "");
					mOperator=true;
					}catch(Exception ex){}
				}
			});

	        btn_calc.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	try
	            	{
	            	op2 = "=";
	                Value2 = Float.parseFloat(textViewShowPoint.getText() + "");

	                if (mAddition == true){
	                	rep=Value2;
	                    textViewShowPoint.setText(Value1 + Value2 +"");
	                    mAddition=false;
	                    add=true;
	                    mCalc=true;
	                }

	                if (mSubtract == true){
	                	rep=Value2;
	                    textViewShowPoint.setText(Value1 - Value2 +"");
	                    mSubtract=false;
	                    sub=true;
	                    mCalc=true;
	                }

	                if (mMultiplication == true){
	                	rep=Value2;
	                    textViewShowPoint.setText(Value1 * Value2 + "");
	                    mMultiplication=false;
	                    mul=true;
	                    mCalc=true;
	                }

	                if (mDivision == true){
	                	rep=Value2;
	                    textViewShowPoint.setText(Value1 / Value2+"");
	                    mDivision=false;
	                    div=true;
	                    mCalc=true;
	                }
	                
	                if ((add == true)&&(mCalc==false)){
	                    textViewShowPoint.setText(Value2 + rep +"");
	                    rep = 0.0f;
	                }

	                if ((sub == true)&&(mCalc==false)){
	                    textViewShowPoint.setText(Value2 - rep +"");
	                    rep = 0.0f;
	                }

	                if ((mul == true)&&(mCalc==false)){
	                    textViewShowPoint.setText(Value2 * rep + "");
	                    rep = 0.0f;
	                }

	                if ((div == true)&&(mCalc==false)){
	                    textViewShowPoint.setText(Value2 / rep +"");
	                    rep = 0.0f;
	                }
	                
	                result = Float.parseFloat(textViewShowPoint.getText() + "");
	                mOperator=true;
	                mCalc=false;
	            	}catch(Exception e){}
	            	
	            	
	            	//writeHistory
	            	if(textViewShowPoint.getText().toString().equals(""))
	            	{
	            		try{}catch(Exception ex){}
	            	}
	            	else
	            	{
	            		if(op1==null)
	            		{
	            			data = textViewShowPoint.getText().toString() +" "+op2+" " +textViewShowPoint.getText().toString()+"";
	            		}
	            		else
	            		{
	            			//if(rep!=0.0f)
	            			//{
	            			//	data = Value2 +" "+op1+" "+ rep +" "+op2+" " +textViewShowPoint.getText().toString()+"";
	            			//}
	            			//else
	            			//{
	            				data = Value1 +" "+op1+" "+ Value2 +" "+op2+" " +textViewShowPoint.getText().toString()+"";
	            			}
	            		}
	            		
	            	try {
	                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(getApplicationContext().openFileOutput("History.txt", Context.MODE_APPEND));
	                    outputStreamWriter.write(currentDateTimeString+"\n"+data+"\n"+ System.getProperty ("line.separator"));
	                    outputStreamWriter.close();
	                }
	                catch (IOException e) {
	                    Log.e("Exception", "File write failed: " + e.toString());
	                }
	            	
	            	
	            	
	            }
	        });
	        
	        btn_c.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	try
	            	{
	            	CharSequence back;
	            	String s = textViewShowPoint.getText().toString()+"";
	            	if((textViewShowPoint.getText().toString().equals("NaN"))||(textViewShowPoint.getText().toString().equals("Infinity")))
	            	{
	            		textViewShowPoint.setText("");
	            	}
	            	else
	            	{
	            		back=textViewShowPoint.getText().subSequence(0, textViewShowPoint.getText().length()-1);
	            		textViewShowPoint.setText(back);
	            	}
	            	
	                mOperator=false;
	            	}catch(Exception e){}
	            }
	        });

	        btn_clear.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	mAddition=false;
	            	mSubtract=false;
	            	mMultiplication=false;
	            	mDivision=false;
	            	add=false;
	                sub=false;
	                mul=false;
	                div=false;
	                textViewShowPoint.setText("");
	            }
	        });
	    }
	    
	    public void seqCal()
	    {
	    	Value2 = Float.parseFloat(textViewShowPoint.getText() + "");

	        if (mAddition == true){
	        	rep=Value2;
	            textViewShowPoint.setText(Value1 + Value2 +"");
	            mAddition=false;
	            add=true;
	            mCalc=true;
	        }

	        if (mSubtract == true){
	        	rep=Value2;
	            textViewShowPoint.setText(Value1 - Value2 +"");
	            mSubtract=false;
	            sub=true;
	            mCalc=true;
	        }

	        if (mMultiplication == true){
	        	rep=Value2;
	            textViewShowPoint.setText(Value1 * Value2 + "");
	            mMultiplication=false;
	            mul=true;
	            mCalc=true;
	        }

	        if (mDivision == true){
	        	rep=Value2;
	            textViewShowPoint.setText(Value1 / Value2+"");
	            mDivision=false;
	            div=true;
	            mCalc=true;
	        }
	        
	        if ((add == true)&&(mCalc==false)){
	            textViewShowPoint.setText(Value2 + rep +"");
	        }

	        if ((sub == true)&&(mCalc==false)){
	            textViewShowPoint.setText(Value2 - rep +"");
	        }

	        if ((mul == true)&&(mCalc==false)){
	            textViewShowPoint.setText(Value2 * rep + "");
	        }

	        if ((div == true)&&(mCalc==false)){
	            textViewShowPoint.setText(Value2 / rep +"");
	        }
	        Value1 = Float.parseFloat(textViewShowPoint.getText() + "");

	        mOperator=true;
	        mCalc=false;
	    }
	    
	    public float readFromMemory()
	    {	try{
		    	sharedPref = this.getPreferences(Context.MODE_PRIVATE);
		    	float defaultValue = 0.0f;
		    	float memValue = sharedPref.getFloat("memory", defaultValue);
		    	return memValue;
	    	}
	    	catch(Exception e){
	    		Toast.makeText(this, "HAHAHHA", Toast.LENGTH_SHORT).show();
	    		return -1;
	    	}
	    }
	    
	    public boolean writeInMemory(float value3)
	    {
	    	try{
		    	sharedPref = this.getPreferences(Context.MODE_PRIVATE);
		    	SharedPreferences.Editor editor = sharedPref.edit();
		    	editor.putFloat("memory", value3);
		    	editor.commit();
		    	return true;
	    	}
	    	catch(Exception e){return false;}
	    }
	    public void showValue(View v)
	    {
	    	float memValue = readFromMemory();
	    	textViewShowPoint.setText(""+memValue);
	    	mOperator=true;
	    }
	    public void clear(View v)
	    {
	    	value=0.0f;
	    	if(writeInMemory(value))
	    	{
	    		Toast.makeText(this,"cleared", Toast.LENGTH_SHORT).show();
	    	}
	    	else
	    	{
	    		Toast.makeText(this,"not cleared", Toast.LENGTH_SHORT).show();
	    	}
	    }
	    
	    public void add(View v)
	    {
	    	try{
	    	float memValue = readFromMemory();
	    	memValue = memValue + Float.parseFloat(textViewShowPoint.getText() + "");;
	    	if(writeInMemory(memValue))
	    	{
	    		Toast.makeText(this,"added", Toast.LENGTH_SHORT).show();
	    	}
	    	else
	    	{
	    		Toast.makeText(this,"not added", Toast.LENGTH_SHORT).show();
	    	}
	    	}catch(Exception ex){}
	    	mOperator=true;
	    }
	    
	    public void sub(View v)
	    {
	    	try{
	    	float memValue = readFromMemory();
	    	memValue = memValue - Float.parseFloat(textViewShowPoint.getText() + "");;
	    	if(writeInMemory(memValue))
	    	{
	    		Toast.makeText(this,"subtracted", Toast.LENGTH_SHORT).show();
	    	}
	    	else
	    	{
	    		Toast.makeText(this,"not subtracted", Toast.LENGTH_SHORT).show();
	    	}
	    	}catch(Exception ex){}
	    	mOperator=true;
	    }
	    
	    public void goNext(View v)
	    {
	    	try{
	    	Intent in = new Intent(getApplicationContext(), HistoryActivity.class);
	    	
	    	startActivity(in);
	    	}catch(Exception ex){textViewShowPoint.setText(ex.getMessage());}
	    }
	    
	    protected void onSaveInstanceState(Bundle outState)
	    {
	    	super.onSaveInstanceState(outState);
	    	outState.putString("text", textViewShowPoint.getText().toString());
	    }
	    
	    protected void onRestoreInstanceState(Bundle savedInstanceState)
	    {
	    	super.onRestoreInstanceState(savedInstanceState);
	    	textViewShowPoint.setText(savedInstanceState.getString("text"));
	    }
	}