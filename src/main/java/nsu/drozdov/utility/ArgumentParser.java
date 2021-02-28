package nsu.drozdov.utility;



public class ArgumentParser {
    private SortOptions sortOptions = new SortOptions();
    private String[] arguments;

    public ArgumentParser(String[] args) {
        arguments = args;
    }

    public SortOptions parseArgs() {
        int curr_arg = 1;
        if (arguments.length > 2) {
            switch (arguments[0]) {
                case "-a":
                    sortOptions.setSortOrder(SortParams.ASC);
                    break;
                case "-d":
                    sortOptions.setSortOrder(SortParams.DESC);
                    break;
                default:
                    curr_arg = 0;
            }
            switch (arguments[curr_arg++]) {
                case "-i":
                    sortOptions.setSortType(SortParams.NUMBER);
                    break;
                case "-s":
                    sortOptions.setSortType(SortParams.STRING);
                    break;
                default:
                    throw new IllegalArgumentException("Missing or Invalid sort data type");
            }
//            curr_arg++;
            sortOptions.setOutFileName(arguments[curr_arg++]);
//            curr_arg++;
            String[] inFileNames = new String [arguments.length - curr_arg];
            System.arraycopy(arguments, curr_arg, inFileNames, 0, arguments.length - curr_arg);
            sortOptions.setInFileNames(inFileNames);
        } else {
            throw new IllegalArgumentException("Invalid number of arguments");
        }
        return sortOptions;
    }
}
