angular.module("lista").factory( "contatosAPI",  function($http, config){
	var _getContatos = function(){
		return $http.get(config.baseURL + "contato");
	};
	
	var _getContato = function(id){
		return $http.get(config.baseURL + "contato/detalheContato/" + id);
	};
	
	var _saveContato = function(contato){
		return $http.post(config.baseURL + "contato", contato, { headers: 'application/json' });
	};
	
	return {
		getContatos: _getContatos,
		getContato: _getContato,
		saveContato: _saveContato
	}
}
);
