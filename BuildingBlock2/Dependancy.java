package BuildingBlock2;

class DataFetcher {
    public String fetch() {
        return "Data fetched!";
    }
}

class ReportService {
    public void generateReport(DataFetcher fetcher) {
        System.out.println(fetcher.fetch());
    }
}

public class Dependancy {
    
}
