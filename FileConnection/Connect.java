package FileTransform.FileConnection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class Connect {

    private BufferedReader bufferedReader;
    private FileReader fileReader;
    private String string;

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }

    public void setBufferedReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public FileReader getFileReader() {
        return fileReader;
    }

    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public BufferedReader creatConnection(String path) throws FileNotFoundException {
        setString(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(getString()));
        setBufferedReader(bufferedReader);
        return bufferedReader;
    }

    public String getReadLine() throws IOException {
        return bufferedReader.readLine();
    }



}
