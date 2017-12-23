# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a number of URDF tutorials."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native joint-state-publisher robot-state-publisher roslaunch rviz xacro"
SRC_URI = "https://github.com/ros-gbp/urdf_tutorial-release/archive/release/kinetic/urdf_tutorial/0.3.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5b5a02c5ce3c9a34785fbd48d71ca8bc"
SRC_URI[sha256sum] = "89e82ba00a356de1c0279e00ff4f1c4b98600de375d50311b5e898af00c48a00"
S = "${WORKDIR}/urdf_tutorial-release-release-kinetic-urdf_tutorial-0.3.0-1"

inherit catkin
