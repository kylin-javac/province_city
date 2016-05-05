package com.ligang.citys;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

    private Spinner province;
	private Spinner citys;
	private ArrayList<String> provincelist;
	private ArrayList<String> citylistH;
	private ArrayList<String> citylistB;
	private ArrayList<String> citylistS;
	private ArrayList<String> citylistG;
	private ArrayList<String> citylistZ;
	private ArrayAdapter<String> cityAdapter;
	private ArrayList<String> citylistN;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		initView();
		ArrayAdapter<String> provinceAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,provincelist );
		province.setAdapter(provinceAdapter);
		province.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				   String province = (String) parent.getItemAtPosition(position);
				   if(province.equals("湖南")){
					   cityAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,citylistH);
				   }else if(province.equals("北京")){
					   cityAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,citylistB);
				   }else if(province.equals("上海")){
					   cityAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,citylistS);
				   }else if(province.equals("广州")){
					   cityAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,citylistG);
				   }else if(province.equals("深圳")){
					   cityAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,citylistZ);
				   }else if(province.equals("省份")){
					   cityAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,citylistN);
				   }
				   citys.setAdapter(cityAdapter);
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				
			}

		});
    }

	private void initView() {
		province = (Spinner) findViewById(R.id.province);
		citys = (Spinner) findViewById(R.id.ciyts);
		provincelist = new ArrayList<String>();
		provincelist.add("省份");
		provincelist.add("湖南");
		provincelist.add("北京");
		provincelist.add("上海");
		provincelist.add("深圳");
		provincelist.add("广州");
		citylistH = new ArrayList<String>();
		citylistB = new ArrayList<String>();
		citylistS = new ArrayList<String>();
		citylistG = new ArrayList<String>();
		citylistZ = new ArrayList<String>();
		citylistN = new ArrayList<String>();
		citylistN.add("市区");
		citylistH.add("永州");
		citylistH.add("长沙");
		citylistH.add("株洲");
		citylistH.add("湘潭");
		citylistB.add("天坛");
		citylistB.add("故宫");
		citylistB.add("颐和园");
		citylistB.add("天安门");
		citylistS.add("宝安区");
		citylistS.add("黄埔区");
		citylistS.add("东方明珠");
		citylistS.add("东方卫视");
		citylistG.add("惠州");
		citylistG.add("东莞");
		citylistG.add("东莞1");
		citylistG.add("东莞2");
		citylistZ.add("深圳1");
		citylistZ.add("深圳2");
		citylistZ.add("深圳3");
		
		
	}


    
}
