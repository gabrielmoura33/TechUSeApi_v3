package Service;

import Classes.File;
import DAO.FileDAO;
import com.google.gson.Gson;
import spark.Request;
import spark.Response;

import java.io.IOException;

public class FileService {
    private FileDAO fileDAO;

    public  FileService() {
        try {
            fileDAO = new FileDAO("images.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object add(Request request, Response response) {
        response.type("application/json");
        File fileImg = new Gson().fromJson(request.body(), File.class);
        fileDAO.add(fileImg);
        response.header("Content-Type","application/json");
        return new Gson().toJson(fileImg.getId());
    }

    public Object get(Request request, Response response) {
        response.header("Content-Type", "application/json");
        int id = Integer.parseInt(request.params(":id"));
        return fileDAO.get(id);
    }
}
