package knight.arkham.domains

//Domain para crear un crud simple, otra cosa importante que se debe saber de grails
// es que cuando creo el domain arriba me aparecen unos botones que parecen pestañas
// pero no lo son y estos botones sirven para generar tanto como nuestro controlador de
// persona como la vista de persona y asi nos ahorramos trabajo demas, asi que por lo
//tanto siempre que creemos un domain nuestro siguiente paso sera generar la vista
// y el controlador con los botones de arriba. Por ultimo el controlador y la vista que se
//generan por defecto son unos crud osea que estan ya preparados para cumplir las 4 funciones basicas
// de un crud normal osea que basicamente creamos un crud solamente trabajando lo que es el Domain
class Persona {

    String name
    String email

    static constraints = {
        email email: true
    }
}
