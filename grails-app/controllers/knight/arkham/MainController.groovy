package knight.arkham

// De esta forma trabajo los controladores, este controlador sirve para mandar
// un mensaje de texto al index la ruta por defecto de el controlador seria http://localhost:8080/main/index
// aunque funciona con el main solo
class MainController {

    //Si dejo el index vacio por defecto me retornara la vista
    // que este en la carpeta main que se ubica en resource
    def index() {

        //Aqui mando un texto para mostrar
        //render("Welcome to grails")

        // De esta forma creo una variable
        def username = "ArkhamKnight"

        //Aqui le mando la variable a la vista para trabajar con esta alla
        [username: username]

    }
}
