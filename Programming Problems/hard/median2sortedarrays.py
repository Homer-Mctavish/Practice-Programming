class Solution:
    nums1 = [1, 2]
    nums2 = [3, 4, 66]

    def findMedianSortedArrays(nums1, nums2) -> float:
        gher = nums1+nums2
        gher.sort()
        jim = int(len(gher)/2)
        if(len(gher) % 2 == 0):
            higher = float((gher[jim-1]+gher[jim])/2)
            return higher
        return float(gher[jim])
    print(findMedianSortedArrays(nums1, nums2))
