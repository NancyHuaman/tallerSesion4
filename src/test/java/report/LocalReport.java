package report;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LocalReport {
    public static void main (String[]args){
        String ruta=new File("").getAbsolutePath()+"\\build\\reports\\cucumber\\";
        File folderReport= new File(ruta+"JBReport");

        List<String> jsonList= new ArrayList<>();
        jsonList.add(ruta+"report.json");

        Configuration configuration= new Configuration(folderReport,"JBMOVILE");
        configuration.setBuildNumber("1000");
        configuration.addClassifications("Owner","JB");
        configuration.addClassifications("SO","Android");
        configuration.addClassifications("Branch","master");

        ReportBuilder reportBuilder= new ReportBuilder(jsonList,configuration);
        reportBuilder.generateReports();
    }
}
