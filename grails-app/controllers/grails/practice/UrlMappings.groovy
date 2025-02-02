package grails.practice

// En esta clase especifico  las que tendra el proyecto url osea que si quiero
//Que cierta url este asociada con un controlador debo de especificarlo aqui
class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        // De esta forma indico que la vista index esta asociada a el controlador main cuando acceda a la url localhost:8080/ se mostrara
        "/"(controller: 'main', view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
