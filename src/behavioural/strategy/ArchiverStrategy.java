package behavioural.strategy;

public interface ArchiverStrategy {
    CompressedFile compress(Content content);
}
