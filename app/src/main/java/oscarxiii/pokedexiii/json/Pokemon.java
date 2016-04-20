
package oscarxiii.pokedexiii.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pokemon implements Serializable {
    private Integer id;
    private String name;
    private Integer base_experience;
    private Integer height;
    private Boolean is_default;
    private Integer order;
    private Integer weight;
    private List<Ability> abilities = new ArrayList<Ability>();
    private List<Form> forms = new ArrayList<Form>();
    private List<GameIndex> game_indices = new ArrayList<GameIndex>();
    private List<Object> held_items = new ArrayList<Object>();
    private List<Object> location_area_encounters = new ArrayList<Object>();
    private List<Move> moves = new ArrayList<Move>();
    private Species species;
    private List<Stat> stats = new ArrayList<Stat>();
    private List<Type> types = new ArrayList<Type>();

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The base_experience
     */
    public Integer getBase_experience() {
        return base_experience;
    }

    /**
     * 
     * @param base_experience
     *     The base_experience
     */
    public void setBase_experience(Integer base_experience) {
        this.base_experience = base_experience;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The is_default
     */
    public Boolean getIs_default() {
        return is_default;
    }

    /**
     * 
     * @param is_default
     *     The is_default
     */
    public void setIs_default(Boolean is_default) {
        this.is_default = is_default;
    }

    /**
     * 
     * @return
     *     The order
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * 
     * @param order
     *     The order
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The abilities
     */
    public List<Ability> getAbilities() {
        return abilities;
    }

    /**
     * 
     * @param abilities
     *     The abilities
     */
    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    /**
     * 
     * @return
     *     The forms
     */
    public List<Form> getForms() {
        return forms;
    }

    /**
     * 
     * @param forms
     *     The forms
     */
    public void setForms(List<Form> forms) {
        this.forms = forms;
    }

    /**
     * 
     * @return
     *     The game_indices
     */
    public List<GameIndex> getGame_indices() {
        return game_indices;
    }

    /**
     * 
     * @param game_indices
     *     The game_indices
     */
    public void setGame_indices(List<GameIndex> game_indices) {
        this.game_indices = game_indices;
    }

    /**
     * 
     * @return
     *     The held_items
     */
    public List<Object> getHeld_items() {
        return held_items;
    }

    /**
     * 
     * @param held_items
     *     The held_items
     */
    public void setHeld_items(List<Object> held_items) {
        this.held_items = held_items;
    }

    /**
     * 
     * @return
     *     The location_area_encounters
     */
    public List<Object> getLocation_area_encounters() {
        return location_area_encounters;
    }

    /**
     * 
     * @param location_area_encounters
     *     The location_area_encounters
     */
    public void setLocation_area_encounters(List<Object> location_area_encounters) {
        this.location_area_encounters = location_area_encounters;
    }

    /**
     * 
     * @return
     *     The moves
     */
    public List<Move> getMoves() {
        return moves;
    }

    /**
     * 
     * @param moves
     *     The moves
     */
    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    /**
     * 
     * @return
     *     The species
     */
    public Species getSpecies() {
        return species;
    }

    /**
     * 
     * @param species
     *     The species
     */
    public void setSpecies(Species species) {
        this.species = species;
    }

    /**
     * 
     * @return
     *     The stats
     */
    public List<Stat> getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    /**
     * 
     * @return
     *     The types
     */
    public List<Type> getTypes() {
        return types;
    }

    /**
     * 
     * @param types
     *     The types
     */
    public void setTypes(List<Type> types) {
        this.types = types;
    }

}
