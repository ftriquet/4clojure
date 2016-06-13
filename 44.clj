;Write a function which can rotate a sequence in either direction.
;(= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2))
;(= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3))
;(= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1))
;(= (__ 1 '(:a :b :c)) '(:b :c :a))
;(= (__ -4 '(:a :b :c)) '(:c :a :b))

(def answer
  (fn [n coll]
    (let [get-pos #(loop [c %]
                     (if (and (> c 0) (< c (count coll)))
                       c
                       (recur (+ c (if  (< c (count coll)) (count coll) (- 0 (count coll)))))))
          pos (get-pos n)]
      (concat (drop pos coll) (take pos coll)))))

(println (= (answer 2 [1 2 3 4 5]) '(3 4 5 1 2)))
(println (= (answer -2 [1 2 3 4 5]) '(4 5 1 2 3)))
(println (= (answer 6 [1 2 3 4 5]) '(2 3 4 5 1)))
(println (= (answer 1 '(:a :b :c)) '(:b :c :a)))
(println (= (answer -4 '(:a :b :c)) '(:c :a :b)))
