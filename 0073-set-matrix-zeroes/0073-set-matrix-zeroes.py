class Solution(object):
    def setZeroes(self, matrix):
       m = len(matrix)
       n = len(matrix[0])

       row = [False] * m
       col = [False] * n

       for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            if matrix[i][j] == 0:
                row[i] = True
                col[j] = True

       for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            if row[i] == True or col[j] == True:
                matrix[i][j] = 0