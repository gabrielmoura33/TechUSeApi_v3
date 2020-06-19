package Aplicacao;

import Service.FileService;
import Service.ProdutoService;
import Service.UsuarioService;

import static spark.Spark.*;

public class Routes {
    public static void main(String[] args) {

        UsuarioService usuarioService = new UsuarioService();
        ProdutoService produtoService = new ProdutoService();
        FileService fileService  = new FileService();
        options("/*",
                (request, response) -> {

                    String accessControlRequestHeaders = request
                            .headers("Access-Control-Request-Headers");
                    if (accessControlRequestHeaders != null) {
                        response.header("Access-Control-Allow-Headers",
                                accessControlRequestHeaders);
                    }

                    String accessControlRequestMethod = request
                            .headers("Access-Control-Request-Method");
                    if (accessControlRequestMethod != null) {
                        response.header("Access-Control-Allow-Methods",
                                accessControlRequestMethod);
                    }

                    return "OK";
                });

        before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));

        get("/users", "application/json", (request, response) ->
                usuarioService.getAll(request, response), new JSONTransformer());

        get("/users/:id", "application/json", (request, response) ->
                usuarioService.get(request, response), new JSONTransformer());


        post("/users", (request, response) ->{
            return usuarioService.add(request, response);
        });


        put("/users", (request, response) -> usuarioService.update(request, response));

        delete("/users/:id", (request, response) -> usuarioService.delete(request, response));

        post("/files", ( request, response) -> fileService.add(request, response));

        get("/files/:id", "application/json",( request, response) -> fileService.get(request, response), new JSONTransformer());

        delete("/files/:id", "application/json",( request, response) -> fileService.destroy(request, response), new JSONTransformer());

        get("/products", "application/json", (request, response) ->
                produtoService.getAll(request, response), new JSONTransformer());

        get("/products/:id", "application/json", (request, response) ->
                produtoService.get(request, response), new JSONTransformer());


        post("/products", (request, response) -> produtoService.add(request, response));

        put("/products", (request, response) -> produtoService.update(request, response));

        delete("/products/:id", (request, response) -> produtoService.delete(request, response));

    }
}
