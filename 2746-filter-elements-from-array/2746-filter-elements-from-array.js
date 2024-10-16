/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    var filter = [];
    for (var i = 0; i < arr.length; i++){
        if (fn(arr[i], i)){
            filter.push(arr[i]);
        }
    }
    return filter;
};