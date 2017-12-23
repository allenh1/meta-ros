# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A collection of conversion function for extracting numpy arrays from messages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native geometry-msgs nav-msgs python-numpy rospy sensor-msgs tf"
SRC_URI = "https://github.com/eric-wieser/ros_numpy-release/archive/release/kinetic/ros_numpy/0.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "57e820f1920ad8efbd13a3d6eeae1df9"
SRC_URI[sha256sum] = "90de93f399a745aafbaba926fe30d11de3aa89a5262b536353d84c6a7518e492"
S = "${WORKDIR}/ros_numpy-release-release-kinetic-ros_numpy-0.0.2-0"

inherit catkin
