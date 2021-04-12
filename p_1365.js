var smallerNumbersThanCurrent = function(nums) {
    var len = nums.length;
    var sums = new Array(len);
    for (var i = 0; i < len; i++) {
        var sum = 0;
        for (var j = 0; j < len; j++) {
            if (i != j && nums[i] > nums[j]) sum++;
        }
        sums[i] = sum;
    }
    return sums;
};
