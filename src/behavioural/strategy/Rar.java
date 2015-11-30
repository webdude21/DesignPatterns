package behavioural.strategy;

/**
 * Created by webdude on 30.11.15.
 */
public class Rar implements Archiver {
    @Override
    public void compress(Content content) {
        System.out.printf("First archive the files and sort them: %n");
        String[] folders = content.getFolders();
        String[] files = content.getFiles();

        for (int i = 0; i < folders.length; i++) {
            System.out.printf("archiving folder %s%n", folders[i]);
        }

        for (int i = 0; i < files.length; i++) {
            System.out.printf("archiving file %s%n", folders[i]);
        }
    }
}
