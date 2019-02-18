import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MapGenerator {
    ArrayList<GameContinent> continent_list;
    ArrayList<GameCountry> country_list;

    public BufferedReader readContinentList(BufferedReader input_reader) throws IOException {
        String input_line;
        continent_list = new ArrayList<>();
        input_line = input_reader.readLine();
        while(input_line!="[Territories]"){
            GameContinent continent = new GameContinent();
            String name = input_line.substring(0,input_line.indexOf("="));
            String value = input_line.substring(input_line.indexOf("=")+1);
            continent.setContinent_name(name);
            continent.setContinent_value(value);
            continent_list.add(continent);
            input_line = input_reader.readLine();
        }
        return input_reader;          //Return the current position of reader file so that countries can be loaded.
    }
    public BufferedReader readCountryList(BufferedReader input_reader) throws IOException {
        String input_line;
        country_list = new ArrayList<>();
        input_line = input_reader.readLine();
        while(input_line!=null){

            String[] inp_list = input_line.split(",");
            GameCountry current_country;
            if(countryExists(inp_list[0])==null) {
                current_country = new GameCountry();
                country_list.add(current_country);
            }
            else{
                current_country = countryExists(inp_list[0]);
            }
            current_country.setCountry_name(inp_list[0]);
            current_country.setCoordinate_x(inp_list[1]);
            current_country.setCoordinate_y(inp_list[2]);
            for(int iterator=3;iterator<inp_list.length; iterator++){
                GameCountry neighbor_country;
                if(countryExists(inp_list[iterator])==null){
                    neighbor_country = new GameCountry();
                    country_list.add(neighbor_country);
                    neighbor_country.setCountry_name(inp_list[iterator]);
                }
                else{
                    neighbor_country = countryExists(inp_list[iterator]);
                }
                current_country.addNeighbouring_country(neighbor_country);
            }
            input_line = input_reader.readLine();
        }

        return input_reader;
    }
    public GameCountry countryExists(String  country_name){

        for(GameCountry temp_country : country_list){
            if(temp_country.getCountry_name().equals(country_name)){
                return temp_country;
            }
        }
        return null;
    }

        public String ReadConquestFile(String file_path) throws IOException {
        File input_map = new File(file_path);
        BufferedReader input_reader = new BufferedReader(new FileReader(input_map));

        String input_line;
        int line_counter=0;
        while((input_line=input_reader.readLine())!=null){
            /*[Map]  //check if the first line equals [map]
                image=world.bmp
                wrap=yes
                scroll=horizontal           Read the first six lines here and then continue.
                author=Your name
                warn=yes*/
            if(line_counter==6 && (input_line=="[Continents]")){

                input_reader=this.readContinentList(input_reader);    //reader is returned as we need to have a single reader reading different parts of the map file.
            }
            input_reader = this.readCountryList(input_reader);


        line_counter++;
        }

        return null;
    }

    public String WriteConquestFile(){
        return null;
    }

    public String GenerateMap(){
        return null;
    }

}
