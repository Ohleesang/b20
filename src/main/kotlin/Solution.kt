class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = IntArray(numbers.size)

        for(idx in numbers.indices){
            answer[idx] = numbers[idx] * 2
        }
        return answer
    }
}
fun main(){
    Solution().solution(intArrayOf(1,2,3,4,5))
    Solution().solution(intArrayOf(1,2,100,-99,1,2,3))
}