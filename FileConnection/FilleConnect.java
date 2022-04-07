package FileTransform.FileConnection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class FilleConnect extends Connect{

    private static FilleConnect INSTANCE;

    static {
        try {
            INSTANCE = new FilleConnect();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String path;


    private FilleConnect() throws FileNotFoundException {
        setString(path);

        if (path == null){
            setString("C:\\Users\\e.adriano.cavalieri\\IdeaProjects\\test\\src\\FileTransform\\arquivo.txt");
        }

        creatConnection(getString());
    }

    public static FilleConnect getINSTANCE(){
        return INSTANCE;
    }


    public static void setPath(String thePath){
        path = thePath;
    }


}
