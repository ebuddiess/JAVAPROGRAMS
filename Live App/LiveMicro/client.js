var socket = require('socket.io-client')("http://localhost:5000");
var express = require('express');
var app = express();
var fs = require('fs');

//const dgram = require('dgram');
var stream = require('stream');
fileSystem = require('fs')

// var s = dgram.createSocket('udp4');
// socket.io.on("connect", function() {
//     console.log("Connected To Server");
// })

app.get("/", (req, res) => {
    res.sendFile(__dirname + "/index.html")
})

app.get('/song', (req, res) => {

    res.writeHead(200, {
        'response': "success",
        'Content-Type': 'application/octet-stream',
    });

    socket.on("audio", function(data) {

        var bufferStream = new stream.PassThrough();
        bufferStream.end(new Buffer(data));
        bufferStream.pipe(res)

    })
});

// socket.on("audio", function(data) {
//     console.log(data);
//     s.send(Buffer.from(data), 169, 'localhost');
// })

app.listen(3000, () => {
    console.log("connected");
})