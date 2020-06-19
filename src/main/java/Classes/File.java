package Classes;

import java.io.Serializable;

public class File implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String base64;
    public File(int product_id, String base64) {
        this.id = product_id;
        this.base64 = base64;
    }

    public File() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public boolean equals(Object obj) {
        return this.getId() == ((File) obj).getId();
    }

}
