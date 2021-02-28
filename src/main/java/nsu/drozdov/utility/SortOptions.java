package nsu.drozdov.utility;

public class SortOptions {
    private SortParams sortOrder = SortParams.ASC;
    private SortParams sortType;
    private String outFileName;
    private String[] inFileNames;

    void setSortOrder(SortParams order) {
         sortOrder = order;
    }

    SortParams getSortOrder() {
        return sortOrder;
    }

    void setSortType(SortParams type) {
        sortType = type;
    }

    SortParams getSortType() {
        return sortType;
    }

    void setOutFileName(String fileName) {
        outFileName = fileName;
    }

    String getOutFileName() {
        return outFileName;
    }

    void setInFileNames(String[] fileNames) {
        inFileNames = fileNames;
    }

    String[] getInFileNames() {
        return inFileNames;
    }
}
