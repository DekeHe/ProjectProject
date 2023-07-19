Vegetable=function(size,color){this.size=size;this.color=color}
Vegetable.prototype.run=function(){console.log('run')}

Cabbage=function(size,color,shape){Vegetable.call(this,size)}
