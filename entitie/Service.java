package FileTransform.entitie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Service {


    public static List<Data> insertMap(Map<Integer, String > insertMap){
        List<Data> listData = new ArrayList<>();

        insertMap.entrySet().stream().map(x ->
                listData.add(new Data(x.getKey(), x.getValue())))
                .collect(Collectors.toList());

        return listData;
    }

}
