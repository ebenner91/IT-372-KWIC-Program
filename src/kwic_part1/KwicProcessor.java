package kwic_part1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class KwicProcessor {

    private ArrayList<String> lines;

    public KwicProcessor() {
        this.lines = new ArrayList<>();
    }

    public void getLines() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "warAndPeace_modified.txt"));
            String line = reader.readLine();
            while (line != null) {
                line = wordSwapper(line);
                lines.add(line);
                // read next line
                line = reader.readLine();
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String wordSwapper(String line) {
        String[] lineArray = line.split(" ");
        String firstWord = lineArray[0];
        StringBuilder swappedLine = new StringBuilder();
        for(int i = 1; i < lineArray.length; i++) {
            swappedLine.append(lineArray[i]).append(" ");
        }

        swappedLine.append(firstWord);

        return swappedLine.toString();
    }

    public void sortLines() {
        Collections.sort(lines);
    }

    public void sendLines() {

        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new
                    FileOutputStream(new File("WarAndPeaceSwappedAndSorted.txt"))));
            for (String line : lines) {
                //print line to console
                System.out.println(line);
                //add line to outfile
                writer.write(line);
                writer.newLine();


            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
