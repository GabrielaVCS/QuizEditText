package application.example.com.prava;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Definição de variaveis - Rspostas definidas pelo usuario

    EditText resp1;EditText resp2;EditText resp3;
    EditText resp4;EditText resp5;EditText resp6;

    Integer total;

    public void verifica(View v){
        total = 0;

        resp1 = (EditText)findViewById(R.id.resp1); //Aqui é pego o id do editText
        if(resp1.getText().toString().trim().isEmpty()){//Verifica se o campo não está vazio
            resp1.setError("Campo bolacha obrigatorio");
            resp1.requestFocus();//Se estiver vazio ele da um auto focus para o campo vazio
        }else {
            String resposta1 = resp1.getText().toString();//Pega o que está dentro do editText
            if(resposta1.equals("public final void nome_metodo(){}")){//Compara a resposta do usuario com a resposta certa
                total = total + 1;//Soma mais um ao total de pontos
            }
        }
        resp2 = (EditText)findViewById(R.id.resp2);
        if(resp2.getText().toString().trim().isEmpty()){
            resp2.setError("Campo bolacha obrigatorio");
            resp2.requestFocus();
        }else {
            String resposta2 = resp2.getText().toString();
            if(resposta2.equals("public static void nome_metodo(){}")){
                total = total + 1;
            }
        }
        resp3 = (EditText)findViewById(R.id.resp3);
        if(resp3.getText().toString().trim().isEmpty()){
            resp3.setError("Campo bolacha obrigatorio");
            resp3.requestFocus();
        }else {
            String resposta3 = resp3.getText().toString();
            if(resposta3.equals("Usar-se o extends, classe-filha extends classe-mae")){
                total = total + 1;
            }
        }
        resp4 = (EditText)findViewById(R.id.resp4);
        if(resp4.getText().toString().trim().isEmpty()){
            resp4.setError("Campo bolacha obrigatorio");
            resp4.requestFocus();
        }else {
            String resposta4 = resp4.getText().toString();
            if(resposta4.equals("Intent nome_intente = new Intent(this, nome_activity)")){
                total = total + 1;
            }
        }
        resp5 = (EditText)findViewById(R.id.resp5);
        if(resp5.getText().toString().trim().isEmpty()){
            resp5.setError("Campo bolacha obrigatorio");
            resp5.requestFocus();
        }else {
            String resposta5 = resp5.getText().toString();
            if(resposta5.equals("Toast.makeText(this, ''Algo escrito'', Toast.LENGTH_SHORT).show()")){
                total = total + 1;
            }
        }
        resp6 = (EditText)findViewById(R.id.resp6);
        if(resp6.getText().toString().trim().isEmpty()){
            resp6.setError("Campo bolacha obrigatorio");
            resp6.requestFocus();
        }else {
            String resposta6 = resp6.getText().toString();
            if(resposta6.equals("Ao placeholder")){
                total = total + 1;
            }
        }

        Integer porcentagem = (total/6)*100; //Faz o calculo da porcentagem
        String porcentagem_enviar = porcentagem.toString(); //Converte para string o resultado do calculo

        AlertDialog.Builder mostrar_qtde_acertos = new AlertDialog.Builder(this);// Cria um alertDialog
        mostrar_qtde_acertos.setMessage("Você acerto "+total+" de 6 questões");// seta a mensagem do alert
        mostrar_qtde_acertos.setNeutralButton("Ok",null);// Cria botao de confirmação "ok"
        mostrar_qtde_acertos.show();//Mostra o resultado do alert

        AlertDialog.Builder mostrar_porcentagem = new AlertDialog.Builder(this);
        mostrar_porcentagem.setMessage("Você acerto "+porcentagem_enviar+"% do Quiz");
        mostrar_porcentagem.setNeutralButton("Ok",null);
        mostrar_porcentagem.show();
    }

}
