# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "message_to_tf translates pose information from different kind of common_msgs mes"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs nav-msgs roscpp sensor-msgs tf topic-tools"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_localization-release/archive/release/kinetic/message_to_tf/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3cdef72409fd2496fbd99d6afc8cd1f9"
SRC_URI[sha256sum] = "8074a5e21accd7b79eccb72a80a6d033ed39299d0368d9185b8f2e0d23a65c35"
S = "${WORKDIR}/hector_localization-release-release-kinetic-message_to_tf-0.3.0-0"

inherit catkin
