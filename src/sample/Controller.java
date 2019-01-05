package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Controller {
    public long time;
    public boolean counting;
    public int clickcount;

    @FXML private Button button;
    @FXML private ProgressBar progressbar;









    public void press()
    {
        if (clickcount == 0)
        {
            clickcount++;
            time = System.nanoTime();
            if (time + 1000000000 > System.nanoTime())
            {
                counting = true;

            }
            else
                counting = false;
        }



        else if (clickcount !=0)
        {
            if ( (time + 10000000000L > System.nanoTime()))
            {
                button.setText("Press me!!!!!");
                long num = (( (time + 10000000000L) - System.nanoTime())/1000000000L);
                num = ((10-num));
                double num2 = (double) num/10;
                progressbar.setProgress(num2);
                System.out.println("+1 to score");
                clickcount++;
            }
            else if ((time + 10000000000L < System.nanoTime())) {
                button.setText("Don't press me");
                System.out.println("the game is over!");
                System.out.println("Your score is " + clickcount);

            }
        }


    }


}
