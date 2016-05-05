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
				   if(province.equals("����")){
					   cityAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,citylistH);
				   }else if(province.equals("����")){
					   cityAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,citylistB);
				   }else if(province.equals("�Ϻ�")){
					   cityAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,citylistS);
				   }else if(province.equals("����")){
					   cityAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,citylistG);
				   }else if(province.equals("����")){
					   cityAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,citylistZ);
				   }else if(province.equals("ʡ��")){
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
		provincelist.add("ʡ��");
		provincelist.add("����");
		provincelist.add("����");
		provincelist.add("�Ϻ�");
		provincelist.add("����");
		provincelist.add("����");
		citylistH = new ArrayList<String>();
		citylistB = new ArrayList<String>();
		citylistS = new ArrayList<String>();
		citylistG = new ArrayList<String>();
		citylistZ = new ArrayList<String>();
		citylistN = new ArrayList<String>();
		citylistN.add("����");
		citylistH.add("����");
		citylistH.add("��ɳ");
		citylistH.add("����");
		citylistH.add("��̶");
		citylistB.add("��̳");
		citylistB.add("�ʹ�");
		citylistB.add("�ú�԰");
		citylistB.add("�찲��");
		citylistS.add("������");
		citylistS.add("������");
		citylistS.add("��������");
		citylistS.add("��������");
		citylistG.add("����");
		citylistG.add("��ݸ");
		citylistG.add("��ݸ1");
		citylistG.add("��ݸ2");
		citylistZ.add("����1");
		citylistZ.add("����2");
		citylistZ.add("����3");
		
		
	}


    
}
