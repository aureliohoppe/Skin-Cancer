package br.furb.melanoma;


import java.io.File;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;



public class CadastroPaciente extends Activity implements OnClickListener {
	
	private EditText edNome;
	private EditText edCPF;
	private Button btOk;
	
	String nome = new String();
	String cpf = new String();
	String id= new String();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro_paciente);
		edNome = (EditText) findViewById(R.id.edNomePaciente);
		edCPF = (EditText) findViewById(R.id.edCPFPaciente);
		btOk = (Button) findViewById(R.id.btOkPaciente);
		btOk.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro_paciente, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		nome = edNome.getText().toString();
		cpf = edCPF.getText().toString();
		id = nome+"-"+cpf;
		
		final File root = new File(Environment.getExternalStorageDirectory()
				+ File.separator + "MelanomaPics" + File.separator + id + File.separator);
		root.mkdirs();
		
		Intent in = new Intent(CadastroPaciente.this, MelanomaActivity.class);
		startActivity(in);
		
	}
}
