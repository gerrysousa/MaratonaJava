package estudo.java.javacore._23nio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

public class FileVisitorTest {

  public static void main(String[] args) throws IOException {
    Files.walkFileTree(Paths.get("pasta"), new PrintDirs2());
  }
}

class AcharTodosArquivosBkp extends SimpleFileVisitor<Path> {

  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
    if (file.getFileName().toString().endsWith(".bkp")) {
      System.out.println(file.getFileName());
    }
    return FileVisitResult.CONTINUE;
  }
}

class AcharTodosArquivos extends SimpleFileVisitor<Path> {

  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
    System.out.println(file.getFileName());
    return FileVisitResult.CONTINUE;
  }
}

class PrintDirs extends SimpleFileVisitor<Path>{
  @Override
  public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException
  {
    System.out.println("Pre: "+dir);
    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException
  {
    System.out.println("File: "+file.getFileName());
    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult postVisitDirectory(Path dir, IOException exc)throws IOException
  {
    System.out.println("Pos: "+dir);
    return FileVisitResult.CONTINUE;
  }
}

class PrintDirs2 extends SimpleFileVisitor<Path>{
  @Override
  public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException
  {
    if(dir.getFileName().toString().equals("subpasta1")){
      return FileVisitResult.SKIP_SIBLINGS;
    }

    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException
  {
    System.out.println("File: "+file.getFileName());
    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult postVisitDirectory(Path dir, IOException exc)throws IOException
  {
    System.out.println("Pos: "+dir);
    return FileVisitResult.CONTINUE;
  }
}