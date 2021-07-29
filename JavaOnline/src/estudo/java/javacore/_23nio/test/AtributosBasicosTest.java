package estudo.java.javacore._23nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AtributosBasicosTest {

  public static void main(String[] args) {
    Date primeiroDeDezembro = new GregorianCalendar(2020, Calendar.DECEMBER, 1).getTime();
    File file = new File("pasta\\arquivo.txt");
    try {
      file.createNewFile();
      file.setLastModified(primeiroDeDezembro.getTime());
      System.out.println("Last modified file: "+ file.lastModified());
      file.delete();

      Path filePath = Paths.get("pasta\\arquivo_path.txt");
      Files.createFile(filePath);
      FileTime fileTime = FileTime.fromMillis(primeiroDeDezembro.getTime());
      Files.setLastModifiedTime(filePath, fileTime);
      System.out.println("Last modified filePath: "+Files.getLastModifiedTime(filePath));
      Files.deleteIfExists(filePath);

      filePath = Paths.get("src/estudo/java/javacore/_1introducaoclasses/test/CarroTest.java");
      System.out.println("isReadable: "+Files.isReadable(filePath));
      System.out.println("isWritable: "+Files.isWritable(filePath));
      System.out.println("isExecutable: "+Files.isExecutable(filePath));

      // Essas são somente para leitura
      //BasicFileAttributes,PosixFileAttributes, DosFileAttributes
      BasicFileAttributes basicFileAttributes = Files.readAttributes(filePath, BasicFileAttributes.class);
      System.out.println("creationTime: "+basicFileAttributes.creationTime());
      System.out.println("lastAccessTime: "+basicFileAttributes.lastAccessTime());
      System.out.println("lastModifiedTime: "+basicFileAttributes.lastModifiedTime());
      System.out.println("isDirectory: "+basicFileAttributes.isDirectory());
      System.out.println("isSymbolicLink: "+basicFileAttributes.isSymbolicLink());
      System.out.println("isRegularFile: "+basicFileAttributes.isRegularFile());
      System.out.println("---------------------------------------------------------");

      // Essas são para leitura e Escrita
      //BasicFileAttributeView,PosixFileAttributeView, DosFileAttributeView, FileOwnerAttributeView, AclFileAttributeView
      FileTime lastModified = basicFileAttributes.lastModifiedTime();
      FileTime create = basicFileAttributes.creationTime();
      FileTime lastAccess = FileTime.fromMillis(System.currentTimeMillis());
      BasicFileAttributeView basicView = Files.getFileAttributeView(filePath, BasicFileAttributeView.class);
      basicView.setTimes(lastModified, lastAccess, create);
      basicFileAttributes = Files.readAttributes(filePath, BasicFileAttributes.class);

      System.out.println("creationTime: "+basicFileAttributes.creationTime());
      System.out.println("lastAccessTime: "+basicFileAttributes.lastAccessTime());
      System.out.println("lastModifiedTime: "+basicFileAttributes.lastModifiedTime());

    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
