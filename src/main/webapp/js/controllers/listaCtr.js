angular.module("lista").controller("listaCtr", function($scope , contatos, operadoras, $filter){

	$scope.app = $filter("upper")("Lista Telefônica");

	$scope.contatos   = contatos.data;
	$scope.operadoras = operadoras.data;
    
	var init = function(){
		calcularImpostos($scope.contatos);
		
		//$scope.contatos.push($scope.contatos[0]);
	}
	
	var calcularImpostos = function(contatos){
		contatos.forEach(function(contato){
			contato.operadora.precoComImposto = calcularImposto(contato.operadora.preco);
		});
	}
	
	var calcularImposto = function(preco){
		var imposto = 1.2;
		return preco * imposto;
	}

	/*
	var carregarContatos = function() {
		contatosAPI.getContatos().then(function(response){
			$scope.contatos = response.data;	
		}).catch( function(response){
			console.log(response);
			$scope.error = "Serviço temporariamento fora do ar.";
		});
		
	};
	carregarContatos();

	var carregarOperadoras = function(){
		operadorasAPI.getOperadoras().then(function(response){
			$scope.operadoras = response.data;
		}).catch(function(response){
			console.log(response);
		});	
	};
	carregarOperadoras();
	*/
	
	$scope.selecionado = "selecionado";

	$scope.apagarContatos = function(contatos){
		$scope.contatos = contatos.filter(function(contato){
			if(!contato.selecionado) return contato;
		});
		
		$scope.verificarContatoSelecionado(contatos);
	};

	$scope.verificarContatoSelecionado = function(contatos){
		$scope.hasContatoSelecionado = contatos.some(function(contato){
			return contato.selecionado;
		});
	};


	$scope.ordenarPor = function(campo){
		$scope.criteriadeOrdenacao = campo;
		$scope.direcaoDaOrdenacao = !$scope.direcaoDaOrdenacao;
	};

	$scope.footer = "footer.html";
	
	init();
});		
