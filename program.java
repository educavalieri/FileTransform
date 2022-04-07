package FileTransform;

import FileTransform.FileConnection.FilleConnect;
import FileTransform.entitie.Data;
import FileTransform.entitie.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class program {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\e.adriano.cavalieri\\IdeaProjects\\test\\src\\FileTransform\\arquivo.txt";
        FilleConnect fille = FilleConnect.getINSTANCE();
        fille.setPath(path);
        String test = fille.getReadLine();
        String[] testSplit;
        Map<Integer, String> listMap = new HashMap<>();

        while (test != null){
            testSplit = test.split(":");
            listMap.put(Integer.parseInt(testSplit[0]), testSplit[1]);
            test = fille.getReadLine();
        }

        System.out.println(listMap);

        List<Data> informs = Service.insertMap(listMap);
        System.out.println(informs);

    }







}
