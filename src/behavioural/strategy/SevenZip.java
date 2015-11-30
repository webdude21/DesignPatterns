package behavioural.strategy;

public class SevenZip implements ArchiverStrategy {

    @Override
    public CompressedFile compress(Content content) {
        System.out.printf("Archiving using 7Zip: %n");
           /* do 7Zip specific logic here */
        return null;
    }
}
