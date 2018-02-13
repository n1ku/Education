package ch.disha.edu.kpt10.bsp3;

public class Bier implements Comparable<Bier>{
    private String name;
    private String herkunft;
    private float inhalt;

    public Bier(String name, String herkunft, float inhalt) {
        this.name = name;
        this.herkunft = herkunft;
        this.inhalt = inhalt;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHerkunft() {
        return this.herkunft;
    }

    public void setHerkunft(String herkunft) {
        this.herkunft = herkunft;
    }

    public float getInhalt() {
        return this.inhalt;
    }

    public void setInhalt(float inhalt) {
        this.inhalt = inhalt;
    }

    @Override
    public String toString() {
        return this.name + " aus " + this.herkunft + " mit " + this.inhalt + " Litern";
    }

    @Override
    public int compareTo(Bier o) {
        if(o.getName() == null && this.getName() == null)
            return 0;
        if(this.getName() == null)
            return 1;
        if(o.getName() == null)
            return -1;
        return this.getName().compareTo(o.getName());

    }
}
