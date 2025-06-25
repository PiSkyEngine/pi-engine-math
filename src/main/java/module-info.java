/*
 * MIT License
 * 
 * Copyright (c) 2025 Sly Technologies Inc
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/**
 * The {@code pi.engine.math} module provides mathematical foundations for the
 * Pie in the Sky (PI) 3D graphics engine. It includes classes and interfaces
 * for 3D coordinates, shapes, matrices, precision handling, and utility math
 * functions, designed to support 3D graphics applications.
 *
 * <h2>Purpose</h2>
 * This module is a standalone utility library, independent of the PI engine's
 * core functionality, making it reusable in other Java-based projects, such as
 * jMonkeyEngine applications. It provides essential mathematical abstractions
 * for positioning, transformations, and geometric calculations in 3D space.
 *
 * <h2>Exported Packages</h2>
 * <ul>
 *   <li>{@code org.piengine.math}: Core math classes, including matrices
 *       ({@code Matrix1x3}, {@code Matrix4x4}), precision handling ({@code Precision}),
 *       and utility functions ({@code MathUtils}) for trigonometry, quaternions,
 *       and interpolation.</li>
 *   <li>{@code org.piengine.math.coordinates}: Coordinate classes and
 *       interfaces, including {@code Cartesian3D} (with implementations
 *       {@code Cartesian3f}, {@code Cartesian3d}) and {@code Vector3f} for vector
 *       operations (e.g., cross product, normalization).</li>
 *   <li>{@code org.piengine.math.shapes}: Shape classes, such as
 *       {@code Point3D} (with implementations {@code Point3f}, {@code Point3d}),
 *       and planned shapes like {@code Box}, {@code Circle}, and {@code Sphere}
 *       for collision detection and procedural generation.</li>
 * </ul>
 *
 * <h2>Dependencies</h2>
 * <ul>
 *   <li>{@code java.base}: Required for core Java functionality, including
 *       Java 23 features like records and pattern matching (JEP 488).</li>
 *   <li>{@code org.yaml.snakeyaml}: Used for parsing YAML configurations, such
 *       as precision settings for coordinates (optional usage).</li>
 * </ul>
 *
 * <h2>Usage</h2>
 * This module is typically used in conjunction with other PI engine modules,
 * such as {@code pi.game.engine.core}, to provide mathematical support for scene
 * management and rendering. It can also be used independently in other projects
 * requiring 3D math utilities.
 *
 * <h3>Example: Positioning a Scene Node</h3>
 * <pre>
 * import org.piengine.math.coordinates.Cartesian3f;
 * import org.pi.game.engine.core.scene.Scene;
 * import org.pi.game.engine.core.scene.SceneNode;
 *
 * Scene scene = new Scene();
 * SceneNode node = scene.createNode("cube1");
 * node.setPosition(new Cartesian3f(1.0f, 2.0f, 3.0f));
 * </pre>
 *
 * <h2>Version</h2>
 * <ul>
 *   <li><b>Current Version</b>: 0.0.1-SNAPSHOT (as of May 30, 2025)</li>
 * </ul>
 *
 * @since 0.0.1
 */
module org.piengine.math {
	exports org.piengine.math;
	exports org.piengine.math.coordinates;
	exports org.piengine.math.shapes;
}