package behavioural.strategy;

public class Rar implements ArchiveStrategy {
	@Override
	public CompressedFile compress(Content content) {
		System.out.printf("Archiving using Rar: %n");
		/* do rar specific logic here */
		return null;
	}
}
