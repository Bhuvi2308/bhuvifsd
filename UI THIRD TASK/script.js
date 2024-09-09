const app = document.getElementById('calc');


// Create the calculator container
const calculator = document.createElement('div');
calculator.id = 'calculator';
calculator.classList.add('bg-light');

// Create display
const display = document.createElement('div');
display.id = 'display';
display.innerText = '0';  // Default value
calculator.appendChild(display);

// Button labels 
const buttons = [
    'C', '←', '%', '×',
    '7', '8', '9', '/',
    '4', '5', '6', '-',
    '1', '2', '3', '+',
    '0', '00', '.', '='
    
];

// Create buttons with different styles based on label
buttons.forEach(label => {
    const button = document.createElement('button');
    button.className = 'btn btn-light border';  // Basic Bootstrap styles
    button.innerText = label;

    // Applied background color based on button label
    if (label === 'C') {
        button.classList.add('btn-clear');  // Clear button
    } else if (label === '←') {
        button.classList.add('btn-backspace');  // Backspace button
    } else if (label === '=') {
        button.classList.add('btn-equals');  // Equals button 
    } else if (['+', '-', '×', '/', '%'].includes(label)) {
        button.classList.add('btn-operator');  // Operator buttons
    } else if (label === '.') {
        button.classList.add('btn-dot');  // Dot button
    } else {
        button.classList.add('btn-number');  // Number buttons
    }

    // Handled button click
    button.addEventListener('click', () => handleButtonClick(label));
    calculator.appendChild(button);
});

// Append the calculator to the app div
app.appendChild(calculator);

// Functionality for button clicks
function handleButtonClick(label) {
    if (!isNaN(label)) {  // Number
        if (display.innerText === '0') {
            display.innerText = label;
        } else {
            display.innerText += label;
        }
    } else if (label === 'C') {  // Clear
        display.innerText = '0';
    } else if (label === '←') {  // Backspace
        display.innerText = display.innerText.slice(0, -1) || '0';
    } else if (label === '=') {  // Evaluate
        try {
            const result = eval(display.innerText.replace('×', '*').replace('÷', '/'));
            display.innerText = result;
        } catch {
            display.innerText = 'Error';
        }
    } else {
        display.innerText += label;
    }

    // Keyboard event listener
    document.addEventListener('keydown', (event) => {
        const key = event.key;
        if (!isNaN(key)) {
            handleButtonClick(key);
        } else if (key === 'Backspace') {
            handleButtonClick('←');
        } else if (key === 'Enter') {
            handleButtonClick('=');
        } else if (['+', '-', '*', '/'].includes(key)) {
            handleButtonClick(key);
        } else {
            alert('Only numbers are allowed!');
        }
    });
}