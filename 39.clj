;Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.
;(= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
;(= (__ [1 2] [3 4 5 6]) '(1 3 2 4))
;(= (__ [1 2 3 4] [5]) [1 5])
;(= (__ [30 20] [25 15]) [30 25 20 15])

(def answer
  (fn [s1 s2]
    (apply concat (apply map list (list s1 s2)))))

(println (= (answer [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c)))
(println (= (answer [1 2] [3 4 5 6]) '(1 3 2 4)))
(println (= (answer [1 2 3 4] [5]) [1 5]))
(println (= (answer [30 20] [25 15]) [30 25 20 15]))
