package veterinaria.model;

/**
 *
 * @author Mateus
 */
public class Animal implements BaseBean {
    private Integer animalId;
    private String animalNome;
    private String animalEspecie;
    private String animalSexo;
    private Integer idade;

    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public String getAnimalNome() {
        return animalNome;
    }

    public void setAnimalNome(String animalNome) {
        this.animalNome = animalNome;
    }

  

    public String getAnimalEspecie() {
        return animalEspecie;
    }

    public void setAnimalEspecie(String animalEspecie) {
        this.animalEspecie = animalEspecie;
    }

    public String getAnimalSexo() {
        return animalSexo;
    }

    public void setAnimalSexo(String animalSexo) {
        this.animalSexo = animalSexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getanimalId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getanimalNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getGenero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getanimalIdade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getanimalEspecie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getanimalSexo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
