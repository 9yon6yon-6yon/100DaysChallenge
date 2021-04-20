//alert("Hi there");


//document.write("Hello world! \n");
console.log("Hello from console...");
//var x =100;
//document.write(x);
//console.log(x);
/*this is a comment*/
//this is a comment
/*var name = "Chayon";
var text = "My name is Chayon";
var sayhello = '\n Hello world! \' I am a JavaScript programmer. \' ';
document.write(sayhello);
var isActive = true;
var isHoliday = false;
var x = 6;

if (x == 1) {
    document.write('<h1>HTML5</h1>');
}
else if (x == 2) { document.write('<h1>CSS3</h1>'); }
else { document.write('<h1>JavaScript</h1>'); }
switch (x) {
    case 1:
        document.write("This is case 1 \n");
        break;
    case 2:
        document.write("This is case 1 \n");
        break;
    case 3:
        document.write("This is case 1 \n");
        break;
    default:
        document.write("Hi I am a default case \n");
}
document.write("<br>");
for (i = 1; i <= 10; i++) {
    document.write(i + "<br>");
}*/
document.write("<br>");
var Height = document.documentElement.scrollHeight;
var currentHeight = 0;
var bool = true;
var step = 4;
var speed = 15;
var interval = setInterval(scrollpage, speed)

function scrollpage() {
    if (currentHeight < 0 || currentHeight > Height)
        bool = !bool;
    if (bool) {
        window.scrollTo(0, currentHeight += step);
    } else {
        //if you don't want to continue scroll 
        // clearInterval(interval) use clearInterval
        window.scrollTo(0, currentHeight += step);
    }

}

scrollpage();

var val = 1000000;
while (val--) {
    if (val % 2 == 1) {
        i = 0;
        j = 1;
       
        document.write(i + " " + j + " " );
    }
    else {
        i = 1;
        j = 0;
       
        document.write(i + " " + j + " ");
    }
  
}


