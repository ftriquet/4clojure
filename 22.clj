;;Write a function which returns the total number of elements in a sequence.
;(= (__ '(1 2 3 3 1)) 5)
;(= (__ "Hello World") 11)
;(= (__ [[1 2] [3 4] [5 6]]) 3)
;(= (__ '(13)) 1)
;(= (__ '(:a :b :c)) 3)

(def answer
  (fn [coll]
    (loop [n 0
           c coll]
      (if (empty? c) n (recur (inc n) (rest c))))))

(println (= (answer '(1 2 3 3 1)) 5))
(println (= (answer "Hello World") 11))
(println (= (answer [[1 2] [3 4] [5 6]]) 3))
(println (= (answer '(13)) 1))
(println (= (answer '(:a :b :c)) 3))
