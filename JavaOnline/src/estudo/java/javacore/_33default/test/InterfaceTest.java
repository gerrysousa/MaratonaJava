package estudo.java.javacore._33default.test;

import estudo.java.javacore._33default.interfaces.MyList;

public class InterfaceTest implements MyList {

  public static void main(String[] args) {
    MyList.sort();
    new InterfaceTest().remove();
  }

  @Override
  public void add() {

  }
}
