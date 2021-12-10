package estudo.java.javacore._29concorrencia.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleddThreadPoolTest {
  private static final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

  public static void beep() {
    /**
     Se vc quiser agentar um seviço para execurar de tempos em tempos pode utilizar o metodo abaixo
     scheduledExecutorService.schedule(Runnable, 5, TimeUnit.SECONDS);
     ------------------
     -scheduledExecutorService.scheduleAtFixedRate(beeper, 1,5, TimeUnit.SECONDS);   -> na primeira oportunidade após o tempo definido ele executa (não leva em conta o tempo de processamento)
     -scheduledExecutorService.scheduleWithFixedDelay(beeper, 1,5, TimeUnit.SECONDS);-> após o tempo de processamento na primeira oportunidade após o tempo definido ele executa

     */

    final Runnable beeper = new Runnable() {
      @Override
      public void run() {
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())+" beep");
        try{
          TimeUnit.SECONDS.sleep(2);
        }
        catch (InterruptedException e){
          e.printStackTrace();
        }
      }
    };

   // scheduledExecutorService.scheduleAtFixedRate(beeper, 1,5, TimeUnit.SECONDS);
   // scheduledExecutorService.scheduleWithFixedDelay(beeper, 1,5, TimeUnit.SECONDS);

    final ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(beeper, 1,5, TimeUnit.SECONDS);
    scheduledExecutorService.schedule(new Runnable() {
      @Override
      public void run() {
        System.out.println("Cancelando");
        scheduledFuture.cancel(false);
        scheduledExecutorService.shutdown();//para cancelar uma ThreadPool deve-se executar o shutdow
      }
    }, 10,TimeUnit.SECONDS);
  }

  public static void main(String[] args) {
    beep();
  }
}
