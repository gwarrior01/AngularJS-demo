var app = angular.module('app', ['ngResource']);
app.controller('MyCtrl', function ($scope, $resource) {
    $resource('/api/v1/book').query(function (data) {
        $scope.books = data;
    });
});