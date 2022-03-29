let list1 = []
let list2 = []
let counter1 = 0
let arr1 = []
let counter2 = 0
let arr2 = []
let rnmIndex1 =Math.floor(Math.random()*100) 
let rnmIndex2 =Math.floor(Math.random()*100) 

function rdn1(v1){
	v1 = Math.floor(Math.random()*100)
	return v1
}
function rdn2(v2){
	v2 = Math.floor(Math.random()*100)
	return v2
}

function plotChart(){
while(list1.length != 100 && list2.length != 100){
	counter2++
	list2.push(counter2)
	list1.push(0)
	list2.push(0)
}

list1[rnmIndex1] = 1
list2[rnmIndex2] = 1

do{
	counter1++
	list1.push(counter1)
	rdn1()
	rdn2()
}while(rdn1() != rdn2())

console.log(list1)
console.log(list2)
console.log(counter1)
}

plotChart()


new Chart("Chart",{
	type:"line",
	data:{
		labels: list1, 
		datasets:[
			{backgroundColor: "rgba(0,0,0,1.0)",
      			borderColor: "rgba(0,0,0,0.1)",
      			data: list2}
		]
	},
	options:{


	}
})

