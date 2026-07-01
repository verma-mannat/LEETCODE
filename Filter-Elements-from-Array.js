1/**
2 * @param {number[]} arr
3 * @param {Function} fn
4 * @return {number[]}
5 */
6var filter = function(arr, fn) {
7    const result=[];
8    for(let i=0;i<arr.length;i++){
9        if(fn(arr[i],i)){
10            result.push(arr[i]);
11        }
12    }
13    return result;
14};