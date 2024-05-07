/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function (nums1, m, nums2, n) {
    nums1.sort((a, b) => a - b);
    let k = 0;
    let count = nums1.filter((a) => a < 0);
    if (m == 0 && n != 0) {
        let j = 0;
        nums2.map((a) => nums1[j++] = a);
    } else {
        let j = 0;
        nums2.map((a) => nums1[(count.length + j++)] = a);
    }
    return nums1.sort((a, b) => a - b);
};