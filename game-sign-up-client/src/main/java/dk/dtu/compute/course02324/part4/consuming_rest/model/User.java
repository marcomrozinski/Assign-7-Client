package dk.dtu.compute.course02324.part4.consuming_rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private long uid;

    private String name;

    // TODO this class needs to be extended with references to Player and
    //      the other way round (similar to the reference from Game to Player
    //      and the other way round.

    private List<Player> players;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long id) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                '}';
    }

}
