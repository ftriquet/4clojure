;Write a function which removes consecutive duplicates from a sequence.
;(= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
;(= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
;(= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))

(def answer
  (fn [s]
    (reverse
      (loop [res  '()
             s    s]
        (if (empty? s)
          res
          (if (= (first res) (first s))
            (recur res (rest s))
            (recur (cons (first s) res) (rest s))))))))

(println (= (apply str (answer "Leeeeeerrroyyy")) "Leroy"))
(println (= (answer [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
(println (= (answer [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])))

