/**
 * Hello world!
 */
import java.util.Timer;
import java.util.TimerTask;
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("��ǰʱ��:" + this.scheduledExecutionTime());
            }
        }, 0, 1000);
    }
}