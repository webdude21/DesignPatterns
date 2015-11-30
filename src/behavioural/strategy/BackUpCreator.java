package behavioural.strategy;

public class BackUpCreator {

    private ArchiverStrategy archiverStrategy;
    private CompressedFile backup;

    /**
     * The backup creator uses the archive strategy to compress the content.
     * Additional archiver strategies can be added without modifying the existing code.
     * One of the patterns that is completely unnecessary in Functional languages / or languages with first class functions.
     */
    public BackUpCreator(ArchiverStrategy archiverStrategy) {
        this.setArchiverStrategy(archiverStrategy);
    }

    public void BackUpFolder(Content content) {
        backup = this.getArchiverStrategy().compress(content);
    }

    public ArchiverStrategy getArchiverStrategy() {
        return archiverStrategy;
    }

    public void setArchiverStrategy(ArchiverStrategy archiverStrategy) {
        this.archiverStrategy = archiverStrategy;
    }
}
