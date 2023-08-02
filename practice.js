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

npm init -y
"start": "node app.js"
"dependencies"{}
npm install

let restaurant = 
{
    id
    name:name,
    address:address,
    zip:zip,
    rating:0,
    foodMenu:[],
    reviewIds:[]
}

let customer=
{
    id
    userName:userName,
    passWord:passWord,
    firstName:firstName,
    lastName:lastName,
    email:email,
    profilePicture:profilePicture,
    age:age,
    reviewIds:[],
    commentIds:[],
    cart:[]
}

let review=
{
    id
    restaurantId:restaurantId,
    customerId:customerId,
    reviewText:reviewText,
    rating:rating,
    commentIds:[],
    upvoteIds:[],
    downvoteIds:[]
}

const comment=
{
    id
    customerId:customerId,
    reviewId:reviewId,
    commentText:commentText
}

all exception
delete all throw

js, java, android

this, yangyang, 
