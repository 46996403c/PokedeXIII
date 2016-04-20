package oscarxiii.pokedexiii.json;

import java.io.Serializable;

public class Ability implements Serializable {
    private Boolean is_hidden;
    private Integer slot;
    private Ability_ ability;

    /**
     * 
     * @return
     *     The is_hidden
     */
    public Boolean getIs_hidden() {
        return is_hidden;
    }

    /**
     * 
     * @param is_hidden
     *     The is_hidden
     */
    public void setIs_hidden(Boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    /**
     * 
     * @return
     *     The slot
     */
    public Integer getSlot() {
        return slot;
    }

    /**
     * 
     * @param slot
     *     The slot
     */
    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    /**
     * 
     * @return
     *     The ability
     */
    public Ability_ getAbility() {
        return ability;
    }

    /**
     * 
     * @param ability
     *     The ability
     */
    public void setAbility(Ability_ ability) {
        this.ability = ability;
    }

}
