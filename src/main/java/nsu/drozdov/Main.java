package nsu.drozdov;

import nsu.drozdov.utility.ArgumentParser;
import nsu.drozdov.utility.SortOptions;

public class Main {
    public static void main(String[] args) {
        ArgumentParser argumentParser = new ArgumentParser(args);
        SortOptions sortOptions = argumentParser.parseArgs();
        Sorter sorter = new Sorter(sortOptions);
    }
}
