package estudo.java.javacore._27jdbc.classes;

import java.sql.SQLException;
import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;

public class MyRowSetListener implements RowSetListener {

  @Override
  public void rowSetChanged(RowSetEvent event) {
    System.out.println("Comando execute acionado");
  }

  @Override
  public void rowChanged(RowSetEvent event) {
    System.out.println("Linha foi inserida, atualizada ou deletada");
    if (event.getSource() instanceof RowSet) {
      try {
        ((RowSet) event.getSource()).execute();
      }catch (SQLException e){
        e.printStackTrace();
      }
    }
  }

  @Override
  public void cursorMoved(RowSetEvent event) {
    System.out.println("Comando move acionado");
  }
}
