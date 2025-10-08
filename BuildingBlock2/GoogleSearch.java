package BuildingBlock2;
import java.util.*;;
public class GoogleSearch implements SearchService {
    @Override
    public List<String> search(String query) {
        return List.of("Result 1", "Result 2");
    }
}


// interface all file its own file directory
/*
 * public interface SearchService {
    List<String> search(String query);
}

public class GoogleSearch implements SearchService {
    @Override
    public List<String> search(String query) {
        return List.of("Result 1", "Result 2");
    }
}

public class DatabaseSearch implements SearchService {
    @Override
    public List<String> search(String query) {
        return List.of("DB Result 1", "DB Result 2");
    }
}

 */