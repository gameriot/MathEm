package ovss.math_em;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.IOException;
import java.lang.*;

public class GameActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Main m = new Main();
        m.play();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final TextView ans = (TextView) findViewById(R.id.Ans);
        ans.setText(m.Ans);

        final Button right = (Button) findViewById(R.id.Right);
        right.setText(m.right);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        final Button wrong1 = (Button) findViewById(R.id.Wrong1);
        wrong1.setText(m.wrong1);
        wrong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {

            }
        });

        final Button wrong2 = (Button) findViewById(R.id.Wrong2);
        wrong2.setText(m.wrong2);
        wrong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {

            }
        });

        int x = 3;
        {
            while (x>=0) {
            try {
                Thread.sleep(1000);
                TextView timer = (TextView) findViewById(R.id.timer);
                timer.setText(Integer.toString(x));
                x -= 1;
            } catch (InterruptedException e) {

            }
        }

    }
}



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
