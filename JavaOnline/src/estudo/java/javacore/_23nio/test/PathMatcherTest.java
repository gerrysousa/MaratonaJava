package estudo.java.javacore._23nio.test;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class PathMatcherTest {

  public static void main(String[] args) throws IOException {
    Path path1 = Paths.get("pasta/subpasta1/subpasta2/file.bkp");
    Path path2 = Paths.get("file.bkp");
    Path path3 = Paths.get("bastiao-napo");
    Path path4 = Paths.get("exato");

    PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.bkp");
    System.out.println(matcher.matches(path1));
    System.out.println(matcher.matches(path2));
    System.out.println("--------------------------");
    testarMatches(path1, "glob:*.bkp");
    testarMatches(path1, "glob:**/*.bkp");
    testarMatches(path1, "glob:*");
    testarMatches(path1, "glob:**");
    testarMatches(path1, "glob:*.???");
    testarMatches(path1, "glob:**/*.???");
    testarMatches(path1, "glob:**.???");
    System.out.println("--------------------------");
    testarMatches(path3, "glob:{bastiao*,napo*}");
    testarMatches(path3, "glob:{bastiao,napo}*");
    testarMatches(path3, "glob:{bastiao,napo}");
    testarMatches(path4, "glob:{exato,napo}");
    System.out.println("--------------------------");

    Files.walkFileTree(Paths.get("./"), new FindAllTest());
  }

  private static void testarMatches(Path path, String glob){
    PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
    System.out.println(glob+": "+matcher.matches(path));
  }


}

class FindAllTest extends SimpleFileVisitor<Path>{
  private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test}.{java,class}");

  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
    if (matcher.matches(file)){
      System.out.println(file.getFileName());
    }
    return FileVisitResult.CONTINUE;
  }
}