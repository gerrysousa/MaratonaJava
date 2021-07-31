package estudo.java.javacore._23nio.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipandoTest {

  public static void main(String[] args) {
    zipando02();
  }

  private static void zipando01() {
    Path dirZip = Paths.get("pasta");
    Path dirFiles = Paths.get("pasta/subpasta1/subpasta2");
    Path zipFile = dirZip.resolve("arquivo.zip");

    try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
        DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)) {
      for (Path path : stream) {
        ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
        zip.putNextEntry(zipEntry);
        FileInputStream fileInputStream = new FileInputStream(path.toFile());
        byte[] buff = new byte[2048];
        int byteRead;
        while ((byteRead = fileInputStream.read(buff)) > 0) {
          zip.write(buff, 0, byteRead);
        }
        zip.closeEntry();
        fileInputStream.close();
      }
      System.out.println("Zip concluido");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void zipando02() {
    Path dirZip = Paths.get("pasta");
    Path dirFiles = Paths.get("pasta/subpasta1/subpasta2");
    Path zipFile = dirZip.resolve("arquivo.zip");

    try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
        DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)) {
      for (Path path : stream) {
        ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
        zip.putNextEntry(zipEntry);
        FileInputStream fileInputStream = new FileInputStream(path.toFile());
        BufferedInputStream bf = new BufferedInputStream(fileInputStream);
        byte[] buff = new byte[2048];
        int byteRead;
        while ((byteRead = bf.read(buff)) > 0) {
          zip.write(buff, 0, byteRead);
        }
        zip.flush();
        zip.closeEntry();
        fileInputStream.close();
      }
      System.out.println("Zip concluido");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  private static void zipando03() {
    Path dirZip = Paths.get("pasta");
    Path dirFiles = Paths.get("pasta/subpasta1/subpasta2");
    Path zipFile = dirZip.resolve("arquivo.zip");

    try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
        DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)) {
      for (Path path : stream) {
        zip.putNextEntry(new ZipEntry(path.getFileName().toString()));
        BufferedInputStream bf = new BufferedInputStream(new FileInputStream(path.toFile()));
        byte[] buff = new byte[2048];
        int byteRead;
        while ((byteRead = bf.read(buff)) > 0) {
          zip.write(buff, 0, byteRead);
        }
        zip.flush();
        zip.closeEntry();
        bf.close();
      }
      System.out.println("Zip concluido");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
