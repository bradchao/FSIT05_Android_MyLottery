package tw.brad.mylottery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class CupActivity extends AppCompatActivity {
    private ImageView imgCup;
    private int[] cups = {
      R.drawable.cup0, R.drawable.cup1,
      R.drawable.cup2, R.drawable.cup2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cup);

        imgCup = findViewById(R.id.cupimg);

        int rand = (int)(Math.random()*4);
        imgCup.setImageResource(cups[rand]);

        setResult(rand);
    }
}
