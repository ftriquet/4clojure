;Write a function which will split a sequence into two parts.
;(= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
;(= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])
;(= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])

(def answer
  (fn [n coll]
    (vector (take n coll) (drop n coll))))

(println (= (answer 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]]))
(println (= (answer 1 [:a :b :c :d]) [[:a] [:b :c :d]]))
(println (= (answer 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]]))
