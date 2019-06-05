package knight.arkham.domains

// En los domain basicamente trabajo lo que son los modelos o las entidades como se les quiera llamar
class Estudiante {

    long matricula;
    String nombre;
    String apellido
    String email
    transient String noIrPerteneceAlModelo;

    //Los setea automatico...
    Date dateCreated
    Date lastUpdated

    //Ejemplo de relacion uno a mucho.
    //static hasMany = [listaDirecciones : DireccionEstudiante]



    // Aqui trabajo lo que son las distintas validaciones que tendra esta entidad
    static constraints = {
        matricula(unique: true)
        email(email: true);
        nombre(blank: false)
        apellido blank: false
    }


    // La diferencia de los modelos domain de las entidades en java es que no hay necesidad de crear repositorios
    // Ya que desde el mismo domain un puede implementar su propio crud, sin necesidad de crear repositorios

    public void crearEstudiante(Estudiante estudiante){

        Estudiante.saveAll(estudiante)
    }

    public long encontrarEstudiante(long id){

        Estudiante.findById(id)
    }

    public void eliminarEstudiante(Estudiante estudiante){

        Estudiante.deleteAll(Estudiante)
    }
}
