
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

    public class ReadFile {

        public static void main(String[] args) {

            try {
                File myObj = new File("C:\\Users\\et033863\\Desktop\\input.txt");
                File outputFile = new File("C:\\Users\\et033863\\Desktop\\output.txt") ;
                FileWriter myWriter = new FileWriter(outputFile) ;
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {

                    String data = myReader.nextLine();
                    ArrayList<Integer> arrayList = convertStringtoArraylist(data);

                    for(int i = 0 ; i < arrayList.toArray().length; i++) {

                        if((arrayList.get(i) % 2) == 0) {
                            myWriter.write("not\n");

                        } else {
                            myWriter.write("prime\n");
                        }
                    }
                      myReader.close();
                    }

            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        public static ArrayList<Integer> convertStringtoArraylist(String data){

            String[] numbersString = data.split("\\s+") ;
            ArrayList<Integer> arrayList = new ArrayList<>() ;
            for(String num : numbersString) {
                arrayList.add(Integer.parseInt(num)) ;
                }

            return arrayList;
        }


    }

