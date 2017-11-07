angular.module("lista").controller("novoContatoController", function($scope, $location, contatosAPI , operadoras){

	$scope.operadoras = operadoras.data;
	
	$scope.adicionarContato = function(contato){
		contatosAPI.saveContato(contato).then(
			     function(data){
						delete $scope.contato;

		                //Volta o estado do formulario para pristine (nunca utilizado)
						$scope.contatoForm.$setPristine();
						
						//Ao salvar o contato volto para a página principal
						$location.path("/");
			     }
		      );
	};
});		
