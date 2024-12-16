/**
 * Finds the index of the first occurrence of `needle` in `haystack`, or returns -1 if `needle` is not part of `haystack`.
 *
 * @param {string} haystack - The string in which to search.
 * @param {string} needle - The substring to find in `haystack`.
 * @returns {number} - The index of the first occurrence of `needle`, or -1 if not found.
 *
 * @example
 * // Example 1:
 * // Input: haystack = "sadbutsad", needle = "sad"
 * // Output: 0
 * // Explanation: "sad" occurs at index 0 and 6. The first occurrence is at index 0.
 *
 * @example
 * // Example 2:
 * // Input: haystack = "leetcode", needle = "leeto"
 * // Output: -1
 * // Explanation: "leeto" is not present in "leetcode".
 *
 * @constraints
 * // 1 <= haystack.length, needle.length <= 10^4
 * // haystack and needle consist of only lowercase English letters.
 */
function findFirstOccurrence(haystack, needle) {
    if (needle.length === 0) return 0;
    return haystack.indexOf(needle);
}

// Code to take user input and test the function
const readline = require('readline'); // Import readline for user input

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

// Prompt user for input
rl.question("Enter the haystack (larger string): ", (haystack) => {
    rl.question("Enter the needle (substring to find): ", (needle) => {
        // Call the function and display the result
        const result = findFirstOccurrence(haystack, needle);
        if (result === -1) {
            console.log(`The substring "${needle}" was NOT found in "${haystack}".`);
        } else {
            console.log(`The substring "${needle}" first occurs at index ${result} in "${haystack}".`);
        }
        rl.close(); // Close the input stream
    });
});
