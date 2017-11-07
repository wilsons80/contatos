angular.module("lista").config(function($routeProvider, $locationProvider) {

	//Usado para que a URL não fique com caracteres estranhos
	$locationProvider.hashPrefix('');

	// remove o # da url
	// Não estamos usando no MPDFT, pois o # indica ao browser o local "path" de onde a página está.
	// Sem o # a tag href não funciona
    //$locationProvider.html5Mode(true);

	// Se vier da página principal da aplicação.
	$routeProvider.when('/', {
		templateUrl : 'view/contatos.html',
		controller : 'listaCtr',
			
		resolve : {
			contatos: function (contatosAPI) {
				console.log(contatosAPI.getContatos());
				return contatosAPI.getContatos();
			},
			operadoras: function (operadorasAPI) {
				return operadorasAPI.getOperadoras();
			}
		}
	});

	$routeProvider.when('/detalheContato/:id', {
		templateUrl: 'view/detalheContato.html',
		controller : 'detalheContatoController',
		resolve : {
			contato : function(contatosAPI, $route){
				return contatosAPI.getContato($route.current.params.id);
			}
		}
	});

	$routeProvider.when('/novoContato', {
		templateUrl : 'view/novoContato.html',
		controller : 'novoContatoController',
		resolve : {
			operadoras: function (operadorasAPI) {
				return operadorasAPI.getOperadoras();
			}
		}
	});


	
	$routeProvider.when("/error", {
		templateUrl : "view/error.html"
	});
	
	
	// caso não seja nenhum desses, redirecione para a rota '/'
	$routeProvider.otherwise({
		redirectTo : '/'
	});
		
});
