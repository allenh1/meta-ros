# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides templates and scripts for creating qt-ros packages      (similar to ros"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native qt-build"
SRC_URI = "https://github.com/yujinrobot-release/qt_ros-release/archive/release/kinetic/qt_create/0.2.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d995be10547f0e9699875e116f9da637"
SRC_URI[sha256sum] = "82967e28e7326c56ff75aea9ebdacfa38baae369e9774f6a0132da793e084d23"
S = "${WORKDIR}/qt_ros-release-release-kinetic-qt_create-0.2.9-0"

inherit catkin
