var express = require('express');
var path = require('path');
var request = require('request');

var app = express()

app.get('/playback.mp3', function(req, res) {

    //the request module is piping the steam over the get request coming on playback.mp3
    request.get('http://192.168.43.165:64489/stream/swyh.mp3').pipe(res, function(error) {
        console.log(error);
    });
});

//here the server is localhost and listening on the port 8000
app.listen(8000, function() {
    console.log("Listening on 8000");
});