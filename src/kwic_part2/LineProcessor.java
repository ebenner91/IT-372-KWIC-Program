package kwic_part2;

import java.util.ArrayList;
import java.util.Collections;

public class LineProcessor {
    private ArrayList<String> lines;

    public LineProcessor() {
        this.lines = new ArrayList<>();
    }

    public void sortLines() {
        Collections.sort(lines);
    }

    public void addLine(String line) {
        lines.add(line);
    }

    public int lineCount() {
        return lines.size();
    }

    public String getLine(int index) {
        return lines.get(index);
    }

    public void replaceLine(String line, int index) {
        lines.set(index, line);
    }

    public void wordSwapper() {

        for(int i = 0; i < lineCount(); i++) {
            String line = getLine(i);
            String[] lineArray = line.split(" ");
            String firstWord = lineArray[0];
            StringBuilder swappedLine = new StringBuilder();
            for(int j = 1; j < lineArray.length; j++) {
                swappedLine.append(lineArray[j]).append(" ");
            }

            swappedLine.append(firstWord);
            replaceLine(swappedLine.toString(), i);
        }

    }
}
