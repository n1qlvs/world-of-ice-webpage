// Function to filter animals by search
function filterAnimals() {
    let input = document.getElementById("searchBar").value.toLowerCase();
    let sections = document.querySelectorAll(".animal");

    sections.forEach(section => {
        let text = section.textContent.toLowerCase();
        if (text.includes(input)) {
            section.style.display = "block";
        } else {
            section.style.display = "none";
        }
    });
}

// Quiz Functionality
function checkAnswer(answer) {
    let result = document.getElementById("quizResult");
    if (answer === "white") {
        result.textContent = "Correct! The White Morph Arctic Fox is white in winter.";
        result.style.color = "green";
    } else {
        result.textContent = "Oops! The correct answer is white.";
        result.style.color = "red";
    }
}
