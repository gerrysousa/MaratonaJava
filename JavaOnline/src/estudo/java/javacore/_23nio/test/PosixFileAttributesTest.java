package estudo.java.javacore._23nio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest {
  public static void main(String[] args) throws IOException {
    /*** Use command "$ll" para ver as permissões no terminal linux
    Compile o arquivo java com o commando $javac NomeArquivo.java
    Execute  com o commando $java NomeArquivo
     */

    System.out.println("Iniciando >>> ");
    Path path = Paths.get("pasta/arquivo.txt");
    PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
    System.out.println("Permissions: "+posixFileAttributes.permissions());
    System.out.println("Alterando permissões ---------");
    Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-rw-rw-");
    Files.setPosixFilePermissions(path, permissions);
    posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
    System.out.println("Permissions: "+posixFileAttributes.permissions());
  }

}
