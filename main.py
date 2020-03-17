import sys
MAX_CHAR = 256


def doesMapping(str1, str2):
    a = len(str1)
    b = len(str2)

    if a != b:
        return False

    seen = [False] * MAX_CHAR
    map = [-1] * MAX_CHAR

    for i in xrange(a):
        if map[ord(str1[i])] == -1:
            seen[ord(str2[i])] = True
            map[ord(str1[i])] = str2[i]

        elif map[ord(str1[i])] != str2[i]:
            return False
    return True


print doesMapping("foo", "bar")  # false
print doesMapping("bar", "foo")  # true
print doesMapping("abc", "bcd")  # true
