package caraoucoroa.cursoandroid.com.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar;
    private String[] opcao = {"cara","coroa"};

    @Override

    //O Bundle é usado para passar dados entre componentes Android através da classe Intent.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = findViewById(R.id.jogarId);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //gerar numero aleatorio
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(2);

                //opcao[numeroAleatorio]

                Intent intent = new Intent(MainActivity.this, DetalhesActivity.class);

                /* Os dados podem ser passados ​​para outra activity usando o putExtra()
                 putExtra("chave","valor") serve para adicionar o valor de um objeto
                 para uma intent para enviar para outra Activity
                 */
                intent.putExtra("opcao", opcao[numeroAleatorio]);

                startActivity( intent );


            }
        });
    }
}
