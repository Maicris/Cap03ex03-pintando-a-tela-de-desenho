package br.com.criandojogosandroid.cap03ex03_pintando_a_tela_de_desenho;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Tela tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tela = new Tela(this);
        setContentView(tela);
    }

    private class Tela extends View {

        public Tela(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            //canvas.drawRGB(0, 0, 255);
            //canvas.drawARGB(255, 0, 0, 255);
            canvas.drawColor(Color.BLUE);
        }
    }
}
