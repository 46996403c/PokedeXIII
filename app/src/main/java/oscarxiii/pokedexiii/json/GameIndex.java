
package oscarxiii.pokedexiii.json;

import java.io.Serializable;

public class GameIndex implements Serializable {
    private Integer game_index;
    private Version version;

    /**
     * 
     * @return
     *     The game_index
     */
    public Integer getGame_index() {
        return game_index;
    }

    /**
     * 
     * @param game_index
     *     The game_index
     */
    public void setGame_index(Integer game_index) {
        this.game_index = game_index;
    }

    /**
     * 
     * @return
     *     The version
     */
    public Version getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(Version version) {
        this.version = version;
    }

}
