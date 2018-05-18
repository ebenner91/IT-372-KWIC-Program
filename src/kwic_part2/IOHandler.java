package kwic_part2;

import java.io.*;

public class IOHandler {

    private LineProcessor lineProcessor;
    private static final String INFILE = "warAndPeace_modified.txt";
    private static final String OUTFILE = "WarAndPeaceSwappedAndSorted.txt";

    public IOHandler(LineProcessor lineProcessor) {

        this.lineProcessor = lineProcessor;
    }

    public void getLines() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    INFILE));
            String line = reader.readLine();
            while (line != null) {
                lineProcessor.addLine(line);
                // read next line
                line = reader.readLine();
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void outputLines() {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new
                    FileOutputStream(new File(OUTFILE))));
            for (int i = 0; i < lineProcessor.lineCount(); i++) {
                //print line to console
                System.out.println(lineProcessor.getLine(i));
                //add line to outfile
                writer.write(lineProcessor.getLine(i));
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
