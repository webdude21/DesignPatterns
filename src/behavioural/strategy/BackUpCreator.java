package behavioural.strategy;

class BackUpCreator {

	private ArchiveStrategy archiveStrategy;

	private CompressedFile backup;

	/**
	 * The backup creator uses the archive strategy to compress the content.
	 * Additional archive strategies can be added without modifying the existing code.
	 * One of the patterns that is completely unnecessary in Functional languages / or languages with first class functions.
	 */
	BackUpCreator(ArchiveStrategy archiveStrategy) {
		this.setArchiveStrategy(archiveStrategy);
	}

	void BackUpFolder(Content content) {
		backup = this.getArchiveStrategy().compress(content);
	}

	private ArchiveStrategy getArchiveStrategy() {
		return archiveStrategy;
	}

	void setArchiveStrategy(ArchiveStrategy archiveStrategy) {
		this.archiveStrategy = archiveStrategy;
	}
}
