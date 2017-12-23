# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Simple navigation package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native geometry-msgs move-base-msgs nav-core roscpp sensor-msgs std-msgs tf2 tf2-geometry-msgs tf2-ros visualization-msgs"
SRC_URI = "https://github.com/UbiquityRobotics-release/move_basic-release/archive/release/kinetic/move_basic/0.2.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b158d4dcbd46b4f9378b1b2eca7250c9"
SRC_URI[sha256sum] = "7472b29f0a6bdd261c457dff6282bc5869039386c9181e9e51a3c9c0c5600cf2"
S = "${WORKDIR}/move_basic-release-release-kinetic-move_basic-0.2.2-1"

inherit catkin
