var runningSum = function(nums) {
    var sum = 0
    for (var i = 0; i < nums.length; i++) {
        sum += nums[i];
        nums[i] = sum;
    }
    return nums;
};
