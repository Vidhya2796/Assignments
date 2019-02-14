const http = require('http');
const fs = require('fs');
const hostname = '127.0.0.1';
const port = 3005;

const server = http.createServer((req, res) => {
    var data = fs.readFileSync('hello.html', 'utf8');
    res.statusCode = 200;
  res.setHeader('Content-Type', 'text/html');
  res.end(data);
});
server.listen(port, hostname, () => {
    console.log(`Server running at http://${hostname}:${port}/`);
  });