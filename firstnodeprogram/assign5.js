
var fs = require('fs');
var fileName = 'read.txt'

fs.readFile(fileName, 'utf8', function(err, contentFile) { 
if (err) throw err;
var aWordsText = contentFile.split(' ');
var aFilteredWords = aWordsText.filter(function(word){
return word.includes('hello');
})
console.log(aFilteredWords.length);
}); 