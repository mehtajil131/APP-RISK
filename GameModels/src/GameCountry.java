import java.util.ArrayList;

public class GameCountry {


    String country_name;

    /*public GameCountry() {
        this.neighbouring_countries = new ArrayList<>();
    }*/

    ArrayList<GameCountry> neighbouring_countries;
/*
    GameContinent continent;
*/
    String player_id;
    String armies_stationed;

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    /*public Continent getContinent() {
        return continent;
    }

    public void setContinent(GameContinent continent) {
        this.continent = continent;
    }
*/
    public String getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
    }

    public String getArmiesStationed() {
        return armies_stationed;
    }

    public void setArmies(String armies_stationed) {
        this.armies_stationed = armies_stationed;
    }

    public ArrayList<GameCountry> getNeighbouring_countries() {
        return neighbouring_countries;
    }

    public void setNeighbouring_countries(ArrayList<GameCountry> neighbouring_countries) {
        this.neighbouring_countries = neighbouring_countries;
    }
}
