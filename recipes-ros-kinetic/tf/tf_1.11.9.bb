# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf is a package that lets the user keep track of multiple coordinate frames over"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native geometry-msgs graphviz message-filters message-generation message-runtime rosconsole roscpp rostime roswtf sensor-msgs std-msgs tf2-ros"
SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/kinetic/${PN}/1.11.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "928d6776a2c51064b6e3de7455409a8f"
SRC_URI[sha256sum] = "145ad3bd3c5ea0b4b1ff224c39eb03ba5b719f016609f6960589658a9687f53f"
S = "${WORKDIR}/geometry-release-release-kinetic-${PN}-1.11.9-0"

inherit catkin
