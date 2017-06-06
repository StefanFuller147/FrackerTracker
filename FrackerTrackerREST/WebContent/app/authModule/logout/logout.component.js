angular.module("authModule").component("logout", {
    templateUrl : 'app/authModule/logout/logout.component.html',
    controller: function(authService, $location, $document) {
    	var vm = this;
    	
        
    	vm.logout = function() {
    		authService.logout().then(function(res) {
    			
    			$location.path('/');
    		})
    		.catch(function(error){
				vm.error = true;
			})
    	}
    },
	controllerAs: 'vm'
    });