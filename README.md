# PI Engine Math Module

**Version**: 0.0.1-SNAPSHOT  
**Date**: May 30, 2025  
**License**: MIT  

The `pi-engine-math` module is a core component of the [Pie in the Sky (PI) 3D Graphics Engine](https://www.piengine.org), providing essential math-related functionality for 3D graphics development. This module offers a robust set of tools for handling coordinates, shapes, matrices, and mathematical operations, designed to be reusable across projects, including the PI engine and other frameworks like jMonkeyEngine.

## Overview

The `pi-engine-math` module includes:

- **Coordinates**: `Cartesian3D` for 3D positions (`Cartesian3f`, `Cartesian3d` for float and double precision), and `Vector3f` for vector operations.
- **Shapes**: `Point3D` for point shapes, with planned additions like `Box`, `Circle`, and `Sphere`.
- **Matrices**: `Matrix1x3`, `Matrix4x4` for transformations, supporting float and double precision.
- **Precision**: `Precision` interface for type-safe conversions between float and double.
- **Math Functions**: Utilities in `MathUtils` for trigonometry, quaternions, and interpolation.

This module is independent of the PI engine’s core, making it suitable for use in other Java-based projects requiring mathematical abstractions.

## Installation

The `pi-engine-math` module is available on Maven Central. Add it to your project’s `pom.xml`:

```xml
<dependency>
    <groupId>org.piengine</groupId>
    <artifactId>pi-engine-math</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

### Requirements
- **Java**: 23 or higher (with `--enable-preview` for features like StructuredTaskScope).
- **Dependencies**: SnakeYAML (for configuration parsing, optional).

## Usage Examples

### Example 1: Working with 3D Coordinates
Create and manipulate a 3D point using `Cartesian3f`:

```java
import org.piengine.commons.math.coordinates.Cartesian3D;
import org.piengine.commons.math.coordinates.Cartesian3f;

// Create a 3D point at (1, 2, 3)
Cartesian3f point1 = new Cartesian3f(1.0f, 2.0f, 3.0f);
Cartesian3f point2 = new Cartesian3f(4.0f, 5.0f, 6.0f);

// Calculate the distance between two points
double distance = point1.distanceTo(point2);
System.out.println("Distance: " + distance); // Output: Distance: 5.196152422706632
```

### Example 2: Vector Operations
Perform vector operations using `Vector3f`:

```java
import org.piengine.commons.math.coordinates.Vector3f;

// Create two vectors
Vector3f vector1 = new Vector3f(1.0f, 0.0f, 0.0f);
Vector3f vector2 = new Vector3f(0.0f, 1.0f, 0.0f);

// Compute the cross product
Vector3f crossProduct = vector1.cross(vector2);
System.out.println("Cross Product: " + crossProduct.xf() + ", " + crossProduct.yf() + ", " + crossProduct.zf());
// Output: Cross Product: 0.0, 0.0, 1.0
```

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository: `https://github.com/PiSkyEngine/pisky-engine`.
2. Create a branch for your feature (`git checkout -b feature/new-shape`).
3. Commit your changes (`git commit -m "Add new Sphere shape"`).
4. Push to your branch (`git push origin feature/new-shape`).
5. Open a pull request on GitHub.

For more details, see the [Contributing Guide](https://github.com/PiSkyEngine/pisky-engine/wiki/Contributing) in the project wiki.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

```text
MIT License

Copyright (c) 2025 Sly Technologies Inc.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
```

## Links
- **Project Website**: [www.piengine.org](https://www.piengine.org)
- **GitHub Wiki**: [PiSkyEngine/pisky-engine Wiki](https://github.com/PiSkyEngine/pisky-engine/wiki)
- **Repository**: [PiSkyEngine/pisky-engine/pi-engine-math](https://github.com/PiSkyEngine/pisky-engine/tree/main/pi-engine-math)
- **Issue Tracker**: [GitHub Issues](https://github.com/PiSkyEngine/pisky-engine/issues)



---

### **Explanation of the `README.md`**

#### **Structure**
- **Header**: Includes the module name, version (`0.0.1-SNAPSHOT`), date (May 30, 2025, as per current date), and license (MIT).
- **Overview**: Describes the module’s purpose (math-related functionality), key features (coordinates, shapes, matrices, precision, math functions), and its independence for use in other projects (e.g., jMonkeyEngine).
- **Installation**:
  - Provides Maven dependency snippet for `pi-engine-math`.
  - Lists requirements (Java 23 with `--enable-preview`, optional SnakeYAML dependency).
- **Usage Examples**:
  - **Example 1**: Demonstrates creating `Cartesian3f` points and calculating the distance between them, a common use case for 3D coordinates.
    - Output: `5.196152422706632` (distance between `(1, 2, 3)` and `(4, 5, 6)`, calculated as `sqrt((4-1)^2 + (5-2)^2 + (6-3)^2) = sqrt(27)`).
  - **Example 2**: Shows vector operations with `Vector3f`, computing the cross product of two vectors (resulting in a vector perpendicular to both, e.g., `(1, 0, 0)` × `(0, 1, 0) = (0, 0, 1)`).
- **Contributing**: Provides standard GitHub contribution steps, linking to a wiki page for detailed guidelines.
- **License**: Includes the MIT license text, matching the project’s license.
- **Links**:
  - Project website: `www.piengine.org`.
  - GitHub wiki: `https://github.com/PiSkyEngine/pisky-engine/wiki`.
  - Repository path: Assumed as `PiSkyEngine/pisky-engine/pi-engine-math`.
  - Issue tracker: Links to GitHub issues.

#### **Alignment with PI Engine**
- **Module Name**: Reflects the updated `pi-engine-math` name.
- **Packages**: Uses `org.piengine.commons.math.coordinates` and `org.piengine.commons.math.shapes`, as per the specification.
- **Version**: Matches the project version (`0.0.1-SNAPSHOT`).
- **Java 23**: Noted in requirements, with `--enable-preview` for features like StructuredTaskScope.
- **Independence**: Highlighted for use in other projects, supporting your jMonkeyEngine game.

#### **Examples**
- **Cartesian3D Distance**: Shows practical use of coordinates in 3D space, a core feature for positioning in games.
- **Vector3f Cross Product**: Demonstrates vector operations, useful for physics, animations, and transformations.
