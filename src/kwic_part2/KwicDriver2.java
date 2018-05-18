package kwic_part2;

public class KwicDriver2 {

    public static void main(String[] args) {
        LineProcessor lineProcessor = new LineProcessor();
        IOHandler ioHandler = new IOHandler(lineProcessor);

        ioHandler.getLines();
        wordSwapper(lineProcessor);
        lineProcessor.sortLines();
        ioHandler.outputLines();
    }

    private static void wordSwapper(LineProcessor lineProcessor) {

        for(int i = 0; i < lineProcessor.lineCount(); i++) {
            String line = lineProcessor.getLine(i);
            String[] lineArray = line.split(" ");
            String firstWord = lineArray[0];
            StringBuilder swappedLine = new StringBuilder();
            for(int j = 1; j < lineArray.length; j++) {
                swappedLine.append(lineArray[j]).append(" ");
            }

            swappedLine.append(firstWord);
            lineProcessor.replaceLine(swappedLine.toString(), i);
        }

    }
}
