package models;

public class Note {
private int id;
private Mod module;
private Filiere filiere;

public Note(){

}
public Note (int id, Mod module, Filiere filiere){
    this.filiere=filiere;
    this.module=module;
    this.id=id;

}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mod getModule() {
        return module;
    }

    public void setModule(Mod module) {
        this.module = module;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
}
