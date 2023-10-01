let array=[44,55,22,55,44,11];
dscSort(array);

function dscSort(array) {
    for (var i = 0; i < array.length; i++) {
        for (var j = 0; j <array.length-i-1; j++) {
            if(array[j]<array[j+1]){
                var tmp = array[j];
                array[j]= array[j + 1];
              array[j + 1]=tmp;
            }
        }
    }
    
}
   
  for (var i = 0; i < array.length; i++) {
      
     document.write(array[i]);
  
}