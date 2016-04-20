
package oscarxiii.pokedexiii.json;

import java.io.Serializable;

public class VersionGroupDetail implements Serializable {

    private Integer level_learned_at;

    private VersionGroup version_group;

    private MoveLearnMethod move_learn_method;

    /**
     * 
     * @return
     *     The level_learned_at
     */
    public Integer getLevel_learned_at() {
        return level_learned_at;
    }

    /**
     * 
     * @param level_learned_at
     *     The level_learned_at
     */
    public void setLevel_learned_at(Integer level_learned_at) {
        this.level_learned_at = level_learned_at;
    }

    /**
     * 
     * @return
     *     The version_group
     */
    public VersionGroup getVersion_group() {
        return version_group;
    }

    /**
     * 
     * @param version_group
     *     The version_group
     */
    public void setVersion_group(VersionGroup version_group) {
        this.version_group = version_group;
    }

    /**
     * 
     * @return
     *     The move_learn_method
     */
    public MoveLearnMethod getMove_learn_method() {
        return move_learn_method;
    }

    /**
     * 
     * @param move_learn_method
     *     The move_learn_method
     */
    public void setMove_learn_method(MoveLearnMethod move_learn_method) {
        this.move_learn_method = move_learn_method;
    }

}
