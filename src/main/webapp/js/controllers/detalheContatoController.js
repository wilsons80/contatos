angular.module("lista").controller("detalheContatoController", function($scope, $routeParams, contato){
	$scope.contato = contato.data;	
});		
