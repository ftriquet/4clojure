;Write a function which duplicates each element of a sequence.
;(= (__ [1 2 3]) '(1 1 2 2 3 3))
;(= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
;(= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
;(= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

(def answer
  (fn [s] (reduce #(conj %1 %2 %2) [] s)))

(println (= (answer [1 2 3]) '(1 1 2 2 3 3)))
(println (= (answer [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)))
(println (= (answer [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))
(println (= (answer [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))
