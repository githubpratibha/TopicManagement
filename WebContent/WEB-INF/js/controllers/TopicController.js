//Controller Part
app.controller("TopicController", function($scope, $http) {
    $scope.title = 'Top 20 Topics';
    $scope.promo = 'Today\'s most popular topics.';
    $scope.topics = [];
    $scope.topicForm = {
        id: -1,
        topicName: "",
        downVotes: 0,
        upVotes: 0
    };

    //Now load the data from server
    _refreshTopicData();

    //HTTP POST/PUT methods for add/edit topic 
    // with the help of id, we are going to find out whether it is put or post operation

    $scope.submitTopic = function() {

        var method = "";
        var url = "";
        if ($scope.topicForm.id == -1) {
            //Id is absent in form data, it is create new topic operation
            method = "POST";
            url = 'http://localhost:8080/TopicManagement/rest/topics';
        } else {
            //Id is present in form data, it is edit topic operation
            method = "PUT";
            url = 'http://localhost:8080/TopicManagement/rest/topics';
        }

        $http({
            method: method,
            url: url,
            data: angular.toJson($scope.topicForm),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(_success, _error);
    };

    $scope.editTopicUpVotes = function(topic) {

        topic.upVotes = topic.upVotes + 1;
        //Topic is present in form data, it is edit topic operation
        method = "PUT";
        url = 'http://localhost:8080/TopicManagement/rest/topics';

        $http({
            method: method,
            url: url,
            data: angular.toJson(topic),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(_success, _error);
    };

    $scope.editTopicDownVotes = function(topic) {

        topic.downVotes = topic.downVotes + 1;
        //Topic is present in form data, it is edit topic operation
        method = "PUT";
        url = 'http://localhost:8080/TopicManagement/rest/topics';

        $http({
            method: method,
            url: url,
            data: angular.toJson(topic),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(_success, _error);
    };

    /*Private Methods */
    //HTTP GET- get all topics collection
    function _refreshTopicData() {
        $http({
            method: 'GET',
            url: 'http://localhost:8080/TopicManagement/rest/topics'
        }).then(function successCallback(response) {
            $scope.topics = response.data;
        }, function errorCallback(response) {
            console.log(response.statusText);
        });
    }

    function _success(response) {
        _refreshTopicData();
        _clearFormData()
    }

    function _error(response) {
        console.log(response.statusText);
    }

    //Clear the form
    function _clearFormData() {
        $scope.topicForm.id = -1;
        $scope.topicForm.topicName = "";

    };
});