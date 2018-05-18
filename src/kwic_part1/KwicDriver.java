package kwic_part1;

public class KwicDriver {


    public static void main(String[] args) {
        KwicProcessor processor = new KwicProcessor();

        processor.getLines();

        processor.sortLines();

        processor.sendLines();

    }


}
