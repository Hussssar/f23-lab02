interface Rectangle {
    // width: number,
    // height: number,
    computeArea: () => number
}

function newRectangle(width: number, height: number): Rectangle {
        // int width,
        // int height,
    return {
        computeArea: function (): number {
            return width * height
        }
    }
}

export { Rectangle, newRectangle }
