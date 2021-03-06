# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Convex Decomposition Tool for Robot Model"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native catkin unzip"
SRC_URI = "https://github.com/ros-gbp/convex_decomposition-release/archive/release/lunar/convex_decomposition/0.1.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bc937b26e67b63ec4af37ebdd17172b7"
SRC_URI[sha256sum] = "e556a6673f9bfa83ba4b7a6ee9a46adb0a339497879da49a371b369417fe9276"
S = "${WORKDIR}/convex_decomposition-release-release-lunar-convex_decomposition-0.1.11-0"

inherit catkin
