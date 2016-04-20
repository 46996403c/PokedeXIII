
package oscarxiii.pokedexiii.json;

import java.io.Serializable;

public class Stat implements Serializable {
    private Integer base_stat;

    private Integer effort;

    private Stat_ stat;

    /**
     * 
     * @return
     *     The base_stat
     */
    public Integer getBase_stat() {
        return base_stat;
    }

    /**
     * 
     * @param base_stat
     *     The base_stat
     */
    public void setBase_stat(Integer base_stat) {
        this.base_stat = base_stat;
    }

    /**
     * 
     * @return
     *     The effort
     */
    public Integer getEffort() {
        return effort;
    }

    /**
     * 
     * @param effort
     *     The effort
     */
    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    /**
     * 
     * @return
     *     The stat
     */
    public Stat_ getStat() {
        return stat;
    }

    /**
     * 
     * @param stat
     *     The stat
     */
    public void setStat(Stat_ stat) {
        this.stat = stat;
    }

}
