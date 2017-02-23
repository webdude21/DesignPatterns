package behavioural.strategy;

public interface ArchiveStrategy {
	CompressedFile compress(Content content);
}
