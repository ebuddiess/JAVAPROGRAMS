const dgram = require('dgram');
var httpserver = require('http').createServer();
var socketio = require('socket.io')(httpserver);
const server = dgram.createSocket('udp4');

server.on('error', (err) => {
    console.log(`server error:\n${err.stack}`);
    server.close();
});

socketio.sockets.on("connection", function(socket) {
    console.log("connected");
})

server.on('message', (msg, rinfo) => {
    //console.log(`server got: ${msg} from ${rinfo.address}:${rinfo.port}`);
    console.log(msg);
    socketio.sockets.emit("audio", msg);
});

server.on('listening', () => {
    const address = server.address();
    console.log(`server listening ${address.address}:${address.port}`);
});

server.bind(41234, "127.0.0.1", () => {
    console.log("Server Started Successfully");
});

httpserver.listen(5000);