import java.util.ArrayList;

public class Player {

    String player_name;
    String player_id;
    String player_armies;
    ArrayList<String> countries;
    ArrayList<String> continents;
    String cards_held;
    String cardExchanged;

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
    }

    public String getPlayer_armies() {
        return player_armies;
    }

    public void setPlayer_armies(String player_armies) {
        this.player_armies = player_armies;
    }

    public ArrayList<String> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<String> countries) {
        this.countries = countries;
    }

    public ArrayList<String> getContinents() {
        return continents;
    }

    public void setContinents(ArrayList<String> continents) {
        this.continents = continents;
    }

    public String getCards_held() {
        return cards_held;
    }

    public void setCards_held(String cards_held) {
        this.cards_held = cards_held;
    }

    public String getCardExchanged() {
        return cardExchanged;
    }

    public void setCardExchanged(String cardExchanged) {
        this.cardExchanged = cardExchanged;
    }


}
