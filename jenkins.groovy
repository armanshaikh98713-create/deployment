// Hello World in Groovy

def name = "Arman"
def course = "DevOps"

println "Hello, my name is ${name}"
println "I am learning ${course}"

stage ("pulling code"){
    steps
    {
        git branch: 'main',url:https://github.com/armanshaikh98713-create/university-website.git
    }
}