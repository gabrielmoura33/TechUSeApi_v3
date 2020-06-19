package DAO;

import Classes.File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDAO implements DAO<File, Integer> {

    private List<File> fileList;
    private java.io.File file;
    private FileOutputStream fos;
    private ObjectOutputStream outputFile;

    public FileDAO (String filename) throws IOException {
        fileList = new ArrayList<File>();
        file = new java.io.File(filename);
        if (file.exists())
            readFromFile();
    }

    public File get(Integer chave) {
        for (File f : fileList) {
            if (chave.intValue() == f.getId()) {
                return f;
            }
        }
        return null;
    }

    public void add(File p) {
        fileList.add(p);
        saveToFile();
    }

    @Override
    public void update(File p) {

    }

    public void remove(File file) {
        int index = fileList.indexOf(file);

        if (index != -1) {
            fileList.set(index, file);
            saveToFile();
        }
        saveToFile();
    }

    @Override
    public List<File> getAll() {
        return null;
    }

    private void readFromFile() {
        File fileImg;
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream inputFile = new ObjectInputStream(fis)) {

            while (fis.available() > 0) {
                fileImg = (File) inputFile.readObject();
                fileList.add(fileImg);
            }
        } catch (Exception e) {
            System.out.println("ERRO ao ler Produto do disco!");
            e.printStackTrace();
        }
    }

    private void saveToFile() {
        try (FileOutputStream fos = new FileOutputStream(file, false);
             ObjectOutputStream outputFile = new ObjectOutputStream(fos)) {

            for (File f : fileList) {
                outputFile.writeObject(f);
            }
            outputFile.flush();
        } catch (Exception e) {
            System.out.println("ERRO ao gravar Produto no disco!");
            e.printStackTrace();
        }

    }

    private void close() throws IOException {
        outputFile.close();
        fos.close();
    }

}
