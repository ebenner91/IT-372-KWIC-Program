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
}
