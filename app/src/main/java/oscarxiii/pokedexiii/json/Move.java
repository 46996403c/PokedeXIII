
package oscarxiii.pokedexiii.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Move implements Serializable {
    private Move_ move;
    private List<VersionGroupDetail> version_group_details = new ArrayList<VersionGroupDetail>();

    /**
     * 
     * @return
     *     The move
     */
    public Move_ getMove() {
        return move;
    }

    /**
     * 
     * @param move
     *     The move
     */
    public void setMove(Move_ move) {
        this.move = move;
    }

    /**
     * 
     * @return
     *     The version_group_details
     */
    public List<VersionGroupDetail> getVersion_group_details() {
        return version_group_details;
    }

    /**
     * 
     * @param version_group_details
     *     The version_group_details
     */
    public void setVersion_group_details(List<VersionGroupDetail> version_group_details) {
        this.version_group_details = version_group_details;
    }

}
