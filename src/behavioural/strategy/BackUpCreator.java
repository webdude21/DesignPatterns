package behavioural.strategy;

public class BackUpCreator {

    private ArchiverStrategy archiverStrategy;
    private CompressedFile backup;

    /**
     * The backup creator uses the archive strategy to compress the content.
     * Additional archiver strategies can be added without modifying the existing code.
     */
    public BackUpCreator(ArchiverStrategy archiverStrategy) {
        this.archiverStrategy = archiverStrategy;
    }

    public void BackUpFolder(Content content) {
        backup = this.archiverStrategy.compress(content);
    }
}
