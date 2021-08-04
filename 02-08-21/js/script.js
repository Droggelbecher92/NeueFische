const add = (num1, num2) => num1 + num2
const multiply = (num1, num2) => num1 * num2
const faculty = num => {
  if (num === 0 || num === 1) {
    return 1
  }
  let final = 1
  for (let i = 1; i <= num; i++) {
    final = multiply(final, i)
  }
  return final
}

console.log(faculty(6))

const stud = {
  name: 'Peter',
  id: 12,
}

const anotherStud = {
  name: 'Anna',
  id: 23,
}

const finalStud = {
  name: 'Klaus',
  id: 45,
}

const studList = [stud, anotherStud, finalStud]
console.log(JSON.parse(JSON.stringify(studList)))

function renameMutable(whichStud, newName) {
  const studTochange = studList.find(student => student.name === whichStud)
  if (studTochange) {
    studTochange.name = newName
  }
  return studList
}

console.log(JSON.parse(JSON.stringify(renameMutable('Peter', 'Ansgar'))))
