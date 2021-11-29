a = [[1,3], [5,8], [7,10]]

a.sort(key = lambda x: x[0])

final = []

for i in range(len(a)-1):
    # 1,3  4,10  5,8
    # forward overlap
    if a[i][1] > a[i+1][0]:
        final.append([min(a[i][0], a[i+1][0]), max(a[i][1], a[i+1][1])])
    else:
        final.append(a[i])

print(final)
