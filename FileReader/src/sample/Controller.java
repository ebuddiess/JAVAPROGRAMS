package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.DirectoryChooser;
import javafx.stage.Window;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {

    Label pathlbl;
    ListView filelistview;
    private String path ;
    public void fileChooser(ActionEvent event){
        Node source = (Node) event.getSource();
        pathlbl = (Label) source.getScene().lookup("#path_label");
        filelistview = (ListView) source.getScene().lookup("#file_list");
        DirectoryChooser dir = new DirectoryChooser();
        dir.setTitle("Select Folder Path");
        File selectedFile = dir.showDialog(null);
        path = selectedFile.getAbsolutePath();
        pathlbl.setText(path);
        File files[] = selectedFile.listFiles();
        for(File file:files){
        if(file.isFile()){
            filelistview.getItems().addAll(file.getName().toString()+" is a File");
        }else{
            filelistview.getItems().addAll(file.getName().toString()+" is a Directory");
        }
        }
    }

    public void saveFiles(ActionEvent evt){

        DirectoryChooser dir = new DirectoryChooser();
        dir.setTitle("Select path to Save File");
        File selectedFile = dir.showDialog(null);
        path = pathlbl.getText();
        File pathfile = new File(selectedFile.getAbsolutePath()+"/data.csv");
        FileWriter fr = null;
        File files[] = new File(path).listFiles();
        String data = "";
        data="FileName"+","+"isFile"+"\n";
        for(File file :files){
            data+=file.getName()+","+file.isFile()+"\n";
        }
        try {
            fr=new FileWriter(pathfile);
            fr.write(data);
            JOptionPane.showMessageDialog(null,"Saved Sucessfully at "+selectedFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error occured "+e.getMessage().toString());
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
