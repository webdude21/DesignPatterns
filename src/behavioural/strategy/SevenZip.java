package behavioural.strategy;

public class SevenZip implements Archiver {

    @Override
    public void compress(Content content) {
        System.out.printf("First archive the folders: %n");
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
