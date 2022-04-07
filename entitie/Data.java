package FileTransform.entitie;

public class Data {

    private Integer key;
    private String data;

    public Data(Integer key, String data) {
        this.key = key;
        this.data = data;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", data=" + data +
                '}';
    }


}
