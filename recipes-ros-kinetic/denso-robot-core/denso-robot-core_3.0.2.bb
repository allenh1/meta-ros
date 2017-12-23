# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The denso robot core package includes a node for controlling DENSO robot control"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "actionlib actionlib-msgs bcap-core bcap-service catkin-native message-generation message-runtime roscpp std-msgs"
SRC_URI = "https://github.com/DENSORobot/denso_robot_ros-release/archive/release/kinetic/denso_robot_core/3.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0e5ca076af1d52a64a68c0937ecb43c6"
SRC_URI[sha256sum] = "389c2b60686025ee02d4565ea338ffd603bd9db9e26645dc67c0d7969ca501c2"
S = "${WORKDIR}/denso_robot_ros-release-release-kinetic-denso_robot_core-3.0.2-0"

inherit catkin
