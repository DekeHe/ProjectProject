js
class
Vegetable=function(size,color){this.size=size;this.color=color}
Vegetable.prototype.run=function(){console.log('run')}

inheritance
Cabbage=function(size,color,shape){Vegetable.call(this,size,color);this.shape=shape}
Cabbage.prototype=Object.create(Vegetable.prototype)
Cabbage.prototype.run=function(){console.log('run run')}

v=new Vegetable(1,'red')
console.log(v,v.size,v.color)
v.run()

c=new Cabbage(1,'red','square')
console.log(c,c.size,c.color,c.shape)
c.run()

firstofall
mongodb compass, test project

mongodb
https://stackoverflow.com/questions/65357744/how-to-install-mongodb-on-apple-m1-chip
