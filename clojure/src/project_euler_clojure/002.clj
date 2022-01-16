(ns project-euler-clojure.002)

(defn fibonacci-helper
  [left right number]
  (if (> 1 number)
    1
    (if (> 2 number)
      right
      (fibonacci-helper right (+' left right) (- number 1)))))

(defn fibonacci
  [number]
  (fibonacci-helper 1 2 number))

(println "Even Fibonacci numbers:
Each new term in the Fibonacci sequence is generated by adding the previous two terms.
By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million,
find the sum of the even-valued terms.")
(println (time (reduce + (filter #(= 0 (mod % 2)) (filter #(> 4000000 %) (map fibonacci (range 32)))))))