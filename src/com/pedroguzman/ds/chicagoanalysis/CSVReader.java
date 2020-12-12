package com.pedroguzman.ds.chicagoanalysis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.pedroguzman.ds.chicagoanalysis.models.Worker;

public class CSVReader {

    /**
     *
     * @param args
     */
    public static void main(String[] args){

        String dataCsvFileLocation = "/Users/subvertic/Downloads/data.csv";
        String csvSeparator = ",";
        String line = "";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(dataCsvFileLocation))){
            while((line = bufferedReader.readLine()) != null){
                String[] person = line.split(csvSeparator);
                Worker personObj = new Worker(
                        person[1],
                        person[0],
                        person[2],
                        person[3],
                        person[4],
                        person[5],
                        person[6],
                        person[7],
                        person[8]
                );
                System.out.println(personObj.toString());
            } // WHILE ENDS
        } catch(FileNotFoundException fileNotFoundException){
            System.out.println("The file provided is not valid");
        } catch (IOException ioException){
            // Acá vamos a poner el código que se ejecuta si leer el archivo falla
            ioException.printStackTrace();
        }

    } // MAIN METHOD ENDS -----------------------------------------------------

} // CLASS CSV READER ENDS ----------------------------------------------------
