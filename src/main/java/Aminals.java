import org.sql2o.Connection;

import java.util.List;

public class Aminals extends Animal{

    public static final String DATABASE_TYPE = "animal";
    private int sightingid;

    public Aminals(String name, int sightingsId) {
        this.name = name;
        this.sightingid = sightingsId;
        type = DATABASE_TYPE;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getSightingsId() {
        return sightingid;
    }

    @Override
    public boolean equals(Object otherAnimal){
        if (!(otherAnimal instanceof Aminals)) {
            return false;
        } else {
            Aminals newAnimal = (Aminals) otherAnimal;
            return this.getName().equals(newAnimal.getName());
        }
    }

    //save animal into db
    public void save() {
        try (Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO animals (name, type, sightingId) VALUES (:name, :type, :sightingId);";
                    this.id = (int) con.createQuery(sql, true)
                    .addParameter("name", this.name)
                            .addParameter("type", this.type)
                             .addParameter("sightingId", this.sightingid)
                    .executeUpdate()
                    .getKey();
        }
    }

    //get all animals
    public static List<Aminals> all() {
        String sql = "SELECT * FROM animals WHERE type='animal';";
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Aminals.class);
        }
    }

    //find animals by id
    public static Aminals find(int id) {
        try(Connection con = DB.sql2o.open()) {
            String sql = "SELECT * FROM animals where id=:id";
            Aminals aminals = con.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Aminals.class);
            return aminals;
        }
    }

    //update an aminal
    public void update(String name) {
        try(Connection con = DB.sql2o.open()) {
            String sql = "UPDATE animals SET name = :name WHERE id = :id";
            con.createQuery(sql)
                    .addParameter("name", name)
                    .addParameter("id", id)
                    .executeUpdate();
        }
    }

    //delete animal
    public void delete() {
        try(Connection con = DB.sql2o.open()) {
            String sql = "DELETE FROM animals WHERE id = :id;";
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        }
    }

}
