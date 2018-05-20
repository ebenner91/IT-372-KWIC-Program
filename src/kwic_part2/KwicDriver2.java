package kwic_part2;

public class KwicDriver2 {

    public static void main(String[] args) {
        LineProcessor lineProcessor = new LineProcessor();
        IOHandler ioHandler = new IOHandler(lineProcessor);

        ioHandler.getLines();
        lineProcessor.wordSwapper();
        lineProcessor.sortLines();
        ioHandler.outputLines();
    }

}
