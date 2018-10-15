from operator import itemgetter
def option1():
    students = []
    lowest_scores = []
   
    for _ in range(int(input())):
        name = input()
        score = float(input())
        student = [name, score]
        students.append(student)

    students.sort(key=itemgetter(1))
    mins = min(students, key=itemgetter(1))

    for i in students:
      if i[1] == mins[1]:
        lowest_scores.append(i)

    for i in lowest_scores: students.remove(i)
    lowest_scores.clear()

    for i in students:
        if i[1] == students[0][1]:
            lowest_scores.append(i)

    lowest_scores.sort(key=itemgetter(0))
    for i in lowest_scores:
        print(i[0])

def option2():
  marksheet = []
  for _ in range(0,int(input())):
    marksheet.append([input(), float(input())])

  second_highest = sorted(list(set([marks for name, marks in marksheet])))[1]
  print(second_highest)
  print('\n'.join([a for a,b in sorted(marksheet) if b == second_highest]))
