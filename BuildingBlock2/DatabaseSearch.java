package BuildingBlock2;
import java.util.*;
public class DatabaseSearch implements SearchService {
    @Override
    public List<String> search(String query) {
        return List.of("DB Result 1", "DB Result 2");
    }
}