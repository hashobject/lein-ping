(defproject lein-ping "0.1.0"
  :description "Leiningen plugin that pings websites/urls."
  :signing {:gpg-key "Hashobject Ltd <team@hashobject.com>"}
  :url "https://github.com/hashobject/lein-ping"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [overtone/at-at "1.2.0"]
                 [clj-http "1.0.1"]]
  :eval-in-leiningen true)
