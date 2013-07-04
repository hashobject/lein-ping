(defproject lein-ping "0.1.0"
  :description "Leiningen plugin that pings websites/urls."
  :signing {:gpg-key "HashObject Ltd <team@hashobject.com>"}
  :url "https://github.com/hashobject/lein-ping"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [overtone/at-at "0.0.1"]
                 [clj-http "0.7.2"]]
  :eval-in-leiningen true)
