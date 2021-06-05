package sg.edu.rp.c346.id20022404.demooptionmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText, tvTranslatedText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        tvTranslatedText2 = findViewById(R.id.textViewTranslatedText2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //menu.add(0,0,100,"English");
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            tvTranslatedText.setText("Hello");
            tvTranslatedText2.setText("Bye");
        } else if (id == R.id.italianSelection) {
            tvTranslatedText.setText("Ciao");
            tvTranslatedText2.setText("Addio");
        }

        return super.onOptionsItemSelected(item);
    }

}