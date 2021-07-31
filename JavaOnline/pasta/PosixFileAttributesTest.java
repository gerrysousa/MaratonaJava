

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest {
  public static void main(String[] args) throws IOException {
    System.out.println("Iniciando >>> ");
    Path path = Paths.get("arquivo.txt");
    PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
    System.out.println("Permissions: "+posixFileAttributes.permissions());
    System.out.println("Alterando permissões ---------");
    Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-rw-rw-");
    Files.setPosixFilePermissions(path, permissions);
    posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
    System.out.println("Permissions: "+posixFileAttributes.permissions());
  }

}
